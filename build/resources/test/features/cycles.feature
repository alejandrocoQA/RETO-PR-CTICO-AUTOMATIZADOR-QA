# Autor: camilo
@stories
Feature: as a user I want to perform the cycles from 1 to 10 on the evalart page.

  Background: User is Logged In evalartapp
    Given am on the evalartapp page
    When I start session with my credentials
    Then I can see Se encuentra en el ciclo 1 de 10


  @Scenario2
  Scenario: execute cycle 1 to 10 successfully
    Given I start the first cycle
    When I continue until the end of the cycles
    Then Valid success hash <General>c2fe0e21ce445033MS00LTc4Mjk2NA==df63afbf4da3d4b1