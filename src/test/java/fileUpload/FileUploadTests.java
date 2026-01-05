package fileUpload;

import Pages.FileUploadPage;
import base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FileUploadTests extends BaseTest {
    @Test
    public void testFileUpload(){
        String fileName = "dd.txt";
        String filePath = "C:\\Users\\DELL\\IdeaProjects\\Automation1\\resources\\"+fileName;
        FileUploadPage fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile(filePath);
        assertEquals(fileUploadPage.getUploadedFileName(),fileName,"The file name is incorrect");
    }
}
