package MyLearnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get(" https://www.facebook.com/");

        driver.manage().window().maximize(); //maximize web page

        //Tag &ID
       // driver.findElement(By.cssSelector("input#email")).sendKeys("David");
     // driver.findElement(By.cssSelector("#email")).sendKeys("David");

      //Tag & Class
      //  driver.findElement(By.cssSelector("input.inputText")).sendKeys("John");
       // driver.findElement(By.cssSelector(".inputText")).sendKeys("John");

        //Tag & Attribute
       // driver.findElement(By.cssSelector("[name=email]")).sendKeys("Smith");
        driver.findElement(By.cssSelector("input[name=email]")).sendKeys("abc");

    }
}
