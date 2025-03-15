package by.itacademy.psekha.pages;

import by.itacademy.psekha.driver.Singleton;
import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class BagPage {
    private final By CLICK_GO_BAG = By.xpath("//button[text()=' Перейти в корзину ']");
    private final By CLICK_DELETE = By.xpath("//span[text()='Удалить']");
    private final By BUTTON_DELETE = By.xpath("//button[text()='Удалить']");
    private final By TITLE_TEXT = By.xpath("//div[text()='Ваша корзина пуста.']");
    private final By BAG_TITLE_TEXT = By.xpath("//div[@class='fly-cart__empty-title']");

    private String URL = "https://www.defacto.com/ru-kz/shopping";

    private WebDriver driver;

    public BagPage() {
        this.driver = Singleton.getDriver();
    }

    private static final Logger logger= LogManager.getLogger(BagPage.class);

    @Step
    public BagPage clickGoBag() {
        try {
            driver.findElement(CLICK_GO_BAG).click();
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

    @Step
    public BagPage clickDelete() {
        try {
            driver.findElement(CLICK_DELETE).click();
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

    @Step
    public BagPage clickGoBagAndClickDelete() {
        clickGoBag();
        clickDelete();
        return this;
    }

    @Step
    public BagPage openBag() {
        try {
            driver.get(URL);
            return this;
        } catch (NullPointerException e) {
            logger.info("Attempted to open web driver, but driver failed to initialize.");
            logger.error("Driver is not initialized", e);
            throw e;
        } catch (Exception e) {
            logger.info("Attempted to open web driver, but an error occurred.");
            logger.error("Unexpected error occurred while trying to open the URL: " + URL, e);
            throw e;
        }
    }

    @Step
    public BagPage buttonDelete() {
        try {
            driver.findElement(BUTTON_DELETE).click();
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

    @Step
    public String getTitleText() {
        try {
            return driver.findElement(TITLE_TEXT).getText();
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

    @Step
    public String getBagTitleText() {
        try {
            return driver.findElement(BAG_TITLE_TEXT).getText();
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
}