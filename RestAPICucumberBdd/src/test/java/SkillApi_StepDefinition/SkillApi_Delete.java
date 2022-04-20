package SkillApi_StepDefinition;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class SkillApi_Delete {
	private Response response;
	private ValidatableResponse json;
	private RequestSpecification request;
	static String uname = "APIPROCESSING";
	static String pword = "2xx@Success";
	static String url = "https://springboot-lms-userskill.herokuapp.com/Skills/";
	static String endpoint = "23";

	@Given("User select DELETE Request with Valid Authorization")
	public void user_select_DELETE_Request_with_Valid_Authorization() {
		request = given().auth().basic(uname, pword);
	}

	@When("User send DELETE request")
	public void user_send_DELETE_request() {
		response = request.when().delete(url + endpoint);
	}

	@Then("It should display dleted details with status code")
	public void it_should_display_dleted_details_with_status_code() {

		int scode = response.getStatusCode();

		if (scode == 200) {
			json = response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(new File(
					"C:\\Users\\skuma\\eclipse-workspace\\RestAPICucumberBdd\\Schema\\skillApischema_delete.json")))
					.statusCode(200)
					// .body(JsonSchemaValidator.matchesJsonSchema(new File(schema)))
					.log().all();
			System.out.println("sucessfully deleted: " + scode);
			System.out.println("Schema for Delete passed : DELETE");

			response = request.when().get(url);

			// Get Response Body
			ResponseBody body = response.getBody();

			// Get Response Body as String
			String bodyStringValue = body.asString();
			// Validate if Response Body Contains a specific String
			Assert.assertTrue(bodyStringValue.contains(endpoint));
			System.out.println("Record found and Deleted, not in Res.Body : " + endpoint);
			System.out.println("*******************************************************");

		} else if (scode == 404) {
			json = response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(new File(
					"C:\\Users\\skuma\\eclipse-workspace\\RestAPICucumberBdd\\Schema\\skillApischma_delete_inp.json")))
					.statusCode(404)
					// .body(JsonSchemaValidator.matchesJsonSchema(new File(schema)))
					.log().all();
			System.out.println("record not found: " + scode);
			System.out.println("Schema for not found passed : DELETE");

			// DataBase Checking

			response = request.when().get(url);

			// Get Response Body
			ResponseBody body = response.getBody();

			// Get Response Body as String
			String bodyStringValue = body.asString();
			// Validate if Response Body Contains a specific String
			Assert.assertTrue(bodyStringValue.contains(endpoint));
			System.out.println("Body Doesn'tcontains: " + endpoint);

			System.out.println("****************************************************");
		} else {
			json = response.then().log().all();
			System.out.println("Not a valid input: " + scode);
			System.out.println("*****************************************************");
		}

	}

}
