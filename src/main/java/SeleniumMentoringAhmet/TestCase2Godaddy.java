package SeleniumMentoringAhmet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2Godaddy {

   /* Test Case 2 - Open Godaddy.com and Print it's Page title.
    Steps to Automate:
            1. Launch browser of your choice say., Firefox, chrome etc.
            2. Open this URL - https://www.godaddy.com/
            3. Maximize or set size of browser window.
4. Get Title of page and print it.
4. Get URL of current page and print it.
            5. Close browser.

    */

    public static void main(String []args){

        WebDriver driver = new ChromeDriver();   // creating a driver

        driver.navigate().to("https://www.godaddy.com/");
        //driver.manage()..window().maximize();

        //WHAT IS THE DRIVER AND ELEMENT METHODS?
       // WebElement element = driver.findElement();

        String Title = driver.getTitle();
        System.out.println(Title);
        System.out.println(driver.getCurrentUrl());
        if(driver.getTitle().equals("Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy")){
            //choose needed text and with right hand do evaluate expression
            System.out.println("your test is passed");
        }else{
            System.out.println("your test is failed");
        }
        driver.close();
    }
}
