package Pages;

<<<<<<< HEAD
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertPage {
    private WebDriver driver;
    public JavaScriptAlertPage(WebDriver driver){

        this.driver = driver;
    }

    private By alertTriggerButton = By.xpath("//button[contains(.,'Alert')]");
    private By confirmTriggerButton = By.xpath("//button[contains(.,'Confirm')]");
    private By PromptTriggerButton = By.xpath("//button[contains(.,'Prompt')]");
    private By resultText = By.id("result");

    public  void triggerAlert(){
        driver.findElement(alertTriggerButton).click();
    }
    public void  triggerConfirm(){
        driver.findElement(confirmTriggerButton).click();
    }
    public void  triggerPrompt(){
        driver.findElement(PromptTriggerButton).click();
    }
    public String getResultText(){
       return driver.findElement(resultText).getText();
    }

    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }
    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }
    public void alert_setText(String text){
        driver.switchTo().alert().sendKeys(text);

    }
    public String alert_getText(){
       return driver.switchTo().alert().getText();
    }



=======
public class JavaScriptAlertPage {
>>>>>>> e8df736ff0fd1ea9f01f24e2bb6e53b478457e05
}
