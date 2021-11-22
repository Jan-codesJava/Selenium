package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utils.BrowserUtils;

public class JSPractice {

    @Test
    public void test(){

        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://www.techtorialacademy.com/");

        JavascriptExecutor javascriptExecutor= (JavascriptExecutor) driver;

        String title =  javascriptExecutor.executeScript("return document.title").toString(); //get title

        System.out.println(title);

       // document - object name
            //  title -  variable inside of class, returns string

        WebElement browseCourse = driver.findElement(By.linkText("Browse Course"));
        javascriptExecutor.executeScript("arguments[0].click()", browseCourse);

        WebElement copyRights= driver.findElement(By.xpath("//p[contains(text(), 'Copyrights')]"));

        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", copyRights);

        BrowserUtils.scrollToView(driver, copyRights);

        // find the student login button on the top of the page
        // and scroll the page to top till studentLogin button is visible.

        WebElement studentLogin = driver.findElement(By.linkText("Student Login"));

        javascriptExecutor.executeScript("arguments[0].click()", studentLogin);

    }
}
