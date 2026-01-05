package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;

public class InfiniteScrollPage {
    private WebDriver driver;
    public InfiniteScrollPage(WebDriver driver){
        this.driver = driver;
    }
    private By paragraph = By.className("jscroll-added");

    public void scrollToParagraph(int index){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "window.scrollTo(0, document.body.scrollHeight);";
        while (getNumOfParagraph() < index)
        js.executeScript(script);
    }
    public int getNumOfParagraph(){
        return driver.findElements(paragraph).size();
    }

    public void  setAttribute(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.id("elementId"));
        String script = "arguments[0].setAttribute('value','test value');";
        js.executeScript(script, element);

    }

}
