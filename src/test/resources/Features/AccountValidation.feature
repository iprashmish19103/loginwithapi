Feature: Accounts  Validation

  Scenario Outline:  Validation of Funds Transfer for valid FromAccount

    Given I have a MasterAccount and SubAccount with same websiteid
    When  I set  valid details for my request with amount "<amount>", externalServicesId "<externalServicesId>", fromAccountId "<fromAccountId>", isoCurrency "<isoCurrency>", narrative "<narrative>", toAccountId "<toAccountId>",websiteId "<websiteId>"
    Then  I validate FromAccount for successful response
    Examples:
      |  amount    | externalServicesId             |  fromAccountId | isoCurrency |  narrative      | toAccountId | websiteId|
   #Same currency
      |     500        |      2TJCXS43V62BJCC6JINLBWVFF  |     UZC9P       |  JPY        |             |  QQT0U      |   kbu   |

  Scenario Outline:  Validation of Funds Transfer for invalid FromAccount

    Given I have a MasterAccount and SubAccount with same websiteid
    When  I set  valid details for my request with amount "<amount>", externalServicesId "<externalServicesId>", fromAccountId "<fromAccountId>", isoCurrency "<isoCurrency>", narrative "<narrative>", toAccountId "<toAccountId>",websiteId "<websiteId>"
    Then  I validate FromAccount for Failure response
    Examples:
      |  amount    | externalServicesId             |  fromAccountId | isoCurrency |  narrative      | toAccountId | websiteId|
   #Same currency
      |     500        |      2TJCXS43V62BJCC6JINLBWVFF  |     qlkij       |  JPY        |             |  UZC9P      |   kbu   |

  Scenario Outline:  Validation of Funds Transfer for valid ToAccount

    Given I have a MasterAccount and SubAccount with same websiteid
    When  I set  valid details for my request with amount "<amount>", externalServicesId "<externalServicesId>", fromAccountId "<fromAccountId>", isoCurrency "<isoCurrency>", narrative "<narrative>", toAccountId "<toAccountId>",websiteId "<websiteId>"
    Then  I validate ToAccount for successful response
    Examples:
      |  amount    | externalServicesId             |  fromAccountId | isoCurrency |  narrative      | toAccountId | websiteId|
   #Same currency
      |     500        |      2TJCXS43V62BJCC6JINLBWVFF  |     UZC9P       |  JPY        |             |  QQT0U      |   kbu   |

  Scenario Outline:  Validation of Funds Transfer for invalid ToAccount

    Given I have a MasterAccount and SubAccount with same websiteid
    When  I set  valid details for my request with amount "<amount>", externalServicesId "<externalServicesId>", fromAccountId "<fromAccountId>", isoCurrency "<isoCurrency>", narrative "<narrative>", toAccountId "<toAccountId>",websiteId "<websiteId>"
    Then  I validate ToAccount for Failure response
    Examples:
      |  amount    | externalServicesId             |  fromAccountId | isoCurrency |  narrative      | toAccountId | websiteId|
   #Same currency
      |     500        |      2TJCXS43V62BJCC6JINLBWVFF  |     UZC9P       |  JPY        |             |  qlkij      |   kbu   |


  Scenario Outline:  Validation of ToAccount and FromAccount for MasterAccount

    Given I have a MasterAccount and SubAccount with same websiteid
    When  I set  valid details for my request with amount "<amount>", externalServicesId "<externalServicesId>", fromAccountId "<fromAccountId>", isoCurrency "<isoCurrency>", narrative "<narrative>", toAccountId "<toAccountId>",websiteId "<websiteId>"
    Then  I validate ToAccount and FromAccount for failure response
    Examples:
      |  amount    | externalServicesId             |  fromAccountId | isoCurrency |  narrative      | toAccountId | websiteId|
   #Different currency
      |     500        |      2TJCXS43V62BJCC6JINLBWVFF  |     QQT0W       |  JPY        |             |  QQT0U      |   kbu   |

#Scenario: : Validation of Funds Transfer for valid ToAccount
#
#Given : I have a FromAccount and ToAccount in SiteId='kbu'
#When : I request a funds transfer using details SiteId ,ExternalServiceId,SiteId, FromAccount, ToAccount, Amount
#Then : I validate ToAccount for successful response
#

#
#Scenario: : Validation for FromAccount and ToAccount for MasterAccount
#
#  Given: I have a FromAccount and ToAccount
#  When : I request for Funds Transfer using details SiteId ,ExternalServiceId,SiteId, FromAccount, ToAccount, Amount
#  Then : I validate for FromAccount and ToAccount  for MasterAccount with message<FUNDS_TRANSFER_FAILED_MASTER_ACCOUNT_NOT_PRESENT>
