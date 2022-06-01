package UserSkill_StepDefinition_Bdd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Us_Post_request {
	@Given("User select POST Request with Valid JASON")
	public void user_select_post_request_with_valid_jason() {
	    System.out.println("Step 1 : User select POST request with Valid JASON Data");  
	}

	@When("User send POST request")
	public void user_send_post_request() {
		System.out.println("Step 2 : User Sends POST request");
	   
	}

	@Then("It should display created record with status Code")
	public void it_should_display_created_record_with_status_code() {
		System.out.println("Step 3 : It display created record details with status code");
	}

	@Given("User select POST Request with Valid JASON and incorrect Endpoints")
	public void user_select_post_request_with_valid_jason_and_incorrect_endpoints() {
		System.out.println("Step 1 : User select POST request : Incorrect Endpoint");
	}

	@Then("It should display error message incorrect endpoint with status Code")
	public void it_should_display_error_message_incorrect_endpoint_with_status_code() {
		System.out.println("Step 3 : It should display error message Incorrect Endpoint with Satus code");
	  
	}

	@Given("User select POST Request with Valid JASON and incorrect data")
	public void user_select_post_request_with_valid_jason_and_incorrect_data() {
		System.out.println("Step 1 : User select POST request : Incorrect JASON DATA");
	}

	@Then("It should display display error message incorrect data with status Code")
	public void it_should_display_display_error_message_incorrect_data_with_status_code() {
		System.out.println("Step 3 : It should display error message Incorrect JASON Data with Satus code");
	   	}

	@Given("User select POST Request when server is down")
	public void user_select_post_request_when_server_is_down() {
		System.out.println("Step 1 : User select POST request : Server Down");
	    
	}

	@Then("It should display display message Server Down with status Code")
	public void it_should_display_display_message_server_down_with_status_code() {
		System.out.println("Step 3 : It should display error message Server Down");
	    
	}


}
