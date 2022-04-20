package UserSkillMap_StepDefinition;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.json.simple.JSONObject;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

/*UserSkillMap - Post
1. SkillId : Skills API 
2. UserID : Users API
only month of exp can add in post 
so skillId and User ID should exist, it use input from other 2 Api */

public class UserSkillMap_Post {
	private Response response;
	private ValidatableResponse json;
	private RequestSpecification request;
	private String uid;

	static String url = "https://springboot-lms-userskill.herokuapp.com/UserSkills";

	@Given("User select POST Request with username {string} password {string} moe {int} skillid {int} userid {string}")
	public void user_select_POST_Request_with_username_password_moe_skillid_userid(String string, String string2,
			Integer int1, Integer int2, String string3) {
		JSONObject reqest = new JSONObject();
		reqest.put("months_of_exp", int1);
		reqest.put("skill_id", int2);
		reqest.put("user_id", string3);
		uid = string3;
		request = given().auth().basic(string, string2).contentType("application/json").body(reqest.toJSONString());
	}

	@When("User send POST request in Userskill")
	public void user_send_POST_request_in_Userskill() {
		response = request.when().post(url);
	}

	@Then("It should display created detail with status code in UserSkill")
	public void it_should_display_created_detail_with_status_code_in_UserSkill() {
		int scode = response.getStatusCode();

		if (scode == 201) {
			json = response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(new File(
					"C:\\Users\\skuma\\eclipse-workspace\\RestAPICucumberBdd\\Schema\\UserSkillMapPostCreated.json")))
					.statusCode(201).log().all();
			System.out.println("sucessfully created: " + scode);
			System.out.println("Schema for Created Passed : POST");

			// DataBase Validation
			response = request.when().get(url);

			// Get Response Body
			ResponseBody body = response.getBody();

			// Get Response Body as String
			String bodyStringValue = body.asString();
			// Validate if Response Body Contains a specific String
			Assert.assertTrue(bodyStringValue.contains(uid));

			System.out.println("Body contains: " + uid);
			System.out.println("*******************************************************");
		} else if (scode == 400) {
			json = response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(new File(
					"C:\\Users\\skuma\\eclipse-workspace\\RestAPICucumberBdd\\Schema\\UserSkillMapPostNotFound.json")))
					.statusCode(400).log().all();
			System.out.println("Record already exist cant add duplicate: " + scode);
			System.out.println("Schema for already exist Passed : POST");

			// DataBase Validation
			response = request.when().get(url);

			// Get Response Body
			ResponseBody body = response.getBody();

			// Get Response Body as String
			String bodyStringValue = body.asString();
			// Validate if Response Body Contains a specific String
			Assert.assertTrue(bodyStringValue.contains(uid));

			System.out.println("Body contains: " + uid);
			System.out.println("*******************************************************");
		} else if (scode == 404) {
			json = response.then().body(JsonSchemaValidator.matchesJsonSchema(new File(
					"C:\\Users\\skuma\\eclipse-workspace\\RestAPICucumberBdd\\Schema\\UserSkillMapPostInvalidData.json")))
					.statusCode(404).log().all();
			System.out.println("Not a valid input: " + scode);
			System.out.println("Schema for Invalid input Passed : POST");
		}

	}
}
