package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogout extends BaseTest {

    @Test
    public void logoutTest() throws InterruptedException {
        // First, login
        driver.findElement(By.id("login2")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("loginusername")).sendKeys("testuser");
        driver.findElement(By.id("loginpassword")).sendKeys("password123");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        Thread.sleep(3000);

        // Now logout
        driver.findElement(By.id("logout2")).click();
        Thread.sleep(2000);

        Assert.assertTrue(driver.findElement(By.id("login2")).isDisplayed(), "Logout unsuccessful!");
    }
}
