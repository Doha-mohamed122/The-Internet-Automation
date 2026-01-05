package Login;

import Pages.LoginPage;
import Pages.SecureAreaPage;
import base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class LoginTests extends BaseTest {
    @Test(priority = 1)
    public void  TestSuccessfulLogin(){
        LoginPage loginPage = homePage.ClickFormAuthentication();
        loginPage.SendUserName("tomsmith");
        loginPage.SendPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getText().contains("You logged into a secure area!"),"The message is incorrect");
    }
    @Test(priority = 2)
    public void enterInvalidData(){
        LoginPage loginPage = homePage.ClickFormAuthentication();
        loginPage.SendUserName("doha");
        loginPage.SendPassword("1234");
        loginPage.clickLoginButton();
        assertTrue(
                loginPage.getMessage().contains("Your username is invalid!"),
                "Error message is incorrect"
        );
    }
    @Test(priority = 3)
    public void emptyFields(){
        LoginPage loginPage = homePage.ClickFormAuthentication();
        loginPage.clickLoginButton();
        assertTrue(
                loginPage.getMessage().contains("Your username is invalid!"),
                "Error message is incorrect"
        );
    }
}
