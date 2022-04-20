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
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

/*UserSkillMap - Put
 find details from Get method
1.UserSkill id --> userskillmapApi
2. User_id --> userskillmapApi
3. Skill_id --> userskillmapApi
only month of exp can update in put 
so skillId and User ID should exist, it use input from other 2 Api,*/

public class UserSkillMap_Put {
	private Response response;
	private ValidatableResponse json;
	private RequestSpecification request;

	static String url = "https://springboot-lms-userskill.herokuapp.com/UserSkills/";

	
	
	@Given("User select PUT Request with username {string} password {string} mep {int} userid {string} skillid {int}")
	public void user_select_PUT_Request_with_username_password_mep_userid_skillid(String string, String string2, Integer int1, String string3, Integer int2) {
		JSONObject reqest = new JSONObject();
		reqest.put("months_of_exp", int1);
		reqest.put("user_id", string3);
		reqest.put("skill_id", int2);
		System.out.println(reqest.toJSONString());

		request = given().auth().basic(string, string2).contentType("application/json").body(reqest.toJSONString());
	}



	@When("User send PUT request with userskillid {string}")
	public void user_send_PUT_request_with_userskillid(String string) {
		response = request.when().put(url + string);
	}

	@Then("It should display updated details with status code in UserSkill")
	public void it_should_display_updated_details_with_status_code_in_UserSkill() {
		int scode = response.getStatusCode();

		if (scode == 201) {
			json = response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(new File(
					"C:\\Users\\skuma\\eclipse-workspace\\RestAPICucumberBdd\\Schema\\UserSkillMapPutCreated.json")))
					.statusCode(201).log().all();
			System.out.println("sucessfully created: " + scode);
			System.out.println("Schema for Created Passed : PUT");
		} 
		else if (scode == 404){
			json = response.then().body(JsonSchemaValidator.matchesJsonSchema(
					new File("C:\\Users\\skuma\\eclipse-workspace\\RestAPICucumberBdd\\Schema\\UserSkillMapPutNotFound.json"))).statusCode(404).log().all();
			System.out.println("Not Found : " + scode);
			System.out.println("Schema for Not Found Passed : PUT");
		}
	}

}
