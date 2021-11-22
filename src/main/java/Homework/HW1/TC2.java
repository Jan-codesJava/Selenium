package Homework.HW1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC2 {
        public static void main(String[] args) throws InterruptedException {
            WebDriver driver=new ChromeDriver();
            driver.get("https://demoqa.com/radio-button");
            Thread.sleep (1000);
            driver.findElement(By.xpath("//label[@for='yesRadio']")).click();
            WebElement element= driver.findElement(By.xpath("//label[@for='yesRadio']"));
            String expected="Yes";
            if(element.getText().equals(expected)){
                System.out.println("You have selected Yes");
            }else{
                System.out.println(false);
            }
            Thread.sleep (1000);
            driver.findElement(By.xpath("//label[@for='impressiveRadio']")).click();
            WebElement element1=driver.findElement(By.xpath("//p[@class='mt-3']/span"));
            String expectedImpressive="Impressive";
            if(element1.getText().equals(expectedImpressive)){
                System.out.println("You have selected Impressive");
            }else{
                System.out.println(false);
            }
            Thread.sleep (1000);
            WebElement element2=driver.findElement(By.id("noRadio"));
            if(!element2.isEnabled()){
                System.out.println("No radio button is disabled ->"+!element2.isEnabled());
            }else{
                System.out.println(false);
            }
            driver.quit();
        }
    }

