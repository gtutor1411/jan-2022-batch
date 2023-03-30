Feature: Tags Features

@Sanity
Scenario: Verify Login
Given This is a login test

@Regression
Scenario: Verify Logout
Given This is a logout test

@Regression @BusinessCritical
Scenario: Verify Register
Given This is a register test

@Sanity @Regression
Scenario: Verify Shopping cart
Given This is a shopping test

@BusinessCritical
Scenario: Verify search test
Given This is a search test
