package MyLearnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator4XPath {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();

        //Absolute xpath

        //driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/input[4]")).sendKeys("T-shirts");
        // driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/input[4]")).click();

        //Relative xpath

        // driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("T-shirts");
        //driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();

        // =======================================

        //xpath with 'or'

      //  driver.findElement(By.xpath("//input[@id='search_query_top' or @name='search_queryX']")).sendKeys("T-shirts");
      //  driver.findElement(By.xpath("//button[@name='submit_searchX' or @class='btn btn-default button-search']")).click();

     // =========================================
       /* contains & starts-with()
       -----------------------------
       id ="firstname

       // tagName[contains(@attribute, 'value')]
       // input[@id='firstname']   ----> basic xpath
       // input[contains(@id, 'first')] --> using contains()

       //input[@id='start']
       //input[@id='stop']

       //input[contains@id, 'st')] --> Dynamic xpath

       //input[starts-with(@id, 'st')] --> Dynamic xpath
        */
       // ============================================
       /* xpath with contains()
        */
//driver.findElement(By.xpath("//input[contains(@id,'query_top')]")).sendKeys("T-shirts"); //id=search_query_top
//driver.findElement(By.xpath("//button[contains(@name,'search')]")).click(); //name=submit_search
//============================
//xpath start-with()
      //  driver.findElement(By.xpath("//input[starts-with(@id,'query_top')]")).sendKeys("T-shirts"); //id=search_query_top
      //  driver.findElement(By.xpath("//button[starts-with(@name,'submit')]")).click(); //name=submit_search

//==============================
        //xpath with text()
//driver.findElement(By.xpath("//a[text()='Women']")).click(); //Women Tab
      //========================================

        //chained xpath

        //form[@id='searchbox']//input[4]

        driver.findElement(By.xpath("//form[@id='searchbox']//input[@id='search_query_top']")).sendKeys("T-shirts");
   driver.findElement(By.xpath("//form[@id='searchbox']//button[@name='submit_search']")).click();

    }
}