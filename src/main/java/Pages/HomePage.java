package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public  LoginPage ClickFormAuthentication(){
       ClickLink("Form Authentication");
        return new LoginPage(driver);
    }
    public DropDownPage clickDropDown(){
        ClickLink("Dropdown");
        return  new DropDownPage(driver);
    }
    public HoverPage clickHover(){
        ClickLink("Hovers");
        return  new HoverPage(driver);
    }
    public KeyPressesPage clickKeyPresses(){
        ClickLink("Key Presses");
        return new KeyPressesPage(driver);

    }
    public JavaScriptAlertPage clickJavaScriptAlerts(){
        ClickLink("JavaScript Alerts");
        return new JavaScriptAlertPage(driver);
    }
    public FileUploadPage clickFileUpload(){
        ClickLink("File Upload");
        return new FileUploadPage(driver);
    }
    public EntryAdPage clickEntryAd(){
        ClickLink("Entry Ad");
        return new EntryAdPage(driver);
    }
    public FrameSwitch clickFrames(){
        ClickLink("Frames");
        return new FrameSwitch(driver);
    }
    public DynamicLoadingPage clickDynamicLoading(){
        ClickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }
    public LargeAndDeepDomPage clickLargeAndDeep(){
        ClickLink("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }
    public InfiniteScrollPage clickInfiniteScroll(){
        ClickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }
    public MulipleWindowPage clickMulible(){
        ClickLink("Multiple Windows");
        return new MulipleWindowPage(driver);

    }

    public  void  ClickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();

    }
}
