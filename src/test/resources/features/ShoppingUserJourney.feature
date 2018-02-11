@FunctionalTest
Feature:User journey in shopping website
  This feature includes various activities of logged in user.

  Background:User is Logged In
    Given User navigate to the Sign in page
    When user submit "someone@example.com" and "Password123"
    Then user should be taken to "My account" page

  Scenario Outline: : User ordering a T-shirt and checking for order reference in order history
    Given a user is on T-shirt page
    When user add the T-shirt to cart by hovering over image and check out
    And user click on proceed to check out from shopping cart summary page
    And user click on proceed to check out from Address page
    And user click on proceed to check out from Shipping page
    And user select the "<payment methods>"and confirm the order
    And User is taken to Order Confirmation page
    And User click on Back to orders to naviagte to Order history
    Then latest order should be displayed in Order history
    And user logout
    Examples:
      |payment methods|
      |Pay by Bank Wire|
      |Pay by check|

  Scenario: User updating personal information
    Given a user is on My personal information page
    When user enter "TestNewFirstName" in the First name field
    And enter "Password123" in Current Password and save the details
    Then message displayed "Your personal information has been successfully updated."
    And user logout



