package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.PropertyManager;

public class HomePage extends BasePage {

    public HomePage (WebDriver driver) {
        super(driver);
    }



    By signOutButtonBy = By.linkText("Logout");
    By createdGalleryBy = By.linkText(PropertyManager.getInstance().getNewGalleryTitle());
    By editedGalleryBy = By.linkText(PropertyManager.getInstance().getEditedGalleryTitle());
    By deletedGalleryBy = By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/h4");


    public HomePage verifyLogIn (String expectedText) {
        String sign_out = readText(signOutButtonBy);
        assertStringsEquals(sign_out, expectedText);
        return this;

    }


    public HomePage verifyCreatedGallery () {
        String gallery_title = readText(createdGalleryBy);
        assertStringsEquals(gallery_title, gallery_title);
        return this;
    }

    public HomePage verifyEditedGallery (String expected_text) {
        String edited_gallery_title = readText(editedGalleryBy);
        assertStringsEquals(edited_gallery_title, expected_text);
        return this;
    }

    public HomePage verifyGalleryDeleted (String expectedText) {
        String gallery_not_found = readText(deletedGalleryBy);
        assertStringsEquals(gallery_not_found, expectedText);
        return this;

    }

}
