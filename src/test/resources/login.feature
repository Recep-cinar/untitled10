Feature: SmartBear login Feature

  @SmokeTest
  Scenario: SmartBear Login Test Scenario
    Given : User Is Already On Login Page
    When :Title Of Page Is Web Orders Login
    Then User Enter Username And Password
    And :User Click On Login Button
    And :User On The Home Page
