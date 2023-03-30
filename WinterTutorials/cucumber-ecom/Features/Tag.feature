Feature: Tag features

@Sanity
Scenario: Verify Login
Given This is a login test

@Regression
Scenario: Verify Logout
Given This is a logout test

@Regression @BusinessCritical
Scenario: Verify Search
Given This is a search test

@Sanity @Regression
Scenario: Verify Shopping Cart
Given This is a shopping cart test

@BusinessCritical
Scenario: Verify Register User
Given This is a register user test


