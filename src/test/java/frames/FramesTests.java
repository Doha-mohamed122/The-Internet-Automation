package frames;

import Pages.NestedFramePage;
import base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FramesTests extends BaseTest {
    @Test
    public void frameTests(){
        NestedFramePage nestedFramePage = homePage.clickFrames().clickNestedFrames();
        assertEquals(nestedFramePage.getLeftFrameText(),"LEFT","the text is incorrect");
        assertEquals(nestedFramePage.getRightFrameText(),"RIGHT","the text is incorrect");
        assertEquals(nestedFramePage.getBottomFrameText(),"BOTTOM","the text is incorrect");
    }

}
