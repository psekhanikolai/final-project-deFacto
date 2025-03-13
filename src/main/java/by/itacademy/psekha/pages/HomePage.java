package by.itacademy.psekha.pages;

import by.itacademy.psekha.driver.Singleton;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    private final By CLICK_TITLE_MAN = By.xpath("//a[@name='мужчинам']");
    private final By CLICK_TITLE_ENTER = By.xpath("(//span[text()='Войти/Зарегистрироваться'])[2]");
    private final By CLICK_DROP_BUTTON_ENTER = By.xpath("//button[@class='button header__section-desktop']");
    private final By CLICK_TITLE_BAG = By.xpath("//span[text()='Корзина']");
    private final By CLICK_IMG = By.xpath("(//img[@class='yall-loaded'])[3]");
    private final By SEARCH = By.xpath("(//input[@placeholder='Поиск: Джинсы, Боди, Футболки, Спортивные костюмы '])[2]");
    private final By SEARCH_CLICK = By.xpath("(//span[text()='Поиск']");
    private final By SEARCH_INPUT_CLICK = By.xpath("//input[@class='search-button main-search-button']");

    private String URL = "https://www.defacto.com/ru-kz";

    private WebDriver driver;

    public HomePage() {
        this.driver = Singleton.getDriver();
    }

    private static final Logger logger = LogManager.getLogger(HomePage.class);

    public LoginPage clickDropButtonEnter() {
        try {
            driver.findElement(CLICK_DROP_BUTTON_ENTER).click();
            return new LoginPage();
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

    public HomePage clickTitleBag() {
        try {
            driver.findElement(CLICK_TITLE_BAG).click();
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

    public HomePage clickTitleMan() {
        try {
            driver.findElement(CLICK_TITLE_MAN).click();
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

    public HomePage scrollSite() {
        Actions action = new Actions(driver);
        try {
            action.scrollByAmount(0, 1000).perform();
            return this;
        } catch (Exception e) {
            logger.info("Attempt to scroll the page");
            logger.error("An error occurred while scrolling the page", e);
            throw e;
        }
    }

    public HomePage clickImg() {
        try {
            driver.findElement(CLICK_IMG).click();
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

    public HomePage inputSearchClick() {
        try {
            driver.findElement(SEARCH_INPUT_CLICK).click();
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

    public HomePage inputSearchWriteText(String text) {
        try {
            driver.findElement(SEARCH).sendKeys(text);
            return this;
        } catch (NoSuchElementException e) {
            logger.info("Attempted to enter a text, but the element was not found.");
            logger.error("Text entry field not found", e);
            throw e;
        } catch (Exception e) {
            logger.info("Attempted to enter a text, but an error occurred.");
            logger.error("Error encountered while trying to enter text", e);
            throw e;
        }
    }

    public HomePage open() {
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

    public HomePage clickTitleEnter() {
        try {
            driver.findElement(CLICK_TITLE_ENTER).click();
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

    public HomePage writeFieldSearch(String search) {
        {
            try {
                Actions actions = new Actions(driver);
                actions.sendKeys(search).sendKeys(Keys.ENTER).perform();
                return this;
            } catch (NullPointerException e) {
                logger.info("Tried to press the ENTER button, but the driver did not work.");
                logger.error("Driver is not initialized", e);
                throw e;
            } catch (Exception e) {
                logger.info("Attempting to press the ENTER button, an error occurred.");
                logger.error("Error encountered while trying to write text and press Enter", e);
                throw e;
            }
        }
    }
}
