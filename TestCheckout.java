package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCheckout extends BaseTest {

    @Test
    public void completeCheckoutFlow() throws InterruptedException {
        driver.findElement(By.linkText("Laptops")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Dell i7 8gb")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Add to cart")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        driver.findElement(By.id("cartur")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Place Order']")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("name")).sendKeys("John Doe");
        driver.findElement(By.id("country")).sendKeys("India");
        driver.findElement(By.id("city")).sendKeys("Bangalore");
        driver.findElement(By.id("card")).sendKeys("1234123412341234");
        driver.findElement(By.id("month")).sendKeys("12");
        driver.findElement(By.id("year")).sendKeys("2025");
        driver.findElement(By.xpath("//button[text()='Purchase']")).click();

        Thread.sleep(2000);
        WebElement successMsg = driver.findElement(By.xpath("//h2[contains(text(),'Thank you for your purchase!')]"));
        Assert.assertTrue(successMsg.isDisplayed(), "Checkout failed!");
    }
}
