package base;

import Pages.HomePage;
import Utils.WindowManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;
import java.util.List;

public class BaseTest {
     protected WebDriver driver;
     protected HomePage homePage;

    @BeforeClass
   public void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        goHome();
    }
    @BeforeMethod
    public void goHome(){
        driver.get("http://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }
    @AfterMethod
    public void TakeScreenshot(ITestResult result) throws IOException {
        if (ITestResult.FAILURE == result.getStatus()){
            var camera = (TakesScreenshot)driver;
            File screenShot = camera.getScreenshotAs(OutputType.FILE);
            Files.move(screenShot.toPath(), new File("resources/screenshots/"
                    + result.getName()+".png").toPath());
            System.out.println("ScreenShot taken at path" + screenShot.getAbsolutePath());
        }
    }
    @AfterClass
    public void tearDown(){
            driver.quit();
    }

    public WindowManager getWindowManager (){
        return new WindowManager(driver);
    }




}
