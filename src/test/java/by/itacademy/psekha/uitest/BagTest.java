package by.itacademy.psekha.uitest;

import by.itacademy.psekha.driver.Singleton;
import by.itacademy.psekha.pages.BagPage;
import io.qameta.allure.Description;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BagTest {
    @Test
  @Description("Open and text checking")
    public void test(){
        String actual = new BagPage()
                .openBag()
                .getTitleText();
        Assertions.assertEquals("Ваша корзина пуста.", actual);
    }

    @AfterEach
    public void tearDown() {
        Singleton.quit();
    }
}