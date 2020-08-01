Feature: Funds Transfer Validation

  Scenario Outline: External Service payment Success scenario.

    Given I have a MasterAccount and SubAccount with same websiteid
    When  I set  valid details for my request with amount "<amount>", externalServicesId "<externalServicesId>", fromAccountId "<fromAccountId>", isoCurrency "<isoCurrency>", narrative "<narrative>", toAccountId "<toAccountId>",websiteId "<websiteId>"
    Then  I validate response with Success message for Funds Transfer

    Examples:
    |  amount    | externalServicesId             |  fromAccountId | isoCurrency |  narrative      | toAccountId | websiteId|
   #Different currency
    |     900        |      2TJCXS43V62BJCC6JINLBWVFF  |     UZC9P       |  JPY        |   string          |  QQT0W      |   kbu   |
    |     800.0004   |      2TJCXS43V62BJCC6JINLBWVFF  |     UZC9P       |  JPY        |   string          |  QQT0W      |   kbu  |
    #  Same Currency below
    |     500        |      2TJCXS43V62BJCC6JINLBWVFF  |     UZC9P       |  GBP        |   string          |  QQT0U      |   kbu   |
    |     2000.007   |      2TJCXS43V62BJCC6JINLBWVFF  |     UZC9P       |  GBP        |   string          |  QQT0U      |   kbu   |



  Scenario Outline:  Validation of Funds Transfer for invalid Amount

    Given I have a MasterAccount and SubAccount with same websiteid
    When  I set  valid details for my request with amount "<amount>", externalServicesId "<externalServicesId>", fromAccountId "<fromAccountId>", isoCurrency "<isoCurrency>", narrative "<narrative>", toAccountId "<toAccountId>",websiteId "<websiteId>"
    Then  I validate response for Failure message

    Examples:
      |  amount        |     externalServicesId          |  fromAccountId | isoCurrency |  narrative      | toAccountId | websiteId|
      |     -500       |      2TJCXS43V62BJCC6JINLBWVFF  |     UZC9P       |  GBP        |   string          |  QQT0W      |   kbu   |
      |     900.0004   |      2TJCXS43V62BJCC6JINLBWVFF  |     UZC9P       |  GBP        |   string          |  QQT0W      |   kbu   |


  Scenario Outline: Validation for Funds from FromAccount for InsufficientFunds

    Given I have a MasterAccount and SubAccount with same websiteid
    When  I set  valid details for my request with amount "<amount>", externalServicesId "<externalServicesId>", fromAccountId "<fromAccountId>", isoCurrency "<isoCurrency>", narrative "<narrative>", toAccountId "<toAccountId>",websiteId "<websiteId>"
    Then  I validate response funds with insufficientfundsmessage

    Examples:
      |  amount         |  externalServicesId             |  fromAccountId | isoCurrency |  narrative      | toAccountId | websiteId|
      |     10000000        |      2TJCXS43V62BJCC6JINLBWVFF  |     QQT0W       |  GBP        |   string          |  UZC9P      |   kbu   |
     |     900000000   |      2TJCXS43V62BJCC6JINLBWVFF  |     UZC9P       |  GBP        |   string          |  QQT0W      |   kbu   |
