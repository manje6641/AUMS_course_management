Feature: the course can be retrieved

Scenario: client makes call to GET /course/all
When the client calls course
Then the client receives response status code of 200

Scenario: client makes call to specific course
  When the client calls course 16
  Then the client receives response status code of 200 for course
