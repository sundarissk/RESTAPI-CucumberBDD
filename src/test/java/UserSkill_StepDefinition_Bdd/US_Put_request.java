package UserSkill_StepDefinition_Bdd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_Put_request {
	@Given("User select PUT Request with Valid JSON Data")
	public void user_select_put_request_with_valid_json_data() {
	   System.out.println("Step 1 : User send PUT request with valid JSON Data");
	}

	@When("User send PUT request")
	public void user_send_put_request() {
		System.out.println("Step 2 : User send PUT request");
	}

	@Then("It should display updated record details with status code")
	public void it_should_display_updated_record_details_with_status_code() {
		System.out.println("Step 3 : Display Updated record details with status code");
	}

	@Given("User select PUT Request with Incorrect Endpoints")
	public void user_select_put_request_with_incorrect_endpoints() {
		System.out.println("Step 1 : User send PUT request with Incorrect Endpoints");
	}

	@Given("User select PUT Request with Incorrect JSON Data")
	public void user_select_put_request_with_incorrect_json_data() {
		System.out.println("Step 1 : User send PUT request with Incorrect JSON Data");
	}

	@Given("User select PUT Request when server is down")
	public void user_select_put_request_when_server_is_down() {
		System.out.println("Step 1 : User send PUT request when Server is Down");
	}
	
	
	@Then("It should display error message Incorrect Endpoints with status code")
	public void it_should_display_error_message_incorrect_endpoints_with_status_code() {
		System.out.println("Step 3 : User Cann't send PUT request : Incorrect Endpoints");
	}

	@Then("It should display error message Incorrect JSON Data with status code")
	public void it_should_display_error_message_incorrect_json_data_with_status_code() {
		System.out.println("Step 3 : User Cann't send PUT request : Incorrect JSON Data");
	}

	@Then("It should display message Server Down with status Code")
	public void it_should_display_message_server_down_with_status_code() {
		System.out.println("Step 3 : User Cann't send PUT request : Server Down");
	}
}
