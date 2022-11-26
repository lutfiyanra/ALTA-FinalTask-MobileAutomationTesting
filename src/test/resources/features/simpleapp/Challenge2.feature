@challenge2 @android @tugas
Feature: long press and tap multiple times Features on list menu

  Background:
    Given User is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login

  @test
  Scenario: long press on list menu
    Given user already on list menu
    When user tap hold on list kesembilan
    Then info message will appear

  @test
  Scenario: multiple tap on list menu
    Given user already on list menu
    When user multiple tap on list ke delapan puluh
    Then info message will appear


