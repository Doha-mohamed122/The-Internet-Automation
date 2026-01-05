package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private WebDriver driver;
    private By WelcomeMessage = By.id("flash");
    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }
    public String getText(){
        return driver.findElement(WelcomeMessage).getText(); // not void to be able to access this message in assertions
    }
}
