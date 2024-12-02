package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static driver.Drivers.getDriver;

public class Utils {

    public static WebElement getElement(By by) {
        WebElement element = new WebDriverWait(getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(by));
        return element;
    }

    public static void elementClick(By by) {
        WebElement element = getElement(by);
        element.click();
    }

    public static void elementSendKeys(By by, String text) {
        WebElement element = getElement(by);
        element.click();
        element.clear();
        element.sendKeys(text);
    }

    public static boolean isElementPresent(By by) {
        boolean isPresent = false;
        try {
            getDriver().findElement(by);
            isPresent = true;
        }catch (Exception e) {
            isPresent = false;
        }
        return isPresent;
    }

}
