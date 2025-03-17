package by.itacademy.psekha.pages;

import by.itacademy.psekha.driver.Singleton;
import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class InputPage {
    private final By TITLE_TEXT_PRODUCT = By.xpath("//h1[@class='catalog__head--title searchtext']");
    private final By CLICK_PRODUCT = By.xpath("//div[@data-swiper='product-card__swiper-0']");
    private final By TEXT_ABOUT_PRODUCT = By.xpath("//h1[@class='product-card__name']");

    private WebDriver driver;

    public InputPage() {
        this.driver = Singleton.getDriver();

    }

    private static final Logger logger = LogManager.getLogger(InputPage.class);

    @Step
    public InputPage clickProduct() {
        try {
            driver.findElement(CLICK_PRODUCT).click();
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
    public String getTitleTextProduct() {
        try {
            return driver.findElement(TITLE_TEXT_PRODUCT).getText();
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
    public String getTextAboutProduct() {
        try {
            return driver.findElement(TEXT_ABOUT_PRODUCT).getText();
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