package com.Medcare_1.base;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.Medcare_1.utilities.ConfigReader;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;




public class BaseTest {
    
    public WebDriver driver;
    public ATUTestRecorder recorder;

    // ✅ No-arg constructor required for child classes
    public BaseTest() {
        // Initialize if necessary
    }

    // Optional: keep this if you're using it somewhere else
    public BaseTest(WebDriver driver) {
        this.driver = driver;
    }

    @BeforeMethod
    @Parameters("Uesrid")
    public void setup(Method method, String Uesrid) throws Exception {
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
        new java.io.File("videos").mkdirs();

        recorder = new ATUTestRecorder("videos/", method.getName() + "_" + timeStamp, false);
        recorder.start();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ConfigReader.getProperty("url"));

        com.Medcare_1.pages.Login loginScreen = new com.Medcare_1.pages.Login(driver);
        loginScreen.login_Medcare(Uesrid);
    }

    @AfterMethod
    public void teardown(ITestResult result) throws ATUTestRecorderException {
        if (recorder != null) {
            recorder.stop();
        }
        if (driver != null) {
            driver.quit();
        }
    }
}
