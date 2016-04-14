Scenario: Doing mathematics

Given a variable x with value 10
When I multiply x by 10
Then the result should be 100

Given a variable x with value 5
When I multiply x by 5
When I add to x 25
When I multiply x by 4
When I subtract to x 50
Then the result should be 150

