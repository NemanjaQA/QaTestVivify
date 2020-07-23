package tests_with_login;

import org.junit.Assert;
import org.junit.Test;
import pages.CreateGalleryPage;
import pages.HomePage;
import utilities.PropertyManager;

public class EditGalleryTest extends BaseTestWithLogin {

    public HomePage homePage;
    public CreateGalleryPage createGalleryPage;


    @Test
    public void editGallery() {

        homePage = new HomePage(driver);
        createGalleryPage = new CreateGalleryPage(driver);

        createGalleryPage.editGallery(PropertyManager.getInstance().getEditedGalleryTitle());

        try {
            homePage.verifyEditedGallery("Edited Title Name");
            System.out.print("Gallery is edited");
        } catch (Exception e) {
            Assert.fail("Something went wrong");
        }
    }

}
