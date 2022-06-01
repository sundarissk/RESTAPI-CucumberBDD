package UserSkill_StepDefinition_Bdd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_Get_request {
	@Given("User select GET Request without Authorization")
	public void user_select_get_request_without_authorization() {
	    System.out.println("Step 1 : User cann't send GET request : without Authorization");
	}

	@When("User send GET request")
	public void user_send_get_request() {
		System.out.println("Step 2 : User send GET Request");
	}

	@Then("It should display an error message with status code")
	public void it_should_display_an_error_message_with_status_code() {
		System.out.println("Step 3 :It Display Error Message with Status Code");
	}

	@Given("User select GET Request with Valid Authorization and valid endpoints")
	public void user_select_get_request_with_valid_authorization_and_valid_endpoints() {
		 System.out.println("Step 1 : User Having Valid Login details to send GET Request");
	    
	}

	@Then("It should display details with status code")
	public void it_should_display_details_with_status_code() {
		 System.out.println("Step 3 : It Display record details as per request");  
	}

	@Given("User select GET Request with Valid Authorization and Invalid endpoints")
	public void user_select_get_request_with_valid_authorization_and_invalid_endpoints() {
		 System.out.println("Step 1 : User cann't send GET request with invalid Endpoints");
	}

	@Then("It should display error message with status code")
	public void it_should_display_error_message_with_status_code() {
		System.out.println("Step 3 : It Display Error Message with Status Code");
	   
	}

	@Given("User select GET Request with Valid Authorization with Invalid credential and valid endpoints")
	public void user_select_get_request_with_valid_authorization_with_invalid_credential_and_valid_endpoints() {
		 System.out.println("Step 1 : User cann't send GET request with invalid credential");
	}

	@Given("User select GET Request with Valid Authorization")
	public void user_select_get_request_with_valid_authorization() {
		System.out.println("Step 1 : User send GET request sucessfully");
	    
	}
	@Given("User select GET Request with Valid Authorization Server Down")
	public void user_select_get_request_with_valid_authorization_server_down() {
		System.out.println("Step 1 : Server Down");   
	}

}
