package SeleniumMentoringAhmet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1Godaddy {
     /*
Assignment Level - Beginner
Test Case 1 - Open Godaddy.com and maximize browser window.
Steps to Automate:
1. Launch browser of your choice say., Firefox, chrome etc.
2. Open this URL - https://www.godaddy.com/
3. Maximize or set size of browser window.
4. Close browser.

      */

    public static void main(String[] args){

        //Interview QA: What is the function of webdriver?
     // WEBDRIVER  is a way of manipulating (changing) the web browser
        //What is FIREFOX DRIVER >?
        //Firefox driver is GECHKO driver>
        //What is the difference between navigate to and get?
        // Navigate to: it will wait for the specific element that you are looking for
        // It has also some methods like forward, refresh, back..
        // Get : It waits for all elements to be loaded on the website
        //It doesnt have methods

        //What is difference between close and quit?
        //CLOSE  will close the current web browser(TAB)
        //QUIT will close the driver(it means all of the web browser (tabs)

        WebDriver driver = new ChromeDriver();   // creating a driver

        driver.get("https://www.godaddy.com/");
           //SUGGESTION : IF TOU PUT ALL THE ELEMENTS LOCATION CORRECT AND STILL THEY ARE NOT WORKING.
        // MAKE THE WEB BROWSER FULL SCREEN
        //2.SUGGESTION : PUT THE THREAD.SLEEP(3000)
        driver.manage().window().maximize();
        //Thread.sleep(3000);
        driver.close();


    }
}
