

@tag
Feature: Testme app Login
As a registered user , user shall be able to login
using his credentials

Scenario : Successful User login

Given User shall launch Testmeapp url 
And clicks on signin
When user provides valid credentials
And clicks on Login button
Then user shall be directed to home page


