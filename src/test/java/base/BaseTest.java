package base;

<<<<<<< HEAD
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

=======
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests {
     private WebDriver driver;
   //  private By inputsLocator = By.linkText("Inputs");

    void setup(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

        List<WebElement> links =driver.findElements(By.tagName("a"));
        System.out.println(links.size());

       // WebElement inputsLink = driver.findElement(inputsLocator);
       // inputsLink.click();
        WebElement ino = driver.findElement(By.linkText("Basic Auth"));
        ino.click();

        System.out.println(driver.getTitle());


        driver.quit(); //close all, put driver.close -> close only current window

    }
    public static void main(String[] args) {
        BaseTests baseTests = new BaseTests();
        baseTests.setup();
    }
>>>>>>> e8df736ff0fd1ea9f01f24e2bb6e53b478457e05



}
