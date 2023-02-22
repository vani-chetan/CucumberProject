Feature: MlCal Mortgage calculator
  As a user
  I want to use a calculator to find the monthly
  mortgage payment
  Scenario :Send text value to Purchase Price and check Monthly Payment is greater than 2000
    Given I  am on MlCal web Page
    When I send value to PP
    When I click on Calculate
    Then "<total>" should be Greater than two thousands

