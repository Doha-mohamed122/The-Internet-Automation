package Pages;

<<<<<<< HEAD
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropDownPage {
    private WebDriver driver;
    private By dropdown = By.id("dropdown");
    public DropDownPage(WebDriver driver){

        this.driver = driver;
    }
    public void selectFromDropDown(String option){
      findDropDownElement().selectByVisibleText(option);

    }
    public List<String> getSelectedOption(){
        List<WebElement> optionsElements = findDropDownElement().getAllSelectedOptions();
        List<String> optionText = new ArrayList<>();
        for (WebElement element : optionsElements){
            optionText.add(element.getText());
        }
        return optionText;
    }
     public Select findDropDownElement(){
        return new Select(driver.findElement(dropdown));

     }
=======
public class DropDownPage {
>>>>>>> e8df736ff0fd1ea9f01f24e2bb6e53b478457e05
}
