package by.itacademy.psekha.uitest;

import by.itacademy.psekha.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InputTest {
    @Test
    @DisplayName("Write and search text")
    public void test(){
       String actual = new HomePage()
               .open()
               .inputSearchClick()
               .writeFieldSearch("Рубашка")
               .getTitleTextProduct();
        Assertions.assertEquals("‘Рубашка’ Результаты поиска:", actual);
    }
}
