package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.LogInPage;
import utilities.PropertyManager;


public class RegistrationTest extends BaseTest {

    public LogInPage loginPage;
    public HomePage homePage;

    @Test
    public void registration ()  {
        loginPage = new LogInPage(driver);
        homePage = new HomePage(driver);

        loginPage.basePage();
        loginPage.signup(PropertyManager.getInstance().getRegEmail(), PropertyManager.getInstance().getRegPassword(), PropertyManager.getInstance().getRegFirstName(), PropertyManager.getInstance().getRegLastName());

        try {
            homePage.verifyLogIn("Logout");
            System.out.print("User is registered!");
        } catch (Exception e) {
            Assert.fail("Registration failed!");
        }
    }
}
