package Homework.HW1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class TC1 {
        public static void main(String[] args) throws InterruptedException{
            WebDriver driver=new ChromeDriver();
            driver.get("https://demoqa.com/text-box");
            driver.manage().window().maximize();
            driver.findElement(By.id("userName")).sendKeys("Jan");
            driver.findElement(By.id("userEmail")).sendKeys("jan@gmail.com");
            driver.findElement(By.id("currentAddress")).sendKeys("750 Lincoln Ave");
            driver.findElement(By.id("permanentAddress")).sendKeys("750 Lincoln Ave");
            Thread.sleep(2000);
            WebElement element=driver.findElement(By.id("submit"));
            JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;
            javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)",element);
            Thread.sleep(2000);
            element.click();

            Thread.sleep(2000);

            if(driver.findElement(By.id("output")).isDisplayed()){
                System.out.println(true);
            }else{
                System.out.println(false);
            }

            Thread.sleep(2000);
            driver.quit();




        }
    }

