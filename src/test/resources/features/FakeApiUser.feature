Feature: Fake Api search user

  Scenario: search user a valid user
    Given valid request
    When search a valid user
    Then user is found