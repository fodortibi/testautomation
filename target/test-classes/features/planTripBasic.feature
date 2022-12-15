Feature: 8.)  As a user I can use the Trip Planner,
  so that I define From and To locations.

  Rule: It is allowed to plan a trip with basic data

    Background:
      Given open main page
      And accept cookies

    @smoke
    Scenario: Plan a trip with the Trip Planner
      Given language is set to "english"
      When the user provides basic trip data
      And the user plans a trip
      Then the Trip Planner provides the suggested itineraries
