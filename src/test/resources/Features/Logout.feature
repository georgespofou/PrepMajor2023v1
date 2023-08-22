Feature:  Logout from the PrepMajor website

  Background: user should login successfully
    Given  I am on the PrepMajor website
    And    I click on login
    When   I enter my username and password
    And    I click on login button
    Then   I should login successfully

  @5978
 Scenario: Logout successful

    Given I login to my PrepMajor Account
    When  I click on logout button
    And   I logout successfully
    Then  I should be redirected to the login and signup page

