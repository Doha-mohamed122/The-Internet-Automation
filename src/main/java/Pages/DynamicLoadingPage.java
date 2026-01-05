package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    private By exampleLink = By.partialLinkText("Example 1: Element on page that is hidden");

    public EX1DynamicLoadingPage clickEX1(){
        driver.findElement(exampleLink).click();
        return new EX1DynamicLoadingPage(driver);
    }
    public EX2DynamicLoadingPage clickEX2(){
        driver.findElement(exampleLink).click();
        return new EX2DynamicLoadingPage(driver);
    }
}
