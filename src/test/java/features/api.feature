Feature: Test Automation Api

  @api
  Scenario: Test get user by ID
    Given prepare url for "GET_LIST_USERS"
    And hit api get user by ID
    Then validation status code is equals 200
    Then validation response body get user by ID
    Then validation response json with JSONSchema "get_user_by_ID.json"