Feature: Login feature

This feature includes
1)login as admin
2)login with linda.anderson
3)invalid login

Background:
Given I am able to navigate onto login page

@Login
Scenario: Login as admin
When I enter the user as "Admin"
And I enter the password as "admin123"
And I click on login button
Then I should see welcome
Scenario: Login as linda.anderson

When I enter the user as "admin"
And I enter the password as "admin123"
And I click on login button
Then I should see welcome

Scenario: Login with negative data
When I enter the user as "sunil"
And I enter the password as "Sunil"
And I click on login button
Then I should see error message as "Invalid credentials"