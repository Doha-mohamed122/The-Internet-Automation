package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewWindowPage {
    WebDriver driver;
    public NewWindowPage (WebDriver driver){
        this.driver = driver;
    }

    private By newWindowText = By.tagName("h3");

    public String getText(){
        return driver.findElement(newWindowText).getText();

    }

}
