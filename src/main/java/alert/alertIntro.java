package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class alertIntro {

    @Test
    public void jsBasicAlertTest(){

       ChromeDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement jsAlert=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        jsAlert.click();

        Alert alert=driver.switchTo().alert();
        String jsText=alert.getText();
        Assert.assertEquals(jsText, "I am a JS Alert");

        alert.accept();
        WebElement result = driver.findElement(By.id("result"));
        String resultText=result.getText().trim();
        Assert.assertEquals(resultText, "You successfully clicked an alert");

    }
}
