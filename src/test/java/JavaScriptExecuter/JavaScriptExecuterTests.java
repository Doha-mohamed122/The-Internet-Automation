package JavaScriptExecuter;

import Pages.InfiniteScrollPage;
import Pages.LargeAndDeepDomPage;
import base.BaseTest;
import org.testng.annotations.Test;

public class JavaScriptExecuterTests extends BaseTest {
    @Test
    public void testsScrollToElement(){
        LargeAndDeepDomPage largeAndDeepDomPage = homePage.clickLargeAndDeep();
        largeAndDeepDomPage.scrollToTable();
    }
    @Test
    public void textScrollToParagraph(){
        InfiniteScrollPage infiniteScrollPage = homePage.clickInfiniteScroll();
        infiniteScrollPage.scrollToParagraph(5);
    }
}
