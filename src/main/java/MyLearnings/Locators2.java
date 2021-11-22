package MyLearnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");

        driver.manage().window().maximize(); //maximize web page

        //className
       int sliders = driver.findElements(By.className("homeslider-container")).size(); //classname - locator
        System.out.println(sliders);

        //tagName
        int links = driver.findElements(By.tagName("a")).size();
        System.out.println(links);
    }
}
