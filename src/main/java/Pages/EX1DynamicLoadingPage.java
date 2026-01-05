package Pages;

<<<<<<< HEAD
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class EX1DynamicLoadingPage {
    private WebDriver driver;
    public EX1DynamicLoadingPage(WebDriver driver){
        this.driver =driver;
    }
    private By startButton = By.cssSelector("#start button");
    private By resultText = By.cssSelector("#finish h4");
    private By loadingBar = By.id("loading");

    public void clickStartResult(){
        driver.findElement(startButton).click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingBar)));
        FluentWait<WebDriver> wait = new FluentWait<>(driver).
                withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingBar)));

    }
    public String getResultText(){
        return driver.findElement(resultText).getText();
    }
=======
public class EX1DynamicLoadingPage {
>>>>>>> e8df736ff0fd1ea9f01f24e2bb6e53b478457e05
}
