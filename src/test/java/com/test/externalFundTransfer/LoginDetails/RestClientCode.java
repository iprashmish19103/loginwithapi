package com.test.externalFundTransfer.LoginDetails;

import com.test.externalFundTransfer.LoginDto;
import io.restassured.path.json.JsonPath;
import lombok.Data;
import org.apache.http.entity.ContentType;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@Component
@Data
@RunWith(SpringRunner.class)

public class RestClientCode {


    @Autowired
    public RestTemplate restTemplate;
    @Autowired
    private HttpHeaders headers;
    @Autowired
    private LoginDto details;
    private ResponseEntity<String> result;

    private HttpEntity entity;
    private JsonPath js;
    String ssoToken;
    URI uri;

    public void startSetUp() throws URISyntaxException {
        final String baseUrl = "http://router-ext-core.uat.iggroup.local/external-service-payments-gateway/omnibus/fundstransfer";
        uri = new URI(baseUrl);
        headers.set("Content-Type", String.valueOf(ContentType.APPLICATION_JSON));
    }


    public void initializeData(String amount, String externalServicesId, String fromAccountId, String isoCurrency, String narrative, String toAccountId, String websiteId) {

        details.setAmount(amount);
        details.setExternalServicesId(externalServicesId);
        details.setFromAccountId(fromAccountId);
        details.setIsoCurrency(isoCurrency);
        if (!narrative.equals("")) {
            details.setNarrative(narrative);
        } else details.setNarrative(null);
        details.setToAccountId(toAccountId);
        details.setWebsiteId(websiteId);
        entity = new HttpEntity<>(details, headers);
        try {
            result = restTemplate.exchange(uri, HttpMethod.POST, entity, String.class);
        } catch (HttpClientErrorException e) {

            result = ResponseEntity.status(e.getRawStatusCode()).headers(e.getResponseHeaders())
                    .body(e.getResponseBodyAsString());
            System.out.println("Inside the catch block" + result);
        }
        System.out.println(result);
    }

    public void validMessage() {
        HttpStatus response = result.getStatusCode();
        Assert.assertEquals(HttpStatus.OK, response);

        if (null != result.getBody() && result.getBody().contains("FUNDS_TRANSFER_SUCCESS")) {
            System.out.println("Fund Transfer successfull");
        }
    }

    public void invalidMessage() {
        HttpStatus respdata = result.getStatusCode();
        System.out.println(respdata);
        Assert.assertEquals(HttpStatus.BAD_REQUEST, respdata);
        String errorCode = result.getBody();
        if (errorCode!=null && errorCode.contains("NARRATIVE_REQUIRED")) {
            System.out.println("narrative is required");
        }
    }

    public void failuremessage() {
        HttpStatus response = result.getStatusCode();
        Assert.assertEquals(HttpStatus.OK, response);

        if (null != result.getBody() && result.getBody().contains("FUNDS_TRANSFER_FAILED_INVALID_AMOUNT")) {
            System.out.println("Fund Transfer failed");
        }
    }


    public void insufficientfunds() {
        HttpStatus response = result.getStatusCode();
        Assert.assertEquals(HttpStatus.OK, response);

        if (null != result.getBody() && result.getBody().contains("FUNDS_TRANSFER_FAILED_INSUFFICIENT_FUNDS")) {
            System.out.println("Fund Transfer failed");
        }
    }

    public void validaccount() {
        HttpStatus response = result.getStatusCode();
        Assert.assertEquals(HttpStatus.OK, response);

        if (null != result.getBody() && result.getBody().contains("FUNDS_TRANSFER_SUCCESS")) {
            System.out.println("Valid FromAccountID");
        }
    }

    public void invalidfromaccount() {
        HttpStatus response = result.getStatusCode();
        Assert.assertEquals(HttpStatus.OK, response);

        if (null != result.getBody() && result.getBody().contains("FUNDS_TRANSFER_FAILED_FROM_ACCOUNT_NOT_FOUND")) {
            System.out.println("InValid FromAccountID");
        }
    }

    public void fromsiteinvalid() {
        HttpStatus response = result.getStatusCode();
        Assert.assertEquals(HttpStatus.OK, response);

        if (null != result.getBody() && result.getBody().contains("FUNDS_TRANSFER_FAILED_FROM_ACCOUNT_AND_SITE_ID_MISMATCH")) {
            System.out.println("Siteid invalid for FromAccount");
        }
    }

    public void invalidTositeid() {
        HttpStatus response = result.getStatusCode();
        Assert.assertEquals(HttpStatus.OK, response);

        if (null != result.getBody() && result.getBody().contains("FUNDS_TRANSFER_FAILED_TO_ACCOUNT_AND_SITE_ID_MISMATCH")) {
            System.out.println("Siteid invalid for ToAccount");
        }
    }

    public void validextserviceid() {
        HttpStatus response = result.getStatusCode();
        Assert.assertEquals(HttpStatus.OK, response);

        if (null != result.getBody() && result.getBody().contains("FUNDS_TRANSFER_SUCCESS")) {
            System.out.println("Successful ExternalServiceid validation done");
        }
    }

    public void invalidextserviceid() {
        HttpStatus response = result.getStatusCode();
        Assert.assertEquals(HttpStatus.OK, response);

        if (null != result.getBody() && result.getBody().contains("FUNDS_TRANSFER_FAILED_EXTERNAL_SERVICES_ID_MISMATCH")) {
            System.out.println("Failure ExternalServiceid validation done");
        }
    }

    public void invalidToAccount() {
        HttpStatus response = result.getStatusCode();
        Assert.assertEquals(HttpStatus.OK, response);

        if (null != result.getBody() && result.getBody().contains("FUNDS_TRANSFER_FAILED_TO_ACCOUNT_NOT_FOUND")) {
            System.out.println("InvalidtoAccount validation done");
        }
    }

    public void unavailablemasteraccount() {
        HttpStatus response = result.getStatusCode();
        Assert.assertEquals(HttpStatus.OK, response);

        if (null != result.getBody() && result.getBody().contains("FUNDS_TRANSFER_FAILED_MASTER_ACCOUNT_NOT_PRESENT")) {
            System.out.println("UnavailableMasterAccount validation done");
        }

    }

    public void availableToaccountcheck() {
        HttpStatus response = result.getStatusCode();
        Assert.assertEquals(HttpStatus.OK, response);

        if (null != result.getBody() && result.getBody().contains("FUNDS_TRANSFER_SUCCESS")) {
            System.out.println("ToAccount validation done");
        }
    }

    public void invalidcurrency() {
        HttpStatus response = result.getStatusCode();
        System.out.println(response);
        Assert.assertEquals(HttpStatus.OK, response);

        if (null != result.getBody() && result.getBody().contains("FUNDS_TRANSFER_FAILED_ERROR_RETRIEVING_EXCHANGE_RATE")) {
            System.out.println("FailureCurrency validation done");
        }
    }
}




