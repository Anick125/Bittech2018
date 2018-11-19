Feature: validate login Credential
Background:
Given open Browser
And nevigate to facebook url

@Smoke
Scenario: login to profile page with valid credentials

When user type userid on user id box
And user type password on password box
And user click on login button
Then user should be in profile page

@Regression
Scenario: login with invalid credentials  


When user type invalid userid on user id box
And user type invalid password on password box
And user click on login button
Then user should not be in profile page

@Integration
Scenario: Verify lodin button is enablef 

When user will check login button is enable or not
Then Based on the result user should get the result return true or false 

