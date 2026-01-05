package fileUpload;

<<<<<<< HEAD
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
=======
public class FileUploadTests {
>>>>>>> e8df736ff0fd1ea9f01f24e2bb6e53b478457e05
}
