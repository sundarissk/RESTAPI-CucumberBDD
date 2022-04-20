package SkillApi_StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.restassured.http.ContentType;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

import java.io.File;

import io.restassured.specification.RequestSpecification;

public class SkillApisd_Get {
	private Response response;
	private ValidatableResponse json;
	private RequestSpecification request;

	@Given("User select GET Request with Valid Authorization")
	public void user_select_GET_Request_with_Valid_Authorization() {
		request = given().auth().basic("APIPROCESSING", "2xx@Success").contentType(ContentType.JSON);
	}

	@When("User send GET request")
	public void user_send_GET_request() {

		response = request.when().get("https://springboot-lms-userskill.herokuapp.com/Skills");
	}

	@Then("It should display details with status code")
	public void it_should_display_details_with_status_code() {
		json = response.then().assertThat()
				.body(JsonSchemaValidator.matchesJsonSchema(
						new File("C:\\Users\\skuma\\eclipse-workspace\\RestAPICucumberBdd\\Schema\\skillApischema_get.json"))).statusCode(200)
				.log().all();
		//System.out.println(json);
		int scode =	response.getStatusCode();  
		System.out.println("Status Code :" +scode);
		System.out.println("Schema for Get All Records Passed : GET");
		//response.getBody();
		System.out.println("*****************************************************");
		
	}

}
