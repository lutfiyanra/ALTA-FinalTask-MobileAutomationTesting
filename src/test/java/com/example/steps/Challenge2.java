package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Challenge2 extends BaseTest {
    @Given("user already on list menu")
    public void userAlreadyOnListMenu() {
        navigationMenu.clickHamburgerBtn();
        navigationMenu.clickListMenu();
    }

    @When("user tap hold on list kesembilan")
    public void userTapHoldOnListKesembilan() {
        listPage.longPress();
    }

    @Then("info message will appear")
    public void infoMessageWillAppear() {
    }

    @When("user multiple tap on list ke delapan puluh")
    public void userMultipleTapOnListKeDelapanPuluh() {
        listPage.swipeList();
        listPage.multipleTaps();
    }
}
