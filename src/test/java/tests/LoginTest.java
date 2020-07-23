package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LogInPage;
import utilities.PropertyManager;

public class LoginTest extends BaseTest {

    public HomePage homePage;
    public LogInPage loginPage;

    @Test
    public void login ()  {

        loginPage = new LogInPage(driver);
        homePage = new HomePage(driver);

        loginPage.basePage();
        loginPage.login(PropertyManager.getInstance().getEmail(), PropertyManager.getInstance().getPassword());

        try {
            homePage.verifyLogIn("Logout");
            System.out.print("User is logged in!");
        } catch (Exception e) {
            Assert.fail("User is not logged in!");
        }
    }
}