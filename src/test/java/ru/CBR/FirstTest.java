package ru.CBR;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    @Test
    public void firstTest() {

        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "//drivers/chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://www.cbr.ru/");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Центральный банк Российской Федерации | Банк России"));
        driver.quit();

    }
}
