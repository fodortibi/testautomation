Feature: The user shall be able to change the language in BudapestGO

  Rule: It is allowed to change the language

    Background:
      Given open main page
      And accept cookies

      @smoke
      Scenario: Change the language to Hungarian
        Given language is set to "english"
        When change the language to "hungarian"
        Then it shows elements in "hungarian"

      Scenario: Change the language to English
        Given language is set to "hungarian"
        When change the language to "english"
        Then it shows elements in "english"

        @ChangeLangData
      Scenario Outline: Change language
        Given language is set to "<language>"
        When change the language to "<new_language>"
        Then it shows elements in "<new_language>"

        Examples:
        | language | new_language |
        | hungarian | english |
        | english | hungarian |

        @Datatable
      Scenario: Change language with datatable
        Given language is set to "hungarian"
        When change the language to "english"
        Then it shows elements in "english" with
        | language | header_text |
        | hungarian | uuUtazástervezés |
        | english   | TTTrip Planner   |

