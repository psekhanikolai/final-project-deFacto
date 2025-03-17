package by.itacademy.psekha.uitest;

import by.itacademy.psekha.driver.Singleton;
import by.itacademy.psekha.pages.HomePage;
import io.qameta.allure.Description;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class HomePageTest {
    @Test
    @Description("open website")
    public void test() {
        HomePage hp = new HomePage()
                .open();
    }

    @Test
    @Description("Click cart")
    public void test1(){
        HomePage hp = new HomePage()
                .open()
                .clickTitleBag();
    }

    @AfterEach
    public void tearDown() {
        Singleton.quit();
    }
}