package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddToCart extends BaseTest {

    @Test
    public void addProductToCart() throws InterruptedException {
        driver.findElement(By.linkText("Laptops")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Sony vaio i5")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Add to cart")).click();
        Thread.sleep(2000);

        // Handle alert
        String alertText = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        Assert.assertEquals(alertText, "Product added");

        driver.findElement(By.id("cartur")).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.getPageSource().contains("Sony vaio i5"), "Item not added to cart!");
    }
}
