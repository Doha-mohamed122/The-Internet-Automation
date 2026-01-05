package Pages;

<<<<<<< HEAD
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;
    public  KeyPressesPage(WebDriver driver){
        this.driver = driver;
    }
    private By inputField = By.id("target");
    private By resultMessage = By.id("result");

    public void setText(String text){
        driver.findElement(inputField).sendKeys(text);
    }
    public String getText(){
        return driver.findElement(resultMessage).getText();
    }
=======
public class KeyPressesPage {
>>>>>>> e8df736ff0fd1ea9f01f24e2bb6e53b478457e05
}
