package Pages;

<<<<<<< HEAD
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
=======
public class SecureAreaPage {
>>>>>>> e8df736ff0fd1ea9f01f24e2bb6e53b478457e05
}
