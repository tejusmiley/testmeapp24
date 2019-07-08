@tag
Feature: arthimetic calculation of 2 numbers
  I want to add 2 numbers and store sum in 3rd number

  @part1
  Scenario: Adding 2 numbers and storing sum in 3rd number
    Given I have two numbers
    And I want to add both numbers
    Then sum shall be saved in 3rd number

  @part2
  Scenario Outline: Multiplying 2 numbers and storing the product in 3rd number
    Given I have other two numbers <m> <n>
    And i want to multiply both the numbers
    Then product shall be saved in third number
    Examples:
    | m | n |
    | 34   | 10   |
    | 10   | 40   |
    
    
