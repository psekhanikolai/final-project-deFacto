package by.itacademy.psekha.uitest;

import by.itacademy.psekha.pages.HomePage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HomePageTest {
    @Test
    @DisplayName("open website")
    public void test() {
        HomePage hp = new HomePage()
                .open();
    }

    @Test
    @DisplayName("Click cart")
    public void test1(){
        HomePage hp = new HomePage().open().clickTitleBag();
    }
}
