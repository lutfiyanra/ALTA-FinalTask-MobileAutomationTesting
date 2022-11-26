@calculate @android @tugas
  Feature: operating calculator using all operator

    Background:
      Given User is on login page
      When user input username "admin"
      When user input password "admin"
      When user click button login
      Then user successfully login

    @positive
    Scenario: addition operation with valid number
      Given User is already on login page
      When User input angka1 field is 10
      And User click dropdown button
      And User select plus button
      And User input angka2 field is 30
      And User click equal button
      Then The addition operation result is 40

    @positive
    Scenario: Substraction operation with valid number
      Given User is already on login page
      When User input angka1 field is 30
      And User input angka2 field is 20
      And User click dropdown button
      And User select substract button
      And User click equal button
      Then The subtraction operation result is 10

    @postive
    Scenario: Multiplication operation with valid number
      Given User is already on login page
      When User input angka1 field is 20
      And User input angka2 field is 5
      And User click dropdown button
      And User select multiply button
      And User click equal button
      Then The multiplication operation result is 100

    @positive
    Scenario: Division operation with valid number
      Given User is already on login page
      When User input angka1 field is 20
      And User input angka2 field is 4
      And User click dropdown button
      And User select divide button
      And User click equal button
      Then The division operation result is 5

    @positive
    Scenario: addition operation with valid decimal number
      Given User is already on login page
      When User input angkadesimal1 field is 1.2
      And User input angkadesimal2 field is 2.8
      And User click dropdown button
      And User select plus button
      And User click equal button
      Then The decimal addition operation result is 4.0

    @positive
    Scenario: Substraction operation with valid number
      Given User is already on login page
      When User input angkadesimal1 field is 3.2
      And User input angkadesimal2 field is 1.1
      And User click dropdown button
      And User select substract button
      And User click equal button
      Then The decimal subtraction operation result is 2.1

    @postive
    Scenario: Multiplication operation with valid number
      Given User is already on login page
      When User input angkadesimal1 field is 1.2
      And User input angkadesimal2 field is 0.2
      And User click dropdown button
      And User select multiply button
      And User click equal button
      Then The decimal multiplication operation result is 0.24

    @positive
    Scenario: Division operation with valid number
      Given User is already on login page
      When User input angkadesimal1 field is 8.6
      And User input angkadesimal2 field is 2.2
      And User click dropdown button
      And User select divide button
      And User click equal button
      Then The decimal division operation result is 3.9

#    @negative
#    Scenario Outline: addition operation with invalid number
#      Given User is already on login page
#      When user input angka1 field is "<InvalidNumberInput1>"
#      And user input angka2 field is "<InvalidNumberInput2>"
#      And User click dropdown button
#      And User select divide button
#      And User click equal button
#      Then addition results is "NaN"
#      Examples:
#        |InvalidNumberInput1|InvalidNumberInput2|
#        | ab                | de                |
#        | #@                | 12                |
#        | e32               | %^                |
#
#    @negative
#    Scenario Outline: Substraction operation with invalid number
#      Given User is already on login page
#      When user input angka1 field is "<InvalidNumberInput1>"
#      And user input angka2 field is "<InvalidNumberInput2>"
#      And User click dropdown button
#      And User select divide button
#      And User click equal button
#      Then Substraction results is "NaN"
#      Examples:
#        |InvalidNumberInput1|InvalidNumberInput2|
#        | gh                | jk                |
#        | %^                | 34                |
#        | k87               | &#                |
#
#    @negative
#    Scenario Outline: operation multiply with invalid number
#      Given User is already on login page
#      When user input angka1 field is "<InvalidNumberInput1>"
#      And user input angka2 field is "<InvalidNumberInput2>"
#      And User click dropdown button
#      And User select divide button
#      And User click equal button
#      Then Multiplication results is "NaN"
#      Examples:
#        |InvalidNumberInput1|InvalidNumberInput2|
#        | xy                | ui                |
#        | !@                | 21                |
#        | u23               | &^                |
#
#    @negative
#    Scenario Outline: operation division with invalid number
#      Given User is already on login page
#      When user input angka1 field is "<InvalidNumberInput1>"
#      And user input angka2 field is "<InvalidNumberInput2>"
#      And User click dropdown button
#      And User select divide button
#      And User click equal button
#      Then Division results is "NaN"
#      Examples:
#        |InvalidNumberInput1|InvalidNumberInput2|
#        | jk                | er                |
#        | #@                | 12                |
#        | e32               | %^                |
