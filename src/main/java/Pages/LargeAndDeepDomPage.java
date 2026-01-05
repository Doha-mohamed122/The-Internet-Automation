package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.module.Script;

public class LargeAndDeepDomPage {
    private WebDriver driver;
    public LargeAndDeepDomPage(WebDriver driver){
        this.driver = driver;
    }
    private By table = By.id("large-table");

    public void scrollToTable(){
        WebElement tableElement = driver.findElement(table);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "arguments[0].scrollIntoView(true);";
        js.executeScript(script, tableElement);

    }
}
