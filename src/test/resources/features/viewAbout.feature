Feature: As a user I can use the About function,
  so that version information will be displayed.

  Rule: It is allowed to view the about

    Background:
      Given open main page
      And accept cookies

      @smoke
      Scenario: View the about window
        Given language is set to "english"
        When the about link has been clicked
        Then it shows the version of the BudapestGO
