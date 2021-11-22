package Mentoring.Pages.Patient;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class PatientFinder {
        public PatientFinder(WebDriver driver) {
            PageFactory.initElements(driver,this);
        }
        @FindBy(xpath = "//input[@placeholder=\"Search by Name\"]")
        public WebElement searchBox;
        @FindBy(xpath = "//iframe[@name='fin']")
        public WebElement finderIframe;
    }
