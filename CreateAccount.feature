Feature: CreateAccount functionality of Leaftaps Application

Background:
Given Launch the browser
And Load the url

Scenario Outline: CreateAccount with multiple data
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login Button
Then HomePage should be displayed
When Click on crmsfa link
And Click on Accounts Link
And Click on CreateAccount Link
Given Enter the Accountname as <Accountname>
And Enter the emailid <emailid>
When Click on Submit button
Then ViewAccountsPage should be displayed as <Accountname>

Examples:
|Accountname|emailid|
|Pothys2|abc@gmail.com|
|Amazon2|best@gmail.com|

