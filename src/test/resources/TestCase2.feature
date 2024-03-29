Feature: Login User

  Background:
    Given Launch browser
    When Navigate to url "http://automationexercise.com"

    Then Verify that home page is visible successfully
Scenario:
When Click on 'Signup / Login' button
Then Verify 'Login to your account' is visible
When Enter correct email address and password
And Click 'login' button
Then Verify that 'Logged in as username' is visible
When Click 'Delete Account' button
Then Verify that 'ACCOUNT DELETED!' is visible