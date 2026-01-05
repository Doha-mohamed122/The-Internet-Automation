package wait;

<<<<<<< HEAD
import Pages.DynamicLoadingPage;
import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
public class WaitTests extends BaseTest {
    @Test
    public void TestWait(){
        var ex1DynamicLoadingPage = homePage.clickDynamicLoading().clickEX1();
        ex1DynamicLoadingPage.clickStartResult();
        assertTrue(ex1DynamicLoadingPage.getResultText().contains("Hello World!"),
                "The text incorrect");


    }
    @Test
    public void TestWait2(){
        var ex2DynamicLoadingPage = homePage.clickDynamicLoading().clickEX2();
        ex2DynamicLoadingPage.clickStartResult();
        assertTrue(ex2DynamicLoadingPage.getText().contains("Hello World!"),
                "The text incorrect");
    }

=======
public class WaitTests {
>>>>>>> e8df736ff0fd1ea9f01f24e2bb6e53b478457e05
}
