Feature: this feature is for smoke tests
  @smoke
  Scenario: Smoke Test
    Given I print hello world
    Then everybody is happy

    @regression
    Scenario: This is for cucumber test
      Given I am run cucumber test
      Then verify this cucumber