package com.Medcare_1.base;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
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

    @BeforeMethod
    public void setup(Method method) throws Exception {
        // Create timestamp for unique video name
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());

        // Create folder if not exists (you can also do this manually)
        new java.io.File("videos").mkdirs();

        // Start video with test method name
        recorder = new ATUTestRecorder("videos/", method.getName() + "_" + timeStamp, false);
        recorder.start();

        // Set up WebDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ConfigReader.getProperty("url"));  // make sure ConfigReader works
    }

    @AfterMethod
    public void teardown(ITestResult result) throws ATUTestRecorderException {
        if (recorder != null) {
            recorder.stop();  // stop video
        }

        if (driver != null) {
            driver.quit();  // close browser
        }
    }
}
