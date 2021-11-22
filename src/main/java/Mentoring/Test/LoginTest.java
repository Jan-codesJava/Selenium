package Mentoring.Test;

    import Mentoring.Pages.LoginPage;
import org.testng.annotations.Test;

    public class LoginTest extends TestBase {
        // for mac command + n
        // for windows control + n

        @Test
        public static void loginTest() {


            LoginPage loginPage = new LoginPage(driver);
            loginPage.userName.sendKeys("admin");
            loginPage.password.sendKeys("pass");
            loginPage.logInButton.click();

        }
    }

