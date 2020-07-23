package tests_with_login;

import org.junit.Assert;
import org.junit.Test;
import pages.CreateGalleryPage;
import pages.HomePage;
import utilities.PropertyManager;

public class CreateNewGalleryTest extends BaseTestWithLogin {

    public HomePage homePage;
    public CreateGalleryPage createGalleryPage;


    @Test
    public void createNewGallery() {

    homePage = new HomePage(driver);
    createGalleryPage = new CreateGalleryPage(driver);

    createGalleryPage.createNewGallery(PropertyManager.getInstance().getNewGalleryTitle(), PropertyManager.getInstance().getNewGalleryDescription(), PropertyManager.getInstance().getNewGalleryImage());

        try {
            homePage.verifyCreatedGallery();
            System.out.print("Gallery is created");
        } catch (Exception e) {
            Assert.fail("Something went wrong");
        }
    }

}
