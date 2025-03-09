package pages;

import driver.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final By CLICK_BUTTON_PRESENT = By.xpath("//div[@id='wrap-close-button-1454703513200']");
    private final By CLICK_BUTTON_PASSWORD = By.xpath("//input[@id='LoginModel_Password']");
    private final By CLICK_FIELD_EMAIL = By.xpath("//input[@id='LoginModel_Email']");
    private final By CLICK_BUTTON_ADVERTISING = By.xpath("//div[@id='wrap-button-1601498479230']");

    private WebDriver driver;

    public LoginPage() {
        this.driver = Singleton.getDriver();
    }

    public LoginPage writePassword(String q) {
        driver.findElement(CLICK_BUTTON_PASSWORD).sendKeys(q);
        return this;
    }

    public LoginPage writeEmail(String q) {
        driver.findElement(CLICK_FIELD_EMAIL).sendKeys(q);
        return this;
    }
}
