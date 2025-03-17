package by.itacademy.psekha.pages;

import by.itacademy.psekha.driver.Singleton;
import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class ProductPageAddBag {
    private final By PRODUCT_ADD_BAG = By.xpath("(//span[text()='Добавить в корзину'])[1]");
    private final By PRODUCT_ADD_L = By.xpath("//button[@value='L']");
    private final By CLICK_TITLE_BAG = By.xpath("//span[text()='Корзина']");

    private WebDriver driver;

    public ProductPageAddBag() {
        this.driver = Singleton.getDriver();
    }

    private static final Logger logger = LogManager.getLogger(ProductPageAddBag.class);

    @Step
    public ProductPageAddBag clickProductAddBag() {
        try {
            driver.findElement(PRODUCT_ADD_BAG).click();
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
    public ProductPageAddBag clickProductAddL() {
        try {
            driver.findElement(PRODUCT_ADD_L).click();
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
    public BagPage clickTitleBag() {
        try {
            driver.findElement(CLICK_TITLE_BAG).click();
            return new BagPage();
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
}