package UserSkillMap_StepDefinition;

import static io.restassured.RestAssured.given;

import java.io.File;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

/*
UserSkillMap - Delete
 1. user_skill_id -> User Skill Map API 
should exist in UserSkillMap, it delete record from own Api ,*/

public class UserSkillMap_Delete {
	private Response response;
	private ValidatableResponse json;
	private RequestSpecification request;
	
	static String url = "https://springboot-lms-userskill.herokuapp.com/UserSkills/";
	
	@Given("User select DELETE Request with username {string} password {string}")
	public void user_select_DELETE_Request_with_username_password(String string, String string2) {
		request = given().auth().basic(string, string2);
	}

	@When("User send DELETE request in UserSkill with usersid {string}")
	public void user_send_DELETE_request_in_UserSkill_with_usersid(String string) {
		response = request.when().delete(url + string); 
	}



	@Then("It should display dleted details with status code in UserSkill")
	public void it_should_display_dleted_details_with_status_code_in_UserSkill() {
		int scode = response.getStatusCode();

		if (scode == 200) {
			json = response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(new File(
					"C:\\Users\\skuma\\eclipse-workspace\\RestAPICucumberBdd\\Schema\\UserSkillMapDelete.json")))
					.statusCode(200)
					// .body(JsonSchemaValidator.matchesJsonSchema(new File(schema)))
					.log().all();
			System.out.println("sucessfully deleted: " +scode);
			System.out.println("Schema for Delete passed : DELETE");
			System.out.println("*****************************************************");
		} else if (scode == 404) {
			json = response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(new File(
					"C:\\Users\\skuma\\eclipse-workspace\\RestAPICucumberBdd\\Schema\\UserSkillMapDeleteNotFound.json")))
					.statusCode(404)
					// .body(JsonSchemaValidator.matchesJsonSchema(new File(schema)))
					.log().all();
			System.out.println("record not found: " + scode);
			System.out.println("Schema for not found passed : DELETE");
			System.out.println("*****************************************************");
		}else 
		{
			json = response.then().log().all();
			System.out.println("Not a valid input: " +scode);
			System.out.println("*****************************************************");
		}

	}


}
