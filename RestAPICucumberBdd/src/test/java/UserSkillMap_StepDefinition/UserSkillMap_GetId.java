package UserSkillMap_StepDefinition;

import static io.restassured.RestAssured.given;

import java.io.File;

/*UserSkillMap - GetID
1. user_skill_id --> User Skill Map API 
should exist in UserSkillMap, it get record from own Api
*/

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class UserSkillMap_GetId {
	private Response response;
	private ValidatableResponse json;
	private RequestSpecification request;
	String url = "https://springboot-lms-userskill.herokuapp.com/UserSkills/";
	String endpoints = "US2211";

	@Given("User select GETID Request with username {string} and password {string}")
	public void user_select_GETID_Request_with_username_and_password(String string, String string2) {
		request = given().auth().basic(string, string2);
	}

	@When("User send GETID request in UserSkill")
	public void user_send_GETID_request_in_UserSkill() {
		response = request.when().get(url + endpoints);
	}

	@Then("It should display paritcular detail with status code in UserSkill")
	public void it_should_display_paritcular_detail_with_status_code_in_UserSkill() {
		
		int scode = response.getStatusCode();

		if (scode == 200) {
			json = response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(new File(
					"C:\\\\Users\\\\skuma\\\\eclipse-workspace\\\\RestAPICucumberBdd\\\\Schema\\\\UserSkillMapGetID.json")))
					.statusCode(200).log().all();
			System.out.println("sucessfully created: " + scode);
			System.out.println("Schema for Created Passed : GETID");
			System.out.println("*****************************************************");
		} 
		else if (scode == 404){
			json = response.then().body(JsonSchemaValidator.matchesJsonSchema(
					new File("C:\\Users\\skuma\\eclipse-workspace\\RestAPICucumberBdd\\Schema\\UserSkillMapGetIdNotFound.json"))).statusCode(404).log().all();
			System.out.println("Not Found : " + scode);
			System.out.println("Schema for Not Found Passed : GETID");
			System.out.println("*****************************************************");
			
		}
	}
}
