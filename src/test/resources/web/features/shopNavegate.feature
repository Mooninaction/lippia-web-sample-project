Feature: As a potential client i need to navegate to find a web site

  @Smoke @Luna
  Scenario: The client search by "dress"
    Given The client is in landing page
    When The client search for word "dress"
    And The client click on boton search
    Then The client verify that results are shown properly


  @Smoke
  Scenario: The client do a successful login
    Given The client is on the login screen
    When The client enters username "emailprueba2@gmeail.com" and password "fideosconqueso"
    And The client click on boton login
    Then The client verify that enters my account


  @Smoke
  Scenario: The client search by "short"
    Given The client is in landing page
    When The client search for word "short"
    And The client click on boton search
    Then The client verify that they are ordered from smallest to largest

