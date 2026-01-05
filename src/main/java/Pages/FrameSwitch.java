package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FrameSwitch {
    private WebDriver driver;
    public FrameSwitch(WebDriver driver){
        this.driver = driver;
    }
    private By nestedFramesLink = By.linkText("Nested Frames");

    public NestedFramePage clickNestedFrames(){
        driver.findElement(nestedFramesLink).click();
        return new NestedFramePage(driver);
    }
}
