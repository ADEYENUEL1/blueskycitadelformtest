Feature: BlueSky Form Test
 Scenario Outline: Form Test
    Given I navigate to Blueskycitadel test form
    When I enter first name "<firstname>"
    And I enter last name "<lastname>"
    And I enter email "<email>"
    And I enter confirm my email "<confirm email>"
    And I enter Gender "<male>"
    And I select age 18 - 30
    And I select single check box
    And I select Two under from check box list
    And I select Three from Multi - select
    And I click One from  radio list
    And I click three from select
    And I enter address
    And I click on submit button
    Then I am registered

   Examples:
   |first name|last name|email             |confirm email     |Gender|
   |Muyiwa    |Babatunde|olumuyee@gmail.com|olumuyee@gmail.com|Male  |
