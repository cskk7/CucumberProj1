Feature: Calculator Scenerio

  Scenerio Outline: User add 2 numbers

  Given I open calculator
  When I add 2 numbers: <Number1><Number2>
  Then I should see output: <OUTPUT>

  Examples:
  |Number1 |Number2|OUTPUT|
  |5	 |5	 |10	|
  |4	 |9	 |13	|