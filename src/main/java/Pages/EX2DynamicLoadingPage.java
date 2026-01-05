package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EX2DynamicLoadingPage {
    private WebDriver driver;
    public EX2DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }
    private By startButton = By.cssSelector("#start button");
    private By loadedText = By.cssSelector("#finish h4");

    public void clickStartResult(){
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(loadedText));
//        FluentWait<WebDriver> wait = new FluentWait<>(driver).
//                withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1))
//                .ignoring(NoSuchElementException.class);
//        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingBar)));

    }
    public String getText(){
        return driver.findElement(loadedText).getText();
    }

}
