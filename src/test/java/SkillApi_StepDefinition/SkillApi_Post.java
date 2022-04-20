package SkillApi_StepDefinition;

import static io.restassured.RestAssured.given;

import java.io.File;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.restassured.module.jsv.JsonSchemaValidator;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
//import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

import org.json.simple.JSONObject;
import org.junit.Assert;

import com.poiji.bind.Poiji;
import com.poiji.option.PoijiOptions;

import extendsclass.poiji_read;

//import com.poiji.bind.Poiji;

//import com.poiji.option.PoijiOptions;

import extendsclass.postskillapi_testdata;

public class SkillApi_Post {

	private Response response;
	private ValidatableResponse json;
	private RequestSpecification request;
	static String uname = "APIPROCESSING";
	static String pword = "2xx@Success";
	static String url = "https://springboot-lms-userskill.herokuapp.com/Skills/";
	String xread;
	private ResponseBody body;
	poiji_read read = new poiji_read();
	

	/*
	 * @Given("User set input values with Valid Authorization") public void
	 * user_set_input_values_with_Valid_Authorization(postskillapi_testdata skill) {
	 * input.excelread(); System.out.println(skill.getSkill()); JSONObject reqest =
	 * new JSONObject(); reqest.put("skill_name", skill.getSkill()); request =
	 * given().auth().basic(uname,
	 * pword).contentType("application/json").body(reqest.toJSONString()); }
	 */

	@Given("User set body from sheetname {string} and rownum {int}")
	public void user_set_body_from_sheetname_and_rownum(String string, Integer int1) {
		PoijiOptions options = PoijiOptions.PoijiOptionsBuilder.settings().sheetName(string).build();
		List<postskillapi_testdata> vskill = Poiji.fromExcel(new File(
				"C:\\Users\\skuma\\eclipse-workspace\\RestAPICucumberBdd\\src\\test\\resources\\TestData\\ApiBdd.xls"),
				postskillapi_testdata.class, options);
		xread = vskill.get(int1).getSkill();

		JSONObject reqest = new JSONObject();
		reqest.put("skill_name", xread);
		request = given().auth().basic(uname, pword).contentType("application/json").body(reqest.toJSONString()).log()
				.all();

	}

	@When("User send POST request")
	public void user_send_POST_request() {
		response = request.when().post(url);

	}

	@Then("It should display created record with status code")
	public void it_should_display_created_record_with_status_code() {

		int scode = response.getStatusCode();

		if (scode == 201) {
			json = response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(new File(
					"C:\\Users\\skuma\\eclipse-workspace\\RestAPICucumberBdd\\Schema\\skillApischema_post.json")))
					.statusCode(201).log().all();
			System.out.println("sucessfully created: " + scode);
			System.out.println("Schema for created passed : POST");

			String Skillid = response.jsonPath().getString("skill_id");

			// DataBase Validation
			response = request.when().get(url);

			// Get Response Body
			body = response.getBody();

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
			System.out.println("Schema for already exist passed : POST");

			// DataBase Validation
			response = request.when().get(url);

			// Get Response Body
			body = response.getBody();

			// Get Response Body as String
			String bodyStringValue = body.asString();
			// Validate if Response Body Contains a specific String
			Assert.assertTrue(bodyStringValue.contains(xread));
			System.out.println("Body contains: " + xread);
			System.out.println("*******************************************************");

		} else if (scode == 404) {
			json = response.then().log().all();
			System.out.println("Not a valid input: " + scode);
			System.out.println("Schema for invalid input passed : POST");
			// System.out.println("*****************************************************");
		}

	}

}
