package by.itacademy.psekha.pages;

import by.itacademy.psekha.driver.Singleton;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final By CLICK_BUTTON_PASSWORD = By.xpath("//input[@id='LoginModel_Password']");
    private final By CLICK_FIELD_EMAIL = By.xpath("//input[@id='LoginModel_Email']");
    private final By DROP_TEXT_EMAIL = By.xpath("//div[text()='Пожалуйста, введите адрес электронной почты']");
    private final By LOGIN_ENTER_BUTTON = By.xpath("//button[@id='LoginBtn']");
    private final By DROP_TEXT_PASSWORD = By.xpath("//div[text()='Пароль должен быть от 6 до 10 символов. ']");
    private final By ERROR_TEXT = By.xpath("(//p[@class='alert-box--item']/span)[1]");

    private WebDriver driver;

    public LoginPage() {
        this.driver = Singleton.getDriver();
    }

    private static final Logger logger = LogManager.getLogger(LoginPage.class);

    public LoginPage clickLoginEnterButton() {
        try {
            driver.findElement(LOGIN_ENTER_BUTTON).click();
            return this;
        } catch (NoSuchElementException e) {
            logger.info("Attempted to click but element not found.");
            logger.error("Element to click not found");
            throw e;
        } catch (Exception e) {
            logger.info("Attempted to click but an error occurred.");
            logger.error("An error occurred while attempting to click.");
            throw e;
        }
    }

    public LoginPage writePassword(String q) {
        try {
            driver.findElement(CLICK_BUTTON_PASSWORD).sendKeys(q);
            return this;
        } catch (NoSuchElementException e) {
            logger.info("Attempted to enter a password, but the element was not found.");
            logger.error("Password entry field not found", e);
            throw e;
        } catch (Exception e) {
            logger.info("Attempted to enter a password, but an error occurred.");
            logger.error("Error encountered while trying to enter password", e);
            throw e;
        }
    }

    public String getTextErrorEmail() {
        try {
            return driver.findElement(DROP_TEXT_EMAIL).getText();
        } catch (NoSuchElementException e) {
            logger.info("Trying to extract text, but the element was not found.");
            logger.error("Element not found", e);
            return "Element not found";
        } catch (Exception e) {
            logger.info("Trying to extract text, but an error occurred.");
            logger.error("Error encountered while trying to get error text", e);
            return "Error occurred: " + e.getMessage();
        }
    }

    public String getTextErrorPassword() {
        try {
            return driver.findElement(DROP_TEXT_PASSWORD).getText();
        } catch (NoSuchElementException e) {
            logger.info("Trying to extract text, but the element was not found.");
            logger.error("Element not found", e);
            return "Element not found";
        } catch (Exception e) {
            logger.info("Trying to extract text, but an error occurred.");
            logger.error("Error encountered while trying to get error text", e);
            return "Error occurred: " + e.getMessage();
        }
    }

    public String getTextError() {
        try {
            return driver.findElement(ERROR_TEXT).getText();
        } catch (NoSuchElementException e) {
            logger.info("Trying to extract text, but the element was not found.");
            logger.error("Element not found", e);
            return "Element not found";
        } catch (Exception e) {
            logger.info("Trying to extract text, but an error occurred.");
            logger.error("Error encountered while trying to get error text", e);
            return "Error occurred: " + e.getMessage();
        }
    }

    public LoginPage writeEmail(String q) {
        try {
            driver.findElement(CLICK_FIELD_EMAIL).sendKeys(q);
            return this;
        } catch (NoSuchElementException e) {
            logger.info("Attempted to enter a email, but the element was not found.");
            logger.error("Email entry field not found", e);
            throw e;
        } catch (Exception e) {
            logger.info("Attempted to enter a email, but an error occurred.");
            logger.error("Error encountered while trying to enter email", e);
            throw e;
        }
    }
}