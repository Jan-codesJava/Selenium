package Homework.HW2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC2 {

    /*
    Steps
Navigate to "https://www.saucedemo.com/"
Enter username "standard_user"
Enter password "secret_sauce"
Click Login button
Select Price (low-high) from drop down box
Validate the products are displayed according to their price
and they are displayed low price to high price Steps
     */

    @Test
    public void test() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/");

        WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
        username.sendKeys("standard_user");


        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("secret_sauce");

        Thread.sleep(2000);

        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        loginButton.click();

       // Select productSort = new Select(driver.findElement(By.xpath("//select[@class=/"product_sort_container"));
       // productSort.selectByVisibleText("Price (low to high)");
     //  List<WebElement> actual = driver.findElements(By.className("pricebar"))
    }
}