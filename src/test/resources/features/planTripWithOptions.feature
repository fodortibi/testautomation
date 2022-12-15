Feature: 10.) As a user I can use the Planning options,
  so that walk/MOL Bubi/bicycle trip will be planned.

  Rule: It is allowed to plan a trip with options

    Background:
      Given open main page
      And accept cookies

    @smoke
    Scenario: Plan a trip with the Trip Planner with options
      Given language is set to "english"
      When the user provides basic trip data
      And planning options are specified
      And the user plans a trip
      Then the Trip Planner provides the suggested itineraries according to options
