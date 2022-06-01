package UserSkill_StepDefinition_Bdd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_Delete_request {
	@Given("User select DELETE Request with Exisitng ID")
	public void user_select_delete_request_with_exisitng_id() {
	   System.out.println("Step 1 : User Request to Delete Particular Record");
	}

	@When("User send DELETE request")
	public void user_send_delete_request() {
		System.out.println("Step 2 : User Send Delete Request");
	   
	}

	@Then("It should display No Content with status Code")
	public void it_should_display_no_content_with_status_code() {
		System.out.println("Step 3 : Successfully Deleted");
	}

	@Given("User select DELETE Request with Non Exsiitng ID")
	public void user_select_delete_request_with_non_exsiitng_id() {
		System.out.println("Step 1 : User send Delete request with invalid record ID");
	}

	@Then("It should display error message Record Not Found with status Code")
	public void it_should_display_error_message_record_not_found_with_status_code() {
		System.out.println("Step 3 : Record Not Found");
	}

	@Given("User select DELETE Request with Invalid Endpoints")
	public void user_select_delete_request_with_invalid_endpoints() {
		System.out.println("Step 1 : User send Delete Request with Invalid Endpoints");
	}

	@Then("It should display error message incorrect Endpints with status Code")
	public void it_should_display_error_message_incorrect_endpints_with_status_code() {
		System.out.println("Step 3 : USer cann't send Delete request with incorrect Endpoint");
	}

	@Given("User select DELETE Request when server is down")
	public void user_select_delete_request_when_server_is_down() {
		System.out.println("Step 1 : User send Delete request when Server Down");
	
	}


}
