Feature: Login Page Tests

  Scenario: User could login to the PlayGround
    Given User on Login Page
    When User enters email
    And User enters Password
    And Clicks Login Button
    Then User should land on home page