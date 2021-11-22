package Project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCase1 {

 /*   @Test
    public void test1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/sampl\n" +
                "es/TestComplete11/WebOrders/Login.aspx?");

        String actualTitle= driver.getTitle();
        String expectedTitle = "Web Orders Login";

        Assert.assertEquals(actualTitle, expectedTitle);

        WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
        username.sendKeys("Tester");

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("Test");

        WebElement loginButton = driver.findElement(By.className("button"));
        loginButton.click();

        Thread.sleep(2000);

        WebElement newTitle=driver.findElement(By.xpath("//h1[contains(text().'Web Orders']"));
        String title1=newTitle.getText();
        String expectTitle ="Web Orders";

        Assert.assertEquals(newTitle, expectTitle);

        WebElement header= driver.findElement(By.xpath("//h2[contains(text().'Web Orders']"));
        String headerText=header.getText();
        String expectedHeader = "List of all Orders";

        Assert.assertEquals(headerText, expectedHeader);

    }

  */

    // ===================================================

 /*   @Test
    public void test2() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/sample\n" +
                "s/TestComplete11/WebOrders/Login.aspx?");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Web Orders Login";

        Assert.assertEquals(actualTitle, expectedTitle);

        WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
        username.sendKeys("Tester");

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("Test");

        WebElement loginButton = driver.findElement(By.className("button"));
        loginButton.click();

        Thread.sleep(2000);

        WebElement clickAllProduct = driver.findElement(By.xpath("//a[contains(text(), 'View all products')]"));
        clickAllProduct.click();

        WebElement titleOfProducts = driver.findElement(By.tagName("h2"));
        String listOfProducts = titleOfProducts.getText();
        String expectedTitleOfProducts = "List of Products";
        Assert.assertEquals(listOfProducts, expectedTitleOfProducts);

        boolean checkKeyword = driver.getCurrentUrl().contains("Products");
        Assert.assertTrue(checkKeyword);

    }
  */


    @Test
    public void testCase3() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/sampl\n" +
                "es/TestComplete11/WebOrders/Login.aspx?");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Web Orders Login";

        Assert.assertEquals(actualTitle, expectedTitle);

        WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
        username.sendKeys("Tester");

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("Test");

        WebElement loginButton = driver.findElement(By.className("button"));
        loginButton.click();

        Thread.sleep(2000);

        WebElement Links = driver.findElement(By.xpath("//a[contains[text(), 'View all orders')]"));
        WebElement ordersLink = driver.findElement(By.xpath("//a[contains[text(), 'Order')]"));
        WebElement productsLink = driver.findElement(By.xpath("//a[contains[text(), 'View all products')]"));

        String linksAttribute = Links.getAttribute("Default.aspx");
        String orderAttribute = ordersLink.getAttribute("Process.apx");
        String productsAttribute = productsLink.getAttribute("Product.aspx");

        String expectedResultForLinks = "Default.aspx";
        String expectedResultForOrders = "Process.aspx";
        String expectedResultForProducts = "Product.aspx";

        Assert.assertEquals(linksAttribute, expectedResultForLinks);
        Assert.assertEquals(orderAttribute, expectedResultForOrders);
        Assert.assertEquals(productsAttribute, expectedResultForProducts);

    }
}