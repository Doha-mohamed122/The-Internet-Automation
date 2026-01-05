package Pages;

<<<<<<< HEAD
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
=======
public class FrameSwitch {
>>>>>>> e8df736ff0fd1ea9f01f24e2bb6e53b478457e05
}
