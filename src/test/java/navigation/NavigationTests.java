package navigation;

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
}
