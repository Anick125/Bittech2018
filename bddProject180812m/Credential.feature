Feature:Login validation

Scenario Outline:Login credentials

Given open Browser
And nevigate to facebook url
When user type "<userid>" on user id box
And user type "<password>" on password box
And user click on login button
Then user should be in profile page

Examples:

|userid|password|

|user1|2345|

|user2|6666|






 





