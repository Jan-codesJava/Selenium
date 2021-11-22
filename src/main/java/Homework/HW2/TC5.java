package Homework.HW2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC5 {


   /* Navigate to "https://demoqa.com/select-menu"
    Select Group 2, option 1
    Select Prof. and validate they are selected.

    */


    @Test

    public void test() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/select-menu");

      //  Select select = new Select("Group 2, option 1");

     }


       /* WebElement dropDown= driver.findElement(By.id("Select Value"));
        Select select= new Select(dropDown);
        String actualFirstSelected = select.getFirstSelectedOption().getText().trim();
        String expectedFirstSelect="Select Option";



        Thread.sleep(2000);
        select.selectByVisibleText("Group 2, option 1");

        Assert.assertEquals(actualFirstSelected, expectedFirstSelect, "first selected");

        */
    }


