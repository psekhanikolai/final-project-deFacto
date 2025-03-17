package by.itacademy.psekha.uitest;

import by.itacademy.psekha.driver.Singleton;
import by.itacademy.psekha.pages.BagPage;
import by.itacademy.psekha.pages.HomePage;
import by.itacademy.psekha.pages.ProductPage;
import by.itacademy.psekha.pages.ProductPageAddBag;
import io.qameta.allure.Description;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InputTest {
    @Test
    @Description("Write and search text")
    public void test(){
       String actual = new HomePage()
               .open()
               .inputSearchClick()
               .writeFieldSearch("Рубашка")
               .getTitleTextProduct();
        Assertions.assertEquals("‘Рубашка’ Результаты поиска:", actual);
    }

    @Test
    @Description("")
    public void test1(){
       ProductPage hp = new HomePage().open().clickTitleMan().scrollSite().clickImg().scrollSite1();
    }

    @Test
    @Description("Add product in to cart")
    public void test2(){
        BagPage bp = new HomePage()
                .open()
                .clickTitleMan()
                .scrollSite()
                .clickImg().scrollSite1()
                .clickProductPage()
                .clickProductAddL()
                .clickProductAddBag()
                .clickTitleBag();
    }

    @AfterEach
    public void tearDown() {
        Singleton.quit();
    }
}