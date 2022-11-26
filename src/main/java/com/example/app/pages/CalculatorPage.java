package com.example.app.pages;

import static com.example.app.drivers.AndroidDriverInit.driver;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculatorPage extends BasePageObject {

  public String getTitle() {
//    By locator = MobileBy.xpath(
//        "//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView");
//    AndroidElement labelTitle = driver.findElement(locator);
//    return labelTitle.getText();
    return getText(MobileBy.xpath("//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView"));
  }

  public boolean checkHamburgerBtnAppear() {
//    By locator = MobileBy.AccessibilityId("Open navigation drawer");
//    AndroidElement hamburgerBtn = driver.findElement(locator);
//    return hamburgerBtn.isDisplayed();

    //explicit wait
    By locator = MobileBy.AccessibilityId("Open navigation drawer");
    WebDriverWait wait = new WebDriverWait(driver, 3, 1000);
    AndroidElement hamburgerBtn = (AndroidElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    return hamburgerBtn.isDisplayed();
  }

  public String getResult(){
    return getText(MobileBy.id("tv_result"));
  }

  public void inputAngka1(int angka1){
    type(MobileBy.id("et_1"),(Integer.toString(angka1)));
  }
//  public void inputInvalidAngka1(String angka1){
//    type(MobileBy.id("et_1"),(angka1));
//  }
  public void inputAngkaDesimal1(double angkaDesimal1){
    type(MobileBy.id("et_1"), (Double.toString(angkaDesimal1)));
  }

  public void inputAngka2(int angka2){
    type(MobileBy.id("et_2"),(Integer.toString(angka2)));
  }
//  public void inputInvalidAngka2(String angka2){
//    type(MobileBy.id("et_2"),(angka2));
//  }
  public void inputAngkaDesimal2(double angkaDesimal2){
    type(MobileBy.id("et_2"), (Double.toString(angkaDesimal2)));
  }

  public void clickDropDownButton(){
    click(MobileBy.id("com.isl.simpleapp:id/spinner_1"));
  }

//  By plusButton = MobileBy.xpath("//android.widget.TextView[@text='+']");
//  public void clickPlusButton(){
//    click(plusButton);
//  }

//  By plusButton = MobileBy.xpath("//android.widget.TextView[@resource-id='android:id/text1'][1]");
  By plusButton = MobileBy.xpath("//android.widget.TextView[@text='+']");
  public void tapsPlusButton(){
    click(plusButton);
  }
  public void clickMinusButton(){

    click(MobileBy.xpath("//android.widget.TextView[@text='-']"));
  }
  public void clickMultiplyButton(){

    click(MobileBy.xpath("//android.widget.TextView[@text='*']"));
  }
  public void clickDivisionButton(){

    click(MobileBy.xpath("//android.widget.TextView[@text='/']"));
  }
  public void clickEqualButton(){

    click(MobileBy.id("acb_calculate"));
  }

  public boolean checkResultIsDisplayed(){
    By locator = MobileBy.id("tv_result");
    WebDriverWait wait = new WebDriverWait(driver, 10, 100);
    AndroidElement resultIsDisplayed = (AndroidElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    return  resultIsDisplayed.isDisplayed();
  }


}
