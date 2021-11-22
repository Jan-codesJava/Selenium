package Mentoring.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

    public class MainPage {

        public MainPage(WebDriver driver) {
            PageFactory.initElements(driver,this);
        }


        @FindBy(xpath = "//div[@class=\"menuLabel dropdown-toggle oe-dropdown-toggle\"]")
        public List<WebElement> pageMenus;

        @FindBy(xpath = "//div[.='Find Patient']")
        public  WebElement findPatient;




        public void clickToMenu(String menuName){
            for (int i = 0; i <pageMenus.size() ; i++) {
                if (pageMenus.get(i).getText().trim().equalsIgnoreCase(menuName)){
                    pageMenus.get(i).click();
                    return; }// It will stop the method
            }
        }


    }

