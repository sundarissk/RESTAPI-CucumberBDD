$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/UserSkillFeature_bdd/US_Delete_Request.feature");
formatter.feature({
  "name": "Validate and Test DELETE Request in UserSkill Mapping API",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "check whether can able to DELETE records",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User select DELETE Request with Exisitng ID",
  "keyword": "Given "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Delete_request.user_select_delete_request_with_exisitng_id()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User send DELETE request",
  "keyword": "When "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Delete_request.user_send_delete_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should display No Content with status Code",
  "keyword": "Then "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Delete_request.it_should_display_no_content_with_status_code()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "check whether can able to DELETE records",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User select DELETE Request with Non Exsiitng ID",
  "keyword": "Given "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Delete_request.user_select_delete_request_with_non_exsiitng_id()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User send DELETE request",
  "keyword": "When "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Delete_request.user_send_delete_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should display error message Record Not Found with status Code",
  "keyword": "Then "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Delete_request.it_should_display_error_message_record_not_found_with_status_code()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "check whether can able to DELETE records",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User select DELETE Request with Invalid Endpoints",
  "keyword": "Given "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Delete_request.user_select_delete_request_with_invalid_endpoints()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User send DELETE request",
  "keyword": "When "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Delete_request.user_send_delete_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should display error message incorrect Endpints with status Code",
  "keyword": "Then "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Delete_request.it_should_display_error_message_incorrect_endpints_with_status_code()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "check whether can able to DELETE records",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User select DELETE Request when server is down",
  "keyword": "Given "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Delete_request.user_select_delete_request_when_server_is_down()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User send DELETE request",
  "keyword": "When "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Delete_request.user_send_delete_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should display display message Server Down with status Code",
  "keyword": "Then "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.Us_Post_request.it_should_display_display_message_server_down_with_status_code()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/UserSkillFeature_bdd/US_Get_Request.feature");
formatter.feature({
  "name": "Validate and Test GET Request in UserSkill Mapping API",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "check whether can able to GET all the records",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User select GET Request without Authorization",
  "keyword": "Given "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Get_request.user_select_get_request_without_authorization()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User send GET request",
  "keyword": "When "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Get_request.user_send_get_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should display an error message with status code",
  "keyword": "Then "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Get_request.it_should_display_an_error_message_with_status_code()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "check whether can able to GET all the records",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User select GET Request with Valid Authorization and valid endpoints",
  "keyword": "Given "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Get_request.user_select_get_request_with_valid_authorization_and_valid_endpoints()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User send GET request",
  "keyword": "When "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Get_request.user_send_get_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should display details with status code",
  "keyword": "Then "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Get_request.it_should_display_details_with_status_code()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "check whether can able to GET all the records",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User select GET Request with Valid Authorization and Invalid endpoints",
  "keyword": "Given "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Get_request.user_select_get_request_with_valid_authorization_and_invalid_endpoints()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User send GET request",
  "keyword": "When "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Get_request.user_send_get_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should display error message with status code",
  "keyword": "Then "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Get_request.it_should_display_error_message_with_status_code()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "check whether can able to GET all the records",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User select GET Request with Valid Authorization with Invalid credential and valid endpoints",
  "keyword": "Given "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Get_request.user_select_get_request_with_valid_authorization_with_invalid_credential_and_valid_endpoints()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User send GET request",
  "keyword": "When "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Get_request.user_send_get_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should display error message with status code",
  "keyword": "Then "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Get_request.it_should_display_error_message_with_status_code()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "check whether can able to GET records with existing UserID",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User select GET Request with Valid Authorization",
  "keyword": "Given "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Get_request.user_select_get_request_with_valid_authorization()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User send GET request",
  "keyword": "When "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Get_request.user_send_get_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should display details with status code",
  "keyword": "Then "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Get_request.it_should_display_details_with_status_code()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "check whether can able to GET records with Nonexisting UserID",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User select GET Request with Valid Authorization",
  "keyword": "Given "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Get_request.user_select_get_request_with_valid_authorization()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User send GET request",
  "keyword": "When "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Get_request.user_send_get_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should display error message with status code",
  "keyword": "Then "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Get_request.it_should_display_error_message_with_status_code()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "check whether can able to GET records without knowing Server is down",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User select GET Request with Valid Authorization Server Down",
  "keyword": "Given "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Get_request.user_select_get_request_with_valid_authorization_server_down()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User send GET request",
  "keyword": "When "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Get_request.user_send_get_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should display error message with status code",
  "keyword": "Then "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Get_request.it_should_display_error_message_with_status_code()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/UserSkillFeature_bdd/US_Post_Request.feature");
formatter.feature({
  "name": "Validate and Test POST Request in UserSkill Mapping API",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "check whether can able to create records Mapping",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User select POST Request with Valid JASON",
  "keyword": "Given "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.Us_Post_request.user_select_post_request_with_valid_jason()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User send POST request",
  "keyword": "When "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.Us_Post_request.user_send_post_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should display created record with status Code",
  "keyword": "Then "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.Us_Post_request.it_should_display_created_record_with_status_code()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "check whether can able to create records Mapping",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User select POST Request with Valid JASON and incorrect Endpoints",
  "keyword": "Given "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.Us_Post_request.user_select_post_request_with_valid_jason_and_incorrect_endpoints()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User send POST request",
  "keyword": "When "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.Us_Post_request.user_send_post_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should display error message incorrect endpoint with status Code",
  "keyword": "Then "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.Us_Post_request.it_should_display_error_message_incorrect_endpoint_with_status_code()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "check whether can able to create records Mapping",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User select POST Request with Valid JASON and incorrect data",
  "keyword": "Given "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.Us_Post_request.user_select_post_request_with_valid_jason_and_incorrect_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User send POST request",
  "keyword": "When "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.Us_Post_request.user_send_post_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should display display error message incorrect data with status Code",
  "keyword": "Then "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.Us_Post_request.it_should_display_display_error_message_incorrect_data_with_status_code()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "check whether can able to create records Mapping",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User select POST Request when server is down",
  "keyword": "Given "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.Us_Post_request.user_select_post_request_when_server_is_down()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User send POST request",
  "keyword": "When "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.Us_Post_request.user_send_post_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should display display message Server Down with status Code",
  "keyword": "Then "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.Us_Post_request.it_should_display_display_message_server_down_with_status_code()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/UserSkillFeature_bdd/US_Put_Request.feature");
formatter.feature({
  "name": "Validate and Test PUT Request in UserSkill Mapping API",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "check whether can able to Update records Mapping",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User select PUT Request with Valid JSON Data",
  "keyword": "Given "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Put_request.user_select_put_request_with_valid_json_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User send PUT request",
  "keyword": "When "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Put_request.user_send_put_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should display updated record details with status code",
  "keyword": "Then "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Put_request.it_should_display_updated_record_details_with_status_code()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "check whether can able to Update records Mapping",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User select PUT Request with Incorrect Endpoints",
  "keyword": "Given "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Put_request.user_select_put_request_with_incorrect_endpoints()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User send PUT request",
  "keyword": "When "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Put_request.user_send_put_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should display error message Incorrect Endpoints with status code",
  "keyword": "Then "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Put_request.it_should_display_error_message_incorrect_endpoints_with_status_code()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "check whether can able to Update records Mapping",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User select PUT Request with Incorrect JSON Data",
  "keyword": "Given "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Put_request.user_select_put_request_with_incorrect_json_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User send PUT request",
  "keyword": "When "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Put_request.user_send_put_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should display error message Incorrect JSON Data with status code",
  "keyword": "Then "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Put_request.it_should_display_error_message_incorrect_json_data_with_status_code()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "check whether can able to Update records Mapping",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User select PUT Request when server is down",
  "keyword": "Given "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Put_request.user_select_put_request_when_server_is_down()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User send PUT request",
  "keyword": "When "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Put_request.user_send_put_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should display message Server Down with status Code",
  "keyword": "Then "
});
formatter.match({
  "location": "UserSkill_StepDefinition_Bdd.US_Put_request.it_should_display_message_server_down_with_status_code()"
});
formatter.result({
  "status": "passed"
});
});