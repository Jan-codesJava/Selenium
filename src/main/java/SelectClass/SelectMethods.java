package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BrowserUtils;

import java.util.*;


public class SelectMethods {

    @Test
    public void test(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.cars.com/");

        WebElement price= driver.findElement(By.id("make-model-max-price"));
        Select select=new Select(price);
        List<WebElement> prices=select.getOptions();
       // Set<String> actualOrder= new LinkedHashSet<>();
       // Set<String> expectedOrder=new TreeSet<>();
        List<String> actual= new ArrayList<>();
        List<String> expected=Arrays.asList("No max price", "$2,000", "$4,000", "$6,000","$8,000", "$10,000",
                "$15,000", "$20,000", "$25,000", "$30,000", "$35,000", "$40,000", "$45,000", "$50,000",
                "$60,000", "$70,000", "$80,000", "$90,000", "$100,000","$125,000","$150,000","$175,000");

        for(WebElement pr : prices){
            actual.add(BrowserUtils.getText(pr)); //insertion order
          //  expectedOrder.add(BrowserUtils.getText(pr)); //ascending order
        }

        Assert.assertEquals(actual,expected);
    }
}

