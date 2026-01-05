package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramePage {
    private WebDriver driver;
    public NestedFramePage(WebDriver driver){
        this.driver = driver;
    }
    private String topFrame = "frame-top";
    private String leftFrame = "frame-left";
    private String BottomFrame = "frame-bottom";
    private String rightFrame = "frame-right";
    private By body = By.tagName("body");

    public String getLeftFrameText(){
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(leftFrame);
        String leftText = driver.findElement(body).getText();
        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        return leftText;
    }
    public String getRightFrameText(){
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(rightFrame);
        String rightText = driver.findElement(body).getText();
        driver.switchTo().defaultContent();
        return rightText;
    }

    public String getBottomFrameText(){
        driver.switchTo().frame(BottomFrame);
        String bottonText = driver.findElement(body).getText();
        driver.switchTo().defaultContent();
        return  bottonText;

    }

}
