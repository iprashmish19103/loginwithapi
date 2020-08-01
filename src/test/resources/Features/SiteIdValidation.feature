Feature: Siteid  Validation

  Scenario Outline:  Siteid in FromAccount validation

    Given I have a MasterAccount and SubAccount with same websiteid
    When  I set  valid details for my request with amount "<amount>", externalServicesId "<externalServicesId>", fromAccountId "<fromAccountId>", isoCurrency "<isoCurrency>", narrative "<narrative>", toAccountId "<toAccountId>",websiteId "<websiteId>"
    Then  I validate Siteid for failure response with message
    Examples:
      |  amount    | externalServicesId             |  fromAccountId | isoCurrency |  narrative      | toAccountId | websiteId|
   #Different currency
      |     900        |      2TJCXS43V62BJCC6JINLBWVFF  |     LW09C       |  JPY        |   string          |  UZC9P      |   kbu   |

  Scenario Outline:  Siteid in ToAccount validation

    Given I have a MasterAccount and SubAccount with same websiteid
    When  I set  valid details for my request with amount "<amount>", externalServicesId "<externalServicesId>", fromAccountId "<fromAccountId>", isoCurrency "<isoCurrency>", narrative "<narrative>", toAccountId "<toAccountId>",websiteId "<websiteId>"
    Then  I validate SiteId for failure response  for ToAccount
    Examples:
    |  amount    | externalServicesId             |  fromAccountId | isoCurrency |  narrative      | toAccountId | websiteId|
   #Different currency
    |     2008        |      2TJCXS43V62BJCC6JINLBWVFF  |     UZC9P       |  JPY        |   string          |  LW09C      |   kbu   |





