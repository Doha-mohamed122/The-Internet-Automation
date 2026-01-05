package navigation;

<<<<<<< HEAD
import Pages.NewWindowPage;
import Utils.WindowManager;
import base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class NavigationTests extends BaseTest {
    @Test
    public void navigationTest(){
        homePage.clickDynamicLoading().clickEX1();
        getWindowManager().goback();
        getWindowManager().RefreshPage();
        getWindowManager().getForward();
        getWindowManager().getUrl("https://www.google.com/");

    }
    @Test
    public void testSwitchToTabs()
    {
        NewWindowPage newWindowPage = homePage.clickMulible().clickLink();
        getWindowManager().switchToTab("New Window");
        assertEquals(newWindowPage.getText(),"New Window","You in Wrong Tab");
    }
=======
public class NavigationTests {
>>>>>>> e8df736ff0fd1ea9f01f24e2bb6e53b478457e05
}
