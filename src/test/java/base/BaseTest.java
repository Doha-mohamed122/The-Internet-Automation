package base;

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



}
