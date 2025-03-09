package pages;

import driver.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    private final By CLICK_TITLE_MAN = By.xpath("//a[@name='мужчинам']");
    private final By CLICK_TITLE_ENTER = By.xpath("(//span[text()='Войти'])[2]");
    private final By CLICK_DROP_BUTTON_ENTER = By.xpath("//button[@class='button header__section-desktop']");
    private final By CLICK_TITLE_BAG = By.xpath("//span[text()='Корзина']");
    private final By CLICK_IMG = By.xpath("(//img[@class='yall-loaded'])[1]");
    private final By SEARCH = By.xpath("(//input[@placeholder='Поиск: Джинсы, Боди, Футболки, Спортивные костюмы '])[2]");
    private final By SEARCH_CLICK = By.xpath("(//span[text()='Поиск']");
    private final By SEARCH_INPUT_CLICK = By.xpath("//input[@class='search-button main-search-button']");

    private String URL = "https://www.defacto.com/ru-ua";

    private WebDriver driver;

    public HomePage() {
        this.driver = Singleton.getDriver();
    }

    public HomePage clickTitleEnter() {
        driver.findElement(CLICK_TITLE_ENTER).click();
        return this;
    }

    public HomePage clickDropButtonEnter() {
        driver.findElement(CLICK_DROP_BUTTON_ENTER).click();
        return this;
    }

    public HomePage open() {
        driver.get(URL);
        return this;
    }

    public HomePage clickTitleBag() {
        driver.findElement(CLICK_TITLE_BAG).click();
        return this;
    }

    public HomePage clickTitleMan() {
        driver.findElement(CLICK_TITLE_MAN).click();
        return this;
    }

    public HomePage clickImg() {
        driver.findElement(CLICK_IMG).click();
        return this;
    }

    public HomePage inputSearchClick() {
        driver.findElement(SEARCH_INPUT_CLICK).click();
        return this;
    }

    public HomePage inputSearchWriteText(String text) {
        driver.findElement(SEARCH).sendKeys(text);
        return this;
    }

    public HomePage writeFieldSearch(String q) {
        Actions actions = new Actions(driver);
        actions.sendKeys(q).sendKeys(Keys.ENTER).perform();
        return this;
    }
}
