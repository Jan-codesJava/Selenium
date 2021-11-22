package MyLearnings.dropdowntests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class verifyDropDownOptions {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.id("animals"));
        Select se = new Select(element);

        List originalList = new ArrayList();

        List<WebElement> options = se.getOptions();

        for (WebElement e : options) {
            originalList.add(e.getText());
        }
        System.out.println(originalList);

        List tempList = new ArrayList();

        tempList = originalList;
        System.out.println("Before sorting temp list: " + tempList);

        Collections.sort(tempList);

        System.out.println("After sorting temp list: " + tempList);

        //compare
        if (originalList == tempList) {
            System.out.println("Dropdown sorted");
        } else {
            System.out.println("Dropdown not sorted");
        }
    }
}
