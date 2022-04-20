package UserSkillMap_StepDefinition;

import static io.restassured.RestAssured.given;

import java.io.File;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class UserSkillMap_Get {
	private Response response;
	private ValidatableResponse json;
	private RequestSpecification request;
	
	@Given("User select GET Request with basic auth username {string} and password {string} in UserSkill")
	public void user_select_GET_Request_with_basic_auth_username_and_password_in_UserSkill(String string, String string2) {
		request = given().auth().basic("APIPROCESSING", "2xx@Success");
	}
	@When("User send GET request in UserSkill")
	public void user_send_GET_request_in_UserSkill() {
		response = request.when().get("https://springboot-lms-userskill.herokuapp.com/UserSkills");
	}

	@Then("It should display all details with status code in UserSkill")
	public void it_should_display_all_details_with_status_code_in_UserSkill() {
		json = response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(
				new File("C:\\Users\\skuma\\eclipse-workspace\\RestAPICucumberBdd\\Schema\\UserSkillMapGet.json"))).statusCode(200)
				.log().all();
		//System.out.println(json);
		System.out.println("Schema Validation Passed : GET");
		int scode =	response.getStatusCode();  
		System.out.println("Status Code :" +scode);
		System.out.println("*****************************************************");
		//response.getBody();
	}

}
