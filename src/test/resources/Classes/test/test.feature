Feature: Example tests

  Scenario: Registrirane na roditel
    Given Open Parent register screen
    When Въведе валидно потребителско име: "Иван"
    And въведе валидна потребителска парола: "parola"
    And Въведе elektronna poshta : "ivan@abv.bg"
    And Въведе telefonen nomer : "0222588888"
    And Въведе studentsko id : "12222d"
    And натисне бутона за вход в системата
    Then Вижда съобщение за: "Success".

  Scenario: Neyspeshno  Registrirane na roditel
    Given Open Parent register screen
    When Въведе валидно потребителско име: ""
    And въведе валидна потребителска парола: "parola"
    And Въведе elektronna poshta : "ivan@abv.bg"
    And Въведе telefonen nomer : "0222588888"
    And Въведе studentsko id : "12222d"
    And натисне бутона за вход в системата
    Then Вижда съобщение за: "invalid username or password".

  Scenario Outline: vuvejdane na ocenka
    Given Open Online dairy
    When въведе валидна ocenka: "<mark>"
    And Въведе валидно студенско ид име: "<studentID>"
    And натисне бутона за вход в системата ocenka
    Then Вижда съобщение за ocenka: "<message>".
    Examples:
      | studentID | mark | message |
      | 12222 | 6 | success |
    | 12221 | 6 | invalid studentID |
      | 12222 | 11 | invalid mark |




  Scenario Outline: Roditel proverqva ocenka
    Given Open Check screen
    When  Въведе валидно потребителско име: "<username>" za check
    And въведе валидна потребителска парола: "<password>" za check
    And Въведе telefonen nomer : "<number>" za check
    And Въведе studentsko id : "<studentID>" za check
    And Mockvane na ocenka : "<studentID2>" , "<gradeList>"
    And натисне бутона за вход в системата za check
    Then Вижда съобщение за: "<message>". za check

    Examples:
      |username | password | number | studentID | studentID2| gradeList |message|
      |Иван | parola | 0882288212 | 12222 | 12222| 3,5,5,5,5,5,5 |success|
      |Иван | parola | 0882288212 | 12222 | 12222| 3,5,5,5,5,5,5,6,6,6,6,6,6|too much grades|

  #Scenario: Roditel proverqva ocenka failed
   # Given Open Check screen
   # When  Въведе валидно потребителско име: "Иван" za check
   # And въведе валидна потребителска парола: "parola" za check
   # And Въведе telefonen nomer : "0222588888" za check
   # And Въведе studentsko id : "12232d" za check
   # And Mockvane na ocenka : "12222d" , "5"
  # And натисне бутона за вход в системата za check
   # Then Вижда съобщение за: "failed". za check


    #