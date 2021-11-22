package Homework.HW1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class TC3 {
        public static void main(String[] args) {
            WebDriver driver=new ChromeDriver();
            driver.get("https://www.saucedemo.com/");
            driver.findElement(By.id("user-name")).sendKeys("Java");
            driver.findElement(By.id("password")).sendKeys("Selenium");
            driver.findElement(By.id("login-button")).click();
            String str="Epic sadface: Username and password do not match any user in this service";
            if(driver.findElement(By.xpath("//h3[@data-test='error']")).getText().equals(str)){
                System.out.println(true);
            }else{
                System.out.println(false);
            }

        }
    }


