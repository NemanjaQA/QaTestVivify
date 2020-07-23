package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.PropertyManager;

public class LogInPage extends BasePage {

    public LogInPage(WebDriver driver) {
        super(driver);
    }

    By emailBy = By.id("email");
    By passwordBy = By.id("password");
    By passwordConfirmationBy = By.id("password-confirmation");
    By loginBy = By.linkText("Login");
    By regFirstNameBy = By.id("first-name");
    By regLastNameBy = By.id("last-name");
    By acceptTermsCheckboxBy = By.className("form-check-input");
    By submitBy = By.xpath("//*[@type='submit']");
    By registrationBy = By.linkText("Register");


    String baseURL = PropertyManager.getInstance().getURL();

    public LogInPage login (String email, String password) {
        click(loginBy);
        writeText(emailBy, email);
        writeText(passwordBy, password);
        click(submitBy);
        return this;
    }

    public LogInPage basePage () {
        driver.get(baseURL);
        return this;
    }

    public LogInPage signup (String email, String password , String reg_first_name, String reg_last_name) {

        click(registrationBy);
        writeText(regFirstNameBy, reg_first_name);
        writeText(regLastNameBy, reg_last_name);
        writeText(emailBy, email);
        writeText(passwordBy, password);
        writeText(passwordConfirmationBy, password);
        click(acceptTermsCheckboxBy);
        click(submitBy);
        return this;
    }

}
