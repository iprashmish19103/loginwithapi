Feature: Currency  Validation

  Scenario Outline:  Successful Validation of currency in both Accounts

    Given I have a MasterAccount and SubAccount with same websiteid
    When  I set  valid details for my request with amount "<amount>", externalServicesId "<externalServicesId>", fromAccountId "<fromAccountId>", isoCurrency "<isoCurrency>", narrative "<narrative>", toAccountId "<toAccountId>",websiteId "<websiteId>"
    Then  I validate Currency for successful response
    Examples:
      |  amount    | externalServicesId             |  fromAccountId | isoCurrency |  narrative      | toAccountId | websiteId|
   #Same currency
      |     500        |      2TJCXS43V62BJCC6JINLBWVFF  |     UZC9P       |  JPY        |             |  QQT0U      |   kbu   |

  Scenario Outline:  Failure Validation of currency in both Accounts

    Given I have a MasterAccount and SubAccount with same websiteid
    When  I set  valid details for my request with amount "<amount>", externalServicesId "<externalServicesId>", fromAccountId "<fromAccountId>", isoCurrency "<isoCurrency>", narrative "<narrative>", toAccountId "<toAccountId>",websiteId "<websiteId>"
    Then  I validate Currency for failure response
    Examples:
      |  amount    | externalServicesId             |  fromAccountId | isoCurrency |  narrative      | toAccountId | websiteId|
   #Same currency
      |     500        |      2TJCXS43V62BJCC6JINLBWVFF  |     UZC9P       |  lkd        |             |  QQT0U      |   kbu   |


