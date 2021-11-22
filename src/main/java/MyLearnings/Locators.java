package MyLearnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    //We can identify various elements on the web using locators
    //Locators are addresses that identify a web element uniquely within the page

    /*
    Locators: id, name, Linktext, partialLinktext, Class Name, TagName
    Customized locators: css selector --> Tag & ID; Tag & Class; Tag & Attribute; Tag, class & attribute
     Customized locators: XPath --> Absolute XPath, Relative XPath
     */

    /*
    In LinkText we write whole text
    in partialLinkText we write not whole text
     */

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");

        //driver.manage().window().maximize(); //maximize web page

        //id & name locators
        WebElement searchbox=driver.findElement(By.id("search_query_top"));
       searchbox.sendKeys("T-shirts");

       driver.findElement(By.name("submit_search")).click();

       //linkText & partialLinkText
      //  driver.findElement(By.linkText("Printed Chiffon Dress")).click();

         driver.findElement(By.partialLinkText("Chiffon Dress")).click();


        // class & tagName we use to find multiple elements

    }
}
