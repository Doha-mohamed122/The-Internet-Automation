package Pages;

<<<<<<< HEAD
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By UserNameField = By.id("username");
    private By PasswordField = By.id("password");
    private By LoginButton = By.cssSelector("#login > button");
    private By message = By.id("flash");

    public LoginPage(WebDriver driver){
        this.driver = driver;

    }
    public void SendUserName(String userName){
        driver.findElement(UserNameField).sendKeys(userName);
    }

    public void SendPassword(String Password){
        driver.findElement(PasswordField).sendKeys(Password);
    }
    public String getMessage(){
        return driver.findElement(message).getText();
    }
    public SecureAreaPage clickLoginButton(){
        driver.findElement(LoginButton).click();
        return new SecureAreaPage(driver); //This is page object-> to be able to continue to this next page

    }
=======
public class LoginPage {
>>>>>>> e8df736ff0fd1ea9f01f24e2bb6e53b478457e05
}
