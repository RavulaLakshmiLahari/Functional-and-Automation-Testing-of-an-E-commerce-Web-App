package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin extends BaseTest {

    @Test
    public void validLogin() throws InterruptedException {
        driver.findElement(By.id("login2")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("loginusername")).sendKeys("testuser");
        driver.findElement(By.id("loginpassword")).sendKeys("password123");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        Thread.sleep(3000);
        WebElement welcomeMsg = driver.findElement(By.id("nameofuser"));
        Assert.assertTrue(welcomeMsg.getText().contains("Welcome"), "Login failed!");
    }

    @Test
    public void invalidLogin() throws InterruptedException {
        driver.findElement(By.id("login2")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("loginusername")).sendKeys("wronguser");
        driver.findElement(By.id("loginpassword")).sendKeys("wrongpass");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        Thread.sleep(2000);
        // Handle alert for invalid login
        String alertText = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        Assert.assertEquals(alertText, "User does not exist.");
    }
}
