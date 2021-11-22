package Mentoring.Test;


    import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

    public class TestBase {


        public static WebDriver driver;
        public static Actions actions;
        @BeforeMethod
        public void setUp(){

            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            actions=new Actions(driver);
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            // Implicitly wait will wait all the page element that my Driver pointing.
            // It will wait 5 sec till element load is completed.
            // After 5 sec if the element is not available it will throw noSuchElementException
            driver.get("https://demo.openemr.io/openemr");
        }
    }

