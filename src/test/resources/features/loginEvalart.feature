# Autor: camilo
@stories
Feature: as a user I want to perform the cycles from 1 to 10 on the evalart page.

  @scenario
  Scenario: execute cycle 1 to 10 successfully
    Given am on the evalartapp page
    When I start session with my credentials
    Then I can see Se encuentra en el ciclo 1 de 10

