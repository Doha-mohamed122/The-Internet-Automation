package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MulipleWindowPage{
    private WebDriver driver;

    public MulipleWindowPage(WebDriver driver){
        this.driver = driver;
    }
    private By clickLink = By.linkText("Click Here");

    public NewWindowPage clickLink(){
        driver.findElement(clickLink).click();
        return new NewWindowPage(driver);
    }
}
