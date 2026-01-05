package dropDown;

import base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class DropDownTests extends BaseTest {
    @Test
    public  void testDropDown() {
        String option = "Option 1";
        var dropDownpage = homePage.clickDropDown();
        dropDownpage.selectFromDropDown(option);
        var selectedOptions = dropDownpage.getSelectedOption();
        assertEquals(selectedOptions.size(),1,"The size is incorrect");
        assertTrue(selectedOptions.contains(option),"The option is not selected");

    }
}
