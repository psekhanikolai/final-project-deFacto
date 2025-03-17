package by.itacademy.psekha.pages;

import by.itacademy.psekha.driver.Singleton;
import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ProductPage {
    private final By PRODUCT_ADD = By.xpath("//div[@data-swiper='product-card__swiper-0']");

    private WebDriver driver;

    public ProductPage() {
        this.driver = Singleton.getDriver();
    }

    private static final Logger logger = LogManager.getLogger(ProductPage.class);

    @Step
    public ProductPage scrollSite1() {
        Actions action = new Actions(driver);
        try {
            action.scrollByAmount(0, 300).perform();
            return this;
        } catch (Exception e) {
            logger.info("Attempt to scroll the page");
            logger.error("An error occurred while scrolling the page", e);
            throw e;
        }
    }

    @Step
    public ProductPageAddBag clickProductPage() {
        try {
            driver.findElement(PRODUCT_ADD).click();
            return new ProductPageAddBag();
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