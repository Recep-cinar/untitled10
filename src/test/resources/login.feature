Feature: SmartBear login Feature

  @SmokeTest
  Scenario: SmartBear Login Test Scenario
    Given : User Is Already On Login Page
    When :Title Of Page Is Web Orders Login
    Then User Enter Username And Password
    And :User Click On Login Button
    And :User On The Home Page

    @SanityTest
    Scenario:User Creating New Order
      Given :User enter username As "tester" and password as "test"
      When :user on order page
      And :user enter product information
      |Product|FamilyAlbum|
      |Quantity|10        |
      And :User enter address information
         |Customer Name|Esra Cinar|
         |Street       |1905 22nd rd|
         |City         |Queens      |
         |State        |New York    |
         |Zip          |11105       |
      And :User enter payment information
         |Card|Visa|
         |Card Nr|1234 5678 9101|
         |Expire date|01/01     |
      Then :order successful
