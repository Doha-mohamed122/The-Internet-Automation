<<<<<<< HEAD
package Utils;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigation;
    public WindowManager(WebDriver driver){
        this.driver = driver;
        navigation = driver.navigate();

    }
    public void goback(){
        navigation.back();
    }
    public void getForward(){
     navigation.forward();
    }
    public void getUrl(String url){
        navigation.to(url);
    }
    public void RefreshPage(){
        navigation.refresh();
    }
    public void switchToTab(String title){
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("Nu of tabs: "+ windowHandles.size());
        for (String windowHandle:windowHandles){
            driver.switchTo().window(windowHandle);
            if (title.equals(driver.getTitle())){
                break;
            }
        }
    }


=======
package Pages;

import org.openqa.selenium.WebDriver;

public class WindowManager {
    private WebDriver driver;
    public WindowManager(WebDriver driver){
        this.driver = driver;

    }
    public void goback(){
        
    }
>>>>>>> e8df736ff0fd1ea9f01f24e2bb6e53b478457e05

}
