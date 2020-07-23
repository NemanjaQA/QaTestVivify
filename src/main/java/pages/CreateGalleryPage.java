package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.PropertyManager;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class CreateGalleryPage extends BasePage {

    public CreateGalleryPage(WebDriver driver) {
        super(driver);
    }

    By createGalleryBy = By.xpath("//a[contains(@href, 'create')]");
    By galleryTitleBy = By.id("title");
    By galleryDescriptionBy = By.id("description");
    By myGalleriesBy = By.xpath("//a[contains(@href, 'my-galleries')]");
    By newGalleryImageBy = By.xpath("//*[@type='url']");
    By submitBy = By.xpath("//*[@type='submit']");
    By existingGalleryBy = By.linkText(PropertyManager.getInstance().getNewGalleryTitle());
    By editGalleryBy = By.xpath("//a[contains(@href, 'edit-gallery')]");
    By editedGalleryBy = By.linkText(PropertyManager.getInstance().getEditedGalleryTitle());
    By searchBy = By.xpath("//*[@type='text']");
    By filterBy = By.xpath("//*[@type='button']");



    String baseURL = PropertyManager.getInstance().getURL();

    public CreateGalleryPage createNewGallery (String gallery_title, String gallery_description, String gallery_image) {
        click(createGalleryBy);
        writeText(galleryTitleBy, gallery_title);
        writeText(galleryDescriptionBy, gallery_description);
        writeText(newGalleryImageBy, gallery_image);
        click(submitBy);
        click(myGalleriesBy);
        return this;
    }

    public CreateGalleryPage editGallery (String edited_gallery_title) {
        click(myGalleriesBy);
        click(existingGalleryBy);
        click(editGalleryBy);
        writeText(galleryTitleBy, edited_gallery_title);
        click(submitBy);
        click(createGalleryBy);
        click(myGalleriesBy);
        return this;
    }

    public CreateGalleryPage deleteGallery () throws AWTException {
        click(myGalleriesBy);
        click(editedGalleryBy);
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.cssSelector("#app > div.container > div > div:nth-child(5) > button"))).click().perform();
        wait.until(ExpectedConditions.alertIsPresent());
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(500);
        writeText(searchBy, PropertyManager.getInstance().getEditedGalleryTitle());
        click(filterBy);
        return this;
    }

}

