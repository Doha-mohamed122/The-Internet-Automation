package keys;

import Pages.KeyPressesPage;
import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
public class KeysTests extends BaseTest {
    @Test
    public void testBackSpace(){
        KeyPressesPage keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.setText(Keys.chord(Keys.SHIFT +"a"));
        assertEquals(keyPressesPage.getText(),"You entered: A","The Text is incorrect");
    }
}
