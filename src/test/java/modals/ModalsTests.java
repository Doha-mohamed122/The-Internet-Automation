package modals;

import Pages.EntryAdPage;
import base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ModalsTests extends BaseTest {
    @Test
    public void modalsTest(){
       var entryAd = homePage.clickEntryAd();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        entryAd.closeModel();
        entryAd.clickLink();
        assertEquals(entryAd.getText(),"Entry Ad","The modal Wasn't closed");

    }
}
