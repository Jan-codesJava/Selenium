/*package Ebay;

import com.sun.corba.se.impl.encoding.CDRInputObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class EbayProject {
    /*
    write a method to print the result of the product
    write a method to print Nth product say 10th Product(generic method)
    write a method to print all products from 1st page
    print all products along with scroll down
     */

/*
    public static void main (String[] args){

    WebDriver driver = new ChromeDriver();
    driver.get("https://in.ebay.com/");

    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println(driver.getCurrentUrl());
}

public void searchProduct(String product, String category){
    driver.findElement(By.id("gh-ac")).sendKeys(product);
    WebElement categoryDropDownElement = driver.findElement(By.id("gh-ac"));
    Select categorySelect = new Select(categoryDropDownElement);
    categorySelect.selectByVisibleText(category);
    driver.findElement(By.id("gh-btn")).click();

    String result = driver.findElement(By.xpath("//h1[contains(text(),'results for')]")).getText();
    System.out.println(result);
}

public void getNthResult(int productNumber){

        String xpathExpression = String.format("//div[@id='srp-river-results']/ul/li[%d]", productNumber);
        String nthProduct = driver.findElement(By.xpath(xpathExpression)).getText();
        System.out.println(nthProduct);

    System.out.println("--------------------------------------");
}

public void getAllProducts(){
        List<WebElement> allProducts = driver.findElements(By.xpath("//div[@id='srp-river-results']/ul/li"));
    Iterator<WebElement> iteratorAllProducts = allProducts.iterator();
    Actions action = new Actions(driver);
    while (iteratorAllProducts.hasNext()){
        WebElement product = iteratorAllProducts.next();

        action.moveToElement(product).build().perform();

        System.out.println(product.getText());

        System.out.println("-----------------------------------------------");
    }

}
private void scrollBy(int x, int y){
    JavascriptExecutor jsEngine = (JavascriptExecutor) driver;
    String jsCommand = String.format("window.scrollBy(%d,%d", x, y);
    jsEngine.executeScript("");
}

public static void main (String[] args){
        EbayProject ebayProject = new EbayProject();

        ebayProject.invokeBrowser();
        ebayProject.searchProduct("iPhone", "Cell Phones & Accessories");
        ebayProject.getNthResult(10);

        ebayProject.getAllProductsAndScrollViaJS();
      }

}
    public void getAllProductsAndScrollViaJS() {
        List<WebElement> allProducts = driver.findElements(By.xpath("//div[@id='srp-river-results']/ul/li"));
        Iterator<WebElement> iteratorAllProducts = allProducts.iterator();
        int productLocationX, productLocationY;
        while (iteratorAllProducts.hasNext()) {
            WebElement product = iteratorAllProducts.next();

            productLocationX = product.getLocation().x;

            productLocationY = product.getLocation().y;

            scrollBy(productLocationX, productLocationY);

            System.out.println(product.getText());

            System.out.println("-----------------------------------------------");
        }
    }
}


 */
