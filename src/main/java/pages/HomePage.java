package pages;

import org.openqa.selenium.By;

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

}
