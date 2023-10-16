Feature: Product Purchase

  Scenario: Verify that user is able to login the application successfully.

    Given User is on the landing page
    When User enter the email as "standard_user"
    And User enter the password as "secret_sauce"
    Then User click on sign-in button and user is directed to the main page

  Scenario: Verify that user is able to add to cart Products and then checkout the cart successfully.

    // login scenarios - prerequisite steps
    Given User is on the landing page
    When User enter the email as "standard_user"
    And User enter the password as "secret_sauce"
    Then User click on sign-in button and user is directed to the main page

    Given User is on the  products list page
    When User can select multiple products
    And User clicks on Add to cart button top right corner of the screen and directed to cart page
    And User clicks on Checkout button displaying on the cart page and directed to the Information page
    And User fill the information FirstName, LastName and Zip or Postal code and Click on Continue button and directed to Overview page
    And In overview page user clicks on Finish button to complete the shopping and directed to the Completion page
    Then User clicks on Back Home button and directed to the main page



  Scenario: Verify that user is able to logout the application successfully.

    // login scenarios - prerequisite steps
    Given User is on the landing page
    When User enter the email as "standard_user"
    And User enter the password as "secret_sauce"
    Then User click on sign-in button and user is directed to the main page

    Given User is already login into the application
    When User clicks on menu button top left of the screen
    Then User clicks on the logout option and directed to the main page
