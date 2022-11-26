package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import java.time.Duration;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import static com.example.app.drivers.AndroidDriverInit.driver;

public class ListPage extends BasePageObject {

  public void swipeList() {
//    TouchAction action = new TouchAction(getDriver());
//    AndroidElement containerList = find(MobileBy.id("recycler_view"));
//    Point coordinate = containerList.getCenter();
//    PointOption start = PointOption.point(coordinate);
//    PointOption end = PointOption.point(coordinate.getX(), coordinate.getY() + -1000);
//    //builder
//    action
//        .press(start)
//        .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
//        .moveTo(end)
//        .release()
//        .perform();

    AndroidElement element = find(MobileBy.AndroidUIAutomator(
        "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().text(\"List ke-80\"))"));
  }

  public void longPress(){
    WebElement holdElement= find(MobileBy.xpath("//android.widget.TextView[@text=\"List ke-9\"]"));
    AndroidTouchAction action = new AndroidTouchAction(driver);
    action.longPress(LongPressOptions.longPressOptions()
                    .withElement(ElementOption.element(holdElement))
                    .withDuration(Duration.ofMillis(5000)))
            .release()
            .perform();
  }

  public void multipleTaps(){
    WebElement element= find(MobileBy.xpath("//android.widget.TextView[@text=\"List ke-80\"]"));
    TouchAction action = new TouchAction(getDriver());
    action.tap(TapOptions.tapOptions().withTapsCount(5)
                    .withElement(ElementOption.element(element))).perform();
  }

}
