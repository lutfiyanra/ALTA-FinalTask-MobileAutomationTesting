package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

import java.util.regex.Matcher;

public class CalculateSteps extends BaseTest {

    @Given("User is already on login page")
    public void userIsAlreadyOnLoginPage() {
//        loginPage.inputUsername("admin");
//        loginPage.inputPassword("admin");
//        loginPage.clickLoginBtn();
    }
    @When("User input angka1 field is {int}")
    public void userInputAngka1FieldIs(int value){
        calculatorPage.inputAngka1(value);
    }
    @And("User click dropdown button")
    public void userClickDropdownButton() {
        calculatorPage.clickDropDownButton();
    }
    @And("User select plus button")
    public void userSelectPlusButton()
    {   calculatorPage.tapsPlusButton();
    }
    @And("User input angka2 field is {int}")
    public void userInputAngka2FieldIs(int value) {
        calculatorPage.inputAngka2(value);
    }
    @And("User click equal button")
    public void userClickEqualButton() {
        calculatorPage.clickEqualButton();
    }
    @Then("The addition operation result is {int}")
    public void theAdditionOperationResultIs(int plusResult) {
//        String result = calculatorPage.getResult();
//        Assertions.assertEquals("Hasil : " + plusResult, result);
//        boolean isDisplayed = calculatorPage.checkResultIsDisplayed();
//        Assertions.assertTrue(isDisplayed);
//        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
        calculatorPage.getResult();
        Assert.assertEquals("Hasil : " + plusResult, calculatorPage.getResult());
    }

    @And("User select substract button")
    public void userSelectSubstractButton() {
        calculatorPage.clickMinusButton();
    }



    @Then("The subtraction operation result is {int}")
    public void theSubtractionOperationResultIs(int substractionResult) {
        String result = calculatorPage.getResult();
        Assertions.assertEquals("Hasil : " + substractionResult, result);
        boolean isDisplayed = calculatorPage.checkResultIsDisplayed();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }

    @And("User select multiply button")
    public void userSelectMultiplyButton() {
        calculatorPage.clickMultiplyButton();
    }

    @Then("The multiplication operation result is {int}")
    public void theMultiplicationOperationResultIs(int multiplyResult) {
        String result = calculatorPage.getResult();
        Assertions.assertEquals("Hasil : " + multiplyResult, result);
        boolean isDisplayed = calculatorPage.checkResultIsDisplayed();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }


    @And("User select divide button")
    public void userSelectDivideButton() {
        calculatorPage.clickDivisionButton();
    }

    @Then("The division operation result is {int}")
    public void theDivisionOperationResultIs(int divideResult) {
        String result = calculatorPage.getResult();
        Assertions.assertEquals("Hasil : " + divideResult, result);
        boolean isDisplayed = calculatorPage.checkResultIsDisplayed();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }

    @When("User input angkadesimal1 field is {double}")
    public void userInputAngkaDesimal1FieldIs(double value) {
        calculatorPage.inputAngkaDesimal1(value);
    }


    @And("User input angkadesimal2 field is {double}")
    public void userInputAngkadesimal2FieldIs(double value) {
        calculatorPage.inputAngkaDesimal2(value);
    }

    @Then("The decimal addition operation result is {double}")
    public void theDecimalAdditionOperationResultIs(double plusResult) {
        String result = calculatorPage.getResult();
        Assertions.assertEquals("Hasil : " + plusResult, result);
        boolean isDisplayed = calculatorPage.checkResultIsDisplayed();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }

    @Then("The decimal subtraction operation result is {double}")
    public void theSubtractionOperationResultIs(double substractionResult) {
        String result = calculatorPage.getResult();
        Assertions.assertEquals("Hasil : " + substractionResult, result);
        boolean isDisplayed = calculatorPage.checkResultIsDisplayed();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }


    @Then("The decimal multiplication operation result is {double}")
    public void theMultiplicationOperationResultIs(double multiplicationResult) {
        String result = calculatorPage.getResult();
        Assertions.assertEquals("Hasil : " + multiplicationResult, result);
        boolean isDisplayed = calculatorPage.checkResultIsDisplayed();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }


    @Then("The decimal division operation result is {double}")
    public void theDivisionOperationResultIs(double divisionResult) {
        String result = calculatorPage.getResult();
        Assertions.assertEquals("Hasil : " + divisionResult, result);
        boolean isDisplayed = calculatorPage.checkResultIsDisplayed();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }

//    @When("user input angka1 field is {string}")
//    public void userInputAngka1FieldIs(String value) {
//        calculatorPage.inputInvalidAngka1(value);
//    }
//
//    @And("user input angka2 field is {string}")
//    public void userInputAngka2FieldIs(String value) {
//        calculatorPage.inputInvalidAngka2(value);
//    }

    @Then("addition results is {string}")
    public void additionResultsIs(String text) {
        Assertions.assertTrue(calculatorPage.checkResultIsDisplayed(), text);
    }

    @Then("Substraction results is {string}")
    public void substractionResultsIs(String text) {
        Assertions.assertTrue(calculatorPage.checkResultIsDisplayed(), text);
    }


    @Then("Multiplication results is {string}")
    public void multiplicationResultsIs(String text) {
        Assertions.assertTrue(calculatorPage.checkResultIsDisplayed(), text);
    }

    @Then("Division results is {string}")
    public void divisionResultsIs(String text) {
        Assertions.assertTrue(calculatorPage.checkResultIsDisplayed(), text);
    }
}
