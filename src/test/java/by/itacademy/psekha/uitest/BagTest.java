package by.itacademy.psekha.uitest;

import by.itacademy.psekha.pages.BagPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BagTest {
    @Test
    @DisplayName("Open and text checking")
    public void test(){
        String actual = new BagPage()
                .openBag()
                .getTitleText();
        Assertions.assertEquals("Ваша корзина пуста.", actual);
    }
}
