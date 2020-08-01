package com.test.externalFundTransfer.StepDefination;

import com.test.externalFundTransfer.Config.RestTemplateConfig;
import com.test.externalFundTransfer.LoginDetails.RestClientCode;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.test.context.ContextConfiguration;

import java.net.URISyntaxException;
@ContextConfiguration(classes = RestTemplateConfig.class)
public class LoginStepDefination {

    @Autowired
    private HttpHeaders headers;

    @Autowired
    RestClientCode data;


    @Given("^I send a request for Funds Transfer$")
    public void i_send_a_request_for_Funds_Transfer() throws URISyntaxException {
        data.startSetUp();

    }

    @When("^I set  valid details for my request with amount \"([^\"]*)\", externalServicesId \"([^\"]*)\", fromAccountId \"([^\"]*)\", isoCurrency \"([^\"]*)\", narrative \"([^\"]*)\", toAccountId \"([^\"]*)\",websiteId \"([^\"]*)\"$")
    public void i_set_valid_details_for_my_request_with_amount_externalServicesId_fromAccountId_isoCurrency_narrative_toAccountId_websiteId(String amount,String externalServicesId,String fromAccountId,String isoCurrency,String  narrative,String toAccountId, String websiteId ) {
        data.initializeData(amount,externalServicesId,fromAccountId,isoCurrency,narrative,toAccountId,websiteId);
    }



    @Then("^I validate response with Success message for Funds Transfer$")
    public void i_validate_response_with_Success_message_for_Funds_Transfer()  {
        data.validMessage();
    }

       @Then("^I validate response with Failure message for Funds Transfer$")
    public void iValidateResponseWithFailureMessageForFundsTransfer() {
        data.invalidMessage();
    }


//    @When("^I set  valid details for my request with amount \"([^\"]*)\", externalServicesId \"([^\"]*)\", fromAccountId \"([^\"]*)\", isoCurrency \"([^\"]*)\", narrative \"([^\"]*)\", toAccountId \"([^\"]*)\",websiteId \"([^\"]*)\"$")
//    public void i_set_valid_details_for_my_request_with_amount_externalServicesId_fromAccountId_isoCurrency_narrative_toAccountId_websiteId(Integer amount,String externalServicesId,String fromAccountId,String isoCurrency,String  narrative,String toAccountId, String websiteId ) throws Throwable {
//        data.initializeData(amount,externalServicesId,fromAccountId,isoCurrency,narrative,toAccountId,websiteId);
//           }



    @When("^I set invalid data for my request with  amount \"([^\"]*)\", externalServicesId \"([^\"]*)\", fromAccountId \"([^\"]*)\", isoCurrency \"([^\"]*)\", narrative \"([^\"]*)\", toAccountId \"([^\"]*)\",websiteId \"([^\"]*)\"$")
    public  void iSetInvalidDataForMyRequestWithAmountExternalServicesIdFromAccountIdIsoCurrencyNarrativeToAccountIdWebsiteId(String amount,String externalServicesId,String fromAccountId,String isoCurrency,String  narrative,String toAccountId, String websiteId ) {
        data.initializeData(amount,externalServicesId,fromAccountId,isoCurrency,narrative,toAccountId,websiteId);
        // iValidateResponseWithFailureMessageForFundsTransfer();
    }
        @Then("^I validate FromAccount for successful response$")
    public void iValidateFromAccountForSuccessfulResponse() {
        data.validaccount();
    }

    @Then("^I validate FromAccount for Failure response$")
    public void iValidateFromAccountForFailureResponse() {
        data.invalidfromaccount();
    }

    @Then("^I validate response for Failure message$")
    public void iValidateResponseForFailureMessage() {
        data.failuremessage();
    }

    @Then("^I validate response funds with insufficientfundsmessage$")
    public void iValidateResponseFundsWithInsufficientfundsmessage() {
        data.insufficientfunds();
    }

    @Given("^I have a MasterAccount and SubAccount with same websiteid$")
    public void iHaveAMasterAccountAndSubAccountWithSameWebsiteid() throws URISyntaxException {
        data.startSetUp();
    }


    @Given("^I have a FromAccount and ToAccount in SiteId='kbu'$")
    public void iHaveAFromAccountAndToAccountInSiteIdKbu() throws URISyntaxException{
        data.startSetUp();
    }

      @Then("^I validate SiteId for failure response  for ToAccount$")
    public void iValidateSiteIdForFailureResponseForToAccount() {
        data.invalidTositeid();
    }

    @Then("^I validate Siteid for failure response with message$")
    public void iValidateSiteidForFailureResponseWithMessage() {
        data.fromsiteinvalid();
    }

    @Then("^I validate ExternalServiceId for successful response$")
    public void iValidateExternalServiceIdForSuccessfulResponse() {
        data.validextserviceid();
    }

    @Then("^I validate ExternalServiceId for failure response$")
    public void iValidateExternalServiceIdForFailureResponse() {
        data.invalidextserviceid();
    }

    @Then("^I validate ToAccount for Failure response$")
    public void iValidateToAccountForFailureResponse() {
        data.invalidToAccount();
    }

    @Then("^I validate ToAccount and FromAccount for failure response$")
    public void iValidateToAccountAndFromAccountForFailureResponse() {
        data.unavailablemasteraccount();
    }

    @Then("^I validate ToAccount for successful response$")
    public void iValidateToAccountForSuccessfulResponse() {
        data.availableToaccountcheck();
    }

    @Then("^I validate Currency for successful response$")
    public void iValidateCurrencyForSuccessfulResponse() {
        data.validMessage();

    }

    @Then("^I validate Currency for failure response$")
    public void iValidateCurrencyForFailureResponse() {
        data.invalidcurrency();
    }
}
