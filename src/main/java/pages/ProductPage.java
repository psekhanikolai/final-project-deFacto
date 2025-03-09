package pages;

import driver.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ProductPage {
    private final By PRODUCT_ADD = By.xpath("//div[@data-swiper='product-card__swiper-1']");

    private WebDriver driver;

    public ProductPage() {
        this.driver = Singleton.getDriver();
    }

    public ProductPage clickProductPage() {
        Actions action = new Actions(driver);
        action.scrollByAmount(0,250).perform();
        driver.findElement(PRODUCT_ADD).click();
        return this;
    }
}