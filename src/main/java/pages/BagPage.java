package pages;

import driver.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BagPage {
    private final By CLICK_GO_BAG = By.xpath("//button[text()=' Перейти в корзину ']");
    private final By CLICK_DELETE = By.xpath("//span[text()='Удалить']");
    private final By BUTTON_DELETE = By.xpath("//button[text()='Удалить']");
    private final By TITLE_TEXT = By.xpath("//div[text()='Ваша корзина пуста.']");

    private String URL = "https://www.defacto.com/ru-kz/shopping";

    private WebDriver driver;

    public BagPage() {
        this.driver = Singleton.getDriver();
    }

    public BagPage clickGoBag() {
        driver.findElement(CLICK_GO_BAG).click();
        return this;
    }

    public BagPage clickDelete() {
        driver.findElement(CLICK_DELETE).click();
        return this;
    }

    public BagPage clickGoBagAndclickDelete() {
        clickGoBag();
        clickDelete();
        return this;
    }

    public BagPage openBag() {
        driver.get(URL);
        return this;
    }

    public BagPage buttonDelete() {
        driver.findElement(BUTTON_DELETE).click();
        return this;
    }

    public String getTitleText() {
        return driver.findElement(TITLE_TEXT).getText();

    }
}