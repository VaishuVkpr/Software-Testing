@Faeature1
Feature: To validate the account creation of Amazon application


@Regression
Scenario: To create a new account 

Given To launch the browser and maximize the window
When To launch url of amazon application
And  To click the signin button 
And  To click the create new account
And To pass the firstname in the name textbox

|vaishnavi|vaishali|reshu|madhu|

And To pass the mobileno or email in the email textbox
|sjvaishnavi05@gmail.com|9361694473|9715561456|
|8765431204|vaishu@gmail.com|9715562456|

And To create new password using new password textbox
Then To close the Chrome browser




