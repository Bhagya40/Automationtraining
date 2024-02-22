Feature:Register User

  Background:
    Given Launch browser
    When Navigate to url "http://automationexercise.com"

    Then Verify that home page is visible successfully

  Scenario Outline:
    When Click on Signup or Login button
    Then Verify New User Signup! is visible
    And Enter "<name>" and "<emailaddress>"
    When Click Signup button
    Then Verify that ENTER ACCOUNT INFORMATION is visible
    And Fill details: "<Title>","<Password>"
    And Fill details: "<Dateofbirth>"
    And  Select checkbox Sign up for our newsletter!
    And Select checkbox Receive special offers from our partners!
    And Fill details: "<name>", "<Lastname>", "<Company>", "<Address>", "<Address2>", "<Country>", "<State>" "<City>", "<Zipcode>", "<Mobilenumber>"
    And Click Create Account button
    Then Verify that ACCOUNT CREATED! is visible
    And Click Continue button
    Then Verify that Logged in as username is visible
    When Click Delete Account button
    Then Verify that ACCOUNT DELETED! is visible and click Continue button
    Examples:
      | name   | emailaddress        | Password | Dateofbirth | Title | Lastname | Company | Address | Address2 | Country | State         | City      | Zipcode | Mobilenumber |
      | Bhagya | bhagyagadi@test.com | Test123  | 10/06/1977  | Mrs   | Gadi     | Sogeti  | 20      | KingsAve | INDIA   | Andhrapradesh | Hyderabad | 500068  | 919866612344 |