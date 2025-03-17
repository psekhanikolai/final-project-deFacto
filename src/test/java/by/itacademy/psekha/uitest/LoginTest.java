package by.itacademy.psekha.uitest;

import by.itacademy.psekha.driver.Singleton;
import by.itacademy.psekha.pages.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoginTest {
    @Test
    @DisplayName("Login test with empty Email ")
    public void test1() {
        String actual = new HomePage()
                .open()
                .clickTitleEnter()
                .clickDropButtonEnter()
                .writePassword("23223")
                .clickLoginEnterButton()
                .getTextErrorEmail();
        Assertions.assertEquals("Пожалуйста, введите адрес электронной почты", actual);

    }

    @Test
    @DisplayName("Login test with empty password")
    public void test2() {
        String actual = new HomePage()
                .open()
                .clickTitleEnter()
                .clickDropButtonEnter()
                .writeEmail("ppsekha@mail.ru")
                .clickLoginEnterButton()
                .getTextErrorPassword();
        Assertions.assertEquals("Пароль должен быть от 6 до 10 символов.", actual);

    }

    @Test
    @DisplayName("Login test with full fields")
    public void test3() {
        String actual = new HomePage()
                .open()
                .clickTitleEnter()
                .clickDropButtonEnter()
                .writeEmail("ppsekha@mail.ru")
                .writePassword("12589")
                .clickLoginEnterButton()
                .getTextError();
        Assertions.assertEquals("Пожалуйста, проверьте информацию пользователя и попробуйте снова", actual);
    }

    @AfterEach
    public void tearDown() {
        Singleton.quit();
    }
}