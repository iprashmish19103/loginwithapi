Feature: ExternalServiceid  Validation

  Scenario Outline:  ExternalServiceid successfull validation

    Given I have a MasterAccount and SubAccount with same websiteid
    When  I set  valid details for my request with amount "<amount>", externalServicesId "<externalServicesId>", fromAccountId "<fromAccountId>", isoCurrency "<isoCurrency>", narrative "<narrative>", toAccountId "<toAccountId>",websiteId "<websiteId>"
    Then  I validate ExternalServiceId for successful response
    Examples:
      |  amount    | externalServicesId             |  fromAccountId | isoCurrency |  narrative      | toAccountId | websiteId|
   #Different currency
      |     8719        |      2TJCXS43V62BJCC6JINLBWVFF  |     QQT0U       |  JPY        |   string          |  UZC9P      |   kbu   |

  Scenario Outline:  ExternalServiceid Failure validation

    Given I have a MasterAccount and SubAccount with same websiteid
    When  I set  valid details for my request with amount "<amount>", externalServicesId "<externalServicesId>", fromAccountId "<fromAccountId>", isoCurrency "<isoCurrency>", narrative "<narrative>", toAccountId "<toAccountId>",websiteId "<websiteId>"
    Then  I validate ExternalServiceId for failure response
    Examples:
      |  amount    | externalServicesId             |  fromAccountId | isoCurrency |  narrative      | toAccountId | websiteId|
   #Different currency
      |     7719        |      2TJCXS43V62BJCC6DMNLBWVFF  |     UZC9P       |  JPY        |   string          |  QQT0W      |   kbu   |


