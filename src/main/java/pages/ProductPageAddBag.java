package pages;

import driver.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPageAddBag {
    private final By PRODUCT_ADD_BAG = By.xpath("(//span[text()='Добавить в корзину'])[1]");
    private final By PRODUCT_ADD_L = By.xpath("//button[@value='L']");
    private final By CLICK_TITLE_BAG = By.xpath("//span[text()='Корзина']");

    private WebDriver driver;

    public ProductPageAddBag() {
        this.driver = Singleton.getDriver();
    }


    public ProductPageAddBag clickProductAddBag() {
        driver.findElement(PRODUCT_ADD_BAG).click();
        return this;
    }

    public ProductPageAddBag clickProductAddL() {
        driver.findElement(PRODUCT_ADD_L).click();
        return this;
    }

    public ProductPageAddBag clickTitleBag() {
        driver.findElement(CLICK_TITLE_BAG).click();
        return this;
    }
}