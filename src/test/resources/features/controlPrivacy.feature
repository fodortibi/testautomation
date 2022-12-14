Feature: The user shall be able to control the privacy with cookies in BudapestGO

  "
  Your privacy is important for us
  "
  Rule: It is allowed to control the privacy with cookies

    Background:
      Given open main page

      Scenario: Accept the cookies
        Given the browser language is set to "english"
        When cookies dialog is accepted
        Then it uses cookies

      Scenario: Reject the cookies
        Given the browser language is set to "english"
        When cookies dialog is rejected
        Then it does not use cookies
