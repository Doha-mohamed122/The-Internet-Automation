package JsDialogues;

<<<<<<< HEAD
import Pages.JavaScriptAlertPage;
import base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class JsDialoguesTests extends BaseTest {
    @Test
    public void testsAlerts(){
      JavaScriptAlertPage javaScriptAlertPage = homePage.clickJavaScriptAlerts();
      javaScriptAlertPage.triggerAlert();
      javaScriptAlertPage.alert_clickToAccept();
      String text =javaScriptAlertPage.getResultText();
      assertEquals(text,"You successfully clicked an alert",
              "The message is incorrect");

    }
    @Test
    public void testConfirm(){
        JavaScriptAlertPage javaScriptAlertPage = homePage.clickJavaScriptAlerts();
        javaScriptAlertPage.triggerConfirm();
        String text = javaScriptAlertPage.alert_getText();
        javaScriptAlertPage.alert_clickToDismiss();
        assertEquals(text,"I am a JS Confirm","The text is incorrect");
        assertEquals(javaScriptAlertPage.getResultText(),"You clicked: Cancel","incorrect");
    }
    @Test
    public void  testPrompt(){
        JavaScriptAlertPage javaScriptAlertPage = homePage.clickJavaScriptAlerts();
        javaScriptAlertPage.triggerPrompt();
        String enter ="Doha";
        javaScriptAlertPage.alert_setText(enter);
        javaScriptAlertPage.alert_clickToAccept();
        String text = javaScriptAlertPage.getResultText();
        assertEquals(text,"You entered: "+enter,"Rhe text is incorrect");
    }

=======
public class JsDialoguesTests {
>>>>>>> e8df736ff0fd1ea9f01f24e2bb6e53b478457e05
}
