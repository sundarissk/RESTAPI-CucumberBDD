package SkillApi_StepDefinition;

import static io.restassured.RestAssured.given;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
//import static org.hamcrest.CoreMatchers.hasItems;

import java.io.File;

//import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class SkillApi_GetId {

	private Response response;
	private ValidatableResponse json;
	private RequestSpecification request;
	static String uname = "APIPROCESSING";
	static String pword = "2xx@Success";
	static String url = "https://springboot-lms-userskill.herokuapp.com/Skills/";
	static int endpoint = 311;
	static String schema = "C:\\Users\\skuma\\eclipse-workspace\\RestAPICucumberBdd\\Schema\\schema2.json";

	@Given("User select GETID Request with Valid Authorization")
	public void user_select_GETID_Request_with_Valid_Authorization() {
		request = given().auth().basic(uname, pword); // .contentType(ContentType.JSON);

	}

	@When("User send GETID request")
	public void user_send_GETID_request() {
		response = request.when().get(url + endpoint);
	}

	@Then("It should display paritcular detail with status code")
	public void it_should_display_paritcular_detail_with_status_code() {

		int scode = response.getStatusCode();

		if (scode == 200) {
			json = response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(new File(
					"C:\\\\Users\\\\skuma\\\\eclipse-workspace\\\\RestAPICucumberBdd\\\\Schema\\\\skillApischema_getId.json")))
					.statusCode(200).log().all();
			System.out.println("sucessfully created: " + scode);
			System.out.println("Schema for Created Passed : GETID");
			System.out.println("*****************************************************");
		} else if (scode == 404) {
			json = response.then().body(JsonSchemaValidator.matchesJsonSchema(new File(
					"C:\\Users\\skuma\\eclipse-workspace\\RestAPICucumberBdd\\Schema\\skillApischema_getIdNotFound.json")))
					.statusCode(404).log().all();
			System.out.println("Not Found : " + scode);
			System.out.println("Schema for Not Found Passed : GETID");
			System.out.println("*****************************************************");
		}
	}

}
