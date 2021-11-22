package Homework.HW2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC4 {

    /*
    Steps
Navigate to "https://www.saucedemo.com/"
Enter username "standard_user"
Enter password "secret_sauce"
Click Login button
Find the highest priced two product on the page
Add them to the cart
Click cart button
Click CheckOut Button
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

 /*
 Fill out First Name, Last Name and Zip Code
Click continue button
Validate Item total price is equals to total price ofselected product
Validate Total is equals to Item Total price plus Taxamount
Validate
the Url contains "checkout"
Click finish button
Validate "THANK YOU FOR YOUR ORDER" message isdisplayed
  */
    }
}