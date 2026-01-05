package hovers;

<<<<<<< HEAD
import Pages.HoverPage;
import base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class HoverTests extends BaseTest {

    @Test
    public void testhover(){
        HoverPage hoverPage = homePage.clickHover();
         var figureCaption =hoverPage.hoverOverFigure(1);
         assertTrue(figureCaption.isCaptionDisplayed(),"The caption is not displayed");
         assertEquals(figureCaption.getName(),"name: user1","The name is incorrect");
        assertTrue(
                figureCaption.getLink().endsWith("/users/1"),
                "The link is incorrect"
        );

        assertEquals(figureCaption.getLinkText(),"View profile","The link text is incorrect");
    }
=======
public class HoverTests {
>>>>>>> e8df736ff0fd1ea9f01f24e2bb6e53b478457e05
}
