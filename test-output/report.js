$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login functionality with API",
  "description": "",
  "id": "login-functionality-with-api",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Checking Login functionality with valid credentials",
  "description": "",
  "id": "login-functionality-with-api;checking-login-functionality-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I as an IG client",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I login into IG platform with username \"\u003cusername\u003e\" and password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I\u0027ll be logged in to IG",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I\u0027ll get success message",
  "keyword": "And "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "login-functionality-with-api;checking-login-functionality-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10,
      "id": "login-functionality-with-api;checking-login-functionality-with-valid-credentials;;1"
    },
    {
      "cells": [
        "abtestuatuk2",
        "Welcome1"
      ],
      "line": 11,
      "id": "login-functionality-with-api;checking-login-functionality-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Checking Login functionality with valid credentials",
  "description": "",
  "id": "login-functionality-with-api;checking-login-functionality-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I as an IG client",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I login into IG platform with username \"abtestuatuk2\" and password \"Welcome1\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I\u0027ll be logged in to IG",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I\u0027ll get success message",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefination.iAsAnIGClient()"
});
formatter.result({
  "duration": 161254100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abtestuatuk2",
      "offset": 40
    },
    {
      "val": "Welcome1",
      "offset": 68
    }
  ],
  "location": "LoginStepDefination.iLoginIntoIGPlatformWithUsernameAndPassword(String,String)"
});
formatter.result({
  "duration": 1122089800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.iLlBeLoggedInToIG()"
});
formatter.result({
  "duration": 839849900,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c4[3]\u003e but was:\u003c4[5]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat com.test.logincheck.loginwithapi.loginwithapi.LoginDetails.RestClientCode.loginSuccess(RestClientCode.java:79)\r\n\tat com.test.logincheck.loginwithapi.loginwithapi.StepDefination.LoginStepDefination.iLlBeLoggedInToIG(LoginStepDefination.java:42)\r\n\tat ✽.Then I\u0027ll be logged in to IG(Login.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDefination.iLlGetSuccessMessage()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "line": 13,
  "name": "Checking Login functionality with invalid credentials",
  "description": "",
  "id": "login-functionality-with-api;checking-login-functionality-with-invalid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "I as an IG client",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I login into IG platform with username \"\u003cusername\u003e\" and password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I\u0027ll not be logged in to IG",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I\u0027ll get error message",
  "keyword": "And "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "login-functionality-with-api;checking-login-functionality-with-invalid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 20,
      "id": "login-functionality-with-api;checking-login-functionality-with-invalid-credentials;;1"
    },
    {
      "cells": [
        "abtestuatuk20",
        "Welcome1"
      ],
      "line": 21,
      "id": "login-functionality-with-api;checking-login-functionality-with-invalid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 21,
  "name": "Checking Login functionality with invalid credentials",
  "description": "",
  "id": "login-functionality-with-api;checking-login-functionality-with-invalid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "I as an IG client",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I login into IG platform with username \"abtestuatuk20\" and password \"Welcome1\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I\u0027ll not be logged in to IG",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I\u0027ll get error message",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefination.iAsAnIGClient()"
});
formatter.result({
  "duration": 410000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abtestuatuk20",
      "offset": 40
    },
    {
      "val": "Welcome1",
      "offset": 69
    }
  ],
  "location": "LoginStepDefination.iLoginIntoIGPlatformWithUsernameAndPassword(String,String)"
});
formatter.result({
  "duration": 430209800,
  "error_message": "org.springframework.web.client.HttpClientErrorException$Unauthorized: 401 Unauthorized: [no body]\r\n\tat org.springframework.web.client.HttpClientErrorException.create(HttpClientErrorException.java:105)\r\n\tat org.springframework.web.client.DefaultResponseErrorHandler.handleError(DefaultResponseErrorHandler.java:170)\r\n\tat org.springframework.web.client.DefaultResponseErrorHandler.handleError(DefaultResponseErrorHandler.java:112)\r\n\tat org.springframework.web.client.ResponseErrorHandler.handleError(ResponseErrorHandler.java:63)\r\n\tat org.springframework.web.client.RestTemplate.handleResponse(RestTemplate.java:782)\r\n\tat org.springframework.web.client.RestTemplate.doExecute(RestTemplate.java:740)\r\n\tat org.springframework.web.client.RestTemplate.execute(RestTemplate.java:714)\r\n\tat org.springframework.web.client.RestTemplate.exchange(RestTemplate.java:602)\r\n\tat com.test.logincheck.loginwithapi.loginwithapi.LoginDetails.RestClientCode.initializeData(RestClientCode.java:57)\r\n\tat com.test.logincheck.loginwithapi.loginwithapi.StepDefination.LoginStepDefination.iLoginIntoIGPlatformWithUsernameAndPassword(LoginStepDefination.java:36)\r\n\tat ✽.When I login into IG platform with username \"abtestuatuk20\" and password \"Welcome1\"(Login.feature:15)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDefination.iLlNotBeLoggedInToIG()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefination.iLlGetErrorMessage()"
});
formatter.result({
  "status": "skipped"
});
});