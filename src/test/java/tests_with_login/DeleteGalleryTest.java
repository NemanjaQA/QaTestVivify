package tests_with_login;

import org.junit.Assert;
import org.junit.Test;
import pages.CreateGalleryPage;
import pages.HomePage;

import java.awt.*;

public class DeleteGalleryTest extends BaseTestWithLogin {

    public HomePage homePage;
    public CreateGalleryPage createGalleryPage;


    @Test
    public void deleteGallery() throws AWTException {

        homePage = new HomePage(driver);
        createGalleryPage = new CreateGalleryPage(driver);

        createGalleryPage.deleteGallery();

        try {
            homePage.verifyGalleryDeleted("No galleries found");
            System.out.print("Gallery is deleted");
        } catch (Exception e) {
            Assert.fail("Something went wrong");
        }
    }

}
