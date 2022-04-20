package SkillApi_StepDefinition;

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

public class SkillApi_Put {
	private Response response;
	private ValidatableResponse json;
	private RequestSpecification request;
	static String uname = "APIPROCESSING";
	static String pword = "2xx@Success";
	static String url = "https://springboot-lms-userskill.herokuapp.com/Skills/";
	private String svalue;
	// static int endpoint = 207;

	@Given("User select PUT Request with Skill {string}")
	public void user_select_PUT_Request_with_Skill(String string) {
		svalue = string;
		JSONObject reqest = new JSONObject();
		reqest.put("skill_name", string);
		request = given().auth().basic(uname, pword).contentType("application/json").body(reqest.toJSONString());
	}

	@When("User send PUT request with {int}")
	public void user_send_PUT_request_with(Integer int1) {
		response = request.when().put(url + int1);
	}

	@Then("It should display updated details with status code")
	public void it_should_display_updated_details_with_status_code() {
		int scode = response.getStatusCode();
		if (scode == 201) {
			json = response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(new File(
					"C:\\Users\\skuma\\eclipse-workspace\\RestAPICucumberBdd\\Schema\\skillApischema_put.json")))
					.statusCode(201).log().all();
			System.out.println("sucessfully created: " + scode);
			System.out.println("Schema for Update passed : PUT");
			
			String Skillid = response.jsonPath().getString("skill_id");

			// DataBase Validation
			response = request.when().get(url);

			// Get Response Body
			ResponseBody body = response.getBody();

			// Get Response Body as String
			String bodyStringValue = body.asString();
			// Validate if Response Body Contains a specific String
			Assert.assertTrue(bodyStringValue.contains(Skillid));
			System.out.println("Body contains: " + Skillid);
			System.out.println("*******************************************************");

		} else if (scode == 400) {
			json = response.then().assertThat()
					.body(JsonSchemaValidator.matchesJsonSchema(
							new File("C:\\Users\\skuma\\eclipse-workspace\\RestAPICucumberBdd\\Schema\\post_ine.json")))
					.statusCode(400).log().all();
			System.out.println("Record already exist cant add duplicate: " + scode);
			System.out.println("Schema for already exist passed : PUT");

			// DataBase Validation
			response = request.when().get(url);

			// Get Response Body
			ResponseBody body = response.getBody();

			// Get Response Body as String
			String bodyStringValue = body.asString();
			// Validate if Response Body Contains a specific String
			Assert.assertTrue(bodyStringValue.contains(svalue));
			System.out.println("Body contains: " + svalue);
			System.out.println("*******************************************************");

		} else if (scode == 404) {
			json = response.then().log().all();
			System.out.println("Not a valid input: " + scode);
			System.out.println("Schema for invalid input passed : PUT");
			// System.out.println("*****************************************************");
		}

	}

}
