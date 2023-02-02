package com.xfleet.test.week1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1 {
    @Test
    public void test1() {

        // 1. Set up "browser driver"
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to "https://www.selenium.dev"
        driver.get("https://www.selenium.dev");

        // 3. Verify the URL is "https://www.selenium.dev/"

        String expectedURL = "https://www.selenium.dev/";
        String actualURL = driver.getCurrentUrl();

        Assert.assertEquals(actualURL,expectedURL,"Verifying current url");

        driver.close();









    }
}
