package Pages;

<<<<<<< HEAD
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FileUploadPage {
    private WebDriver driver;
    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }
    private By choosefileButton = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFiles = By.id("uploaded-files");


    public void uploadFileUsingRobot(String filePath) throws Exception {

        // 1️⃣ اضغط على زرار Choose File
        driver.findElement(choosefileButton).click();

        // 2️⃣ حط مسار الفايل في Clipboard
        //كليبورد اصلا دا المكان الي الحجات الي عملتلها كوبي بتروح فيه
        StringSelection selection = new StringSelection(filePath);//حولنا المسار لتيكست اوبجكت عشان اقدر احطه في الكليبورد
        Toolkit.getDefaultToolkit() // تولكيت داكلاس في جافا يخليني اتعامل مع الشاشه والماوس والكيبورد
                .getSystemClipboard() // هنا بقا معناها بقوله هات الديفولت كليبورد بتاع الجهاز حطلي فيه دا يعني زي ctr+c
                .setContents(selection, null);

        // 3️⃣ Robot actions
        // دا بقا مهمته يقدر يضغط على الكيبورد والماوس ويتعامل مع الويندوز عموما
        //Robot لا يعرف النصوص، هو يعرف أزرار فقط
        //لذلك نستخدم Clipboard لنقل النصوص
        Robot robot = new Robot();
        Thread.sleep(2000); // عملناله ثريد عشان يلحق بس الشاشه تظهر ويختار

        // Ctrl + V
        //  دول بقا اول 2 عشان اعمل بيست عادي واخر اتنين بفك الضغط
        //  نفك الضغط بالترتيب وإلا الكيبورد يفضل مضغوط
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        Thread.sleep(1000);

        // Enter
        // دا معناه خلاس دوس اوكي او انتر يعني
        // الفرق بيت بريس وريليز بريس بتضغط وريليز بتفك الضغط
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public void uploadFile(String filePath){
        driver.findElement(choosefileButton).sendKeys(filePath);
        clickUploadButton();
    }
    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }
    public String getUploadedFileName(){
        return driver.findElement(uploadedFiles).getText();
    }




=======
public class FileUploadPage {
>>>>>>> e8df736ff0fd1ea9f01f24e2bb6e53b478457e05
}
