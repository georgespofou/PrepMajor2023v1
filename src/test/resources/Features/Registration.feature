Feature: PreMajor Registration Form

  @test
  Scenario:   To validate a valid Registration

    Given  I navigate to PrepMajor website
    When I enter my Name and last name
    And  I enter my email address
    And I enter my height
    And I select my vegetarian option
    And I enter my location
    And I select the length of my career
    And I describe my hobbies
    And I select my course choice
    And I select my career progression
    And I select all the days working for me
    And I select the best time for me
    And I select my favorite music
    And  I click on Submit
    Then  I should see the successful message