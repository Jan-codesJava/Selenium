package Mentoring.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    // Web ELements
    // FInd by annotation
    // Constructor to initialize page factory

    public LoginPage(WebDriver driver) {
        //  PageFactory.initElements(driver,this);
        // this refers to this class
        // loginpage.class
        //?
        PageFactory.initElements(driver,this);
    }


    @FindBy(id= "authUser")
    public WebElement userName;

    @FindBy(id = "clearPass")
    public WebElement password;

    @FindBy( tagName= "button")
    public WebElement logInButton;




}