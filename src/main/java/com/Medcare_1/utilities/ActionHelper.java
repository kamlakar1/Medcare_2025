package com.Medcare_1.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActionHelper {

    private WebDriver driver;
    private final int delay = 3000; // Change delay globally here

    public ActionHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By locator) {
        driver.findElement(locator).click();
        sleep();
    }

    public void sendKeys(By locator, String text) {
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
        sleep();
    }

    public String getText(By locator) {
        String text = driver.findElement(locator).getText();
        sleep();
        return text;
    }

    private void sleep() {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
