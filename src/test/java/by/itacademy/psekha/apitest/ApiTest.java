package by.itacademy.psekha.apitest;

import by.itacademy.psekha.api.ApiPage;
import by.itacademy.psekha.api.ReturnBody;
import io.restassured.response.Response;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ApiTest {

    @Test
    @DisplayName("Get site")
    public void test() {
        Response response = ApiPage.getDoSite();
        response.then()
                .statusCode(200);
    }

    @Test
    @DisplayName("Post login")
    public void test1() {
        Response response = ApiPage.postDoLogin();
        response.then().log().all();
        ReturnBody returnBody = response.getBody().as(ReturnBody.class);
        int statusCode = response.getStatusCode();
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(returnBody.Message).isEqualTo("Пожалуйста, проверьте информацию пользователя и попробуйте снова ");
        softAssertions.assertThat(statusCode).isEqualTo(200);
        softAssertions.assertAll();

    }

    @Test
    @DisplayName("Post addcart")
    public void test2() {
        Response response = ApiPage.postDoAddCart();
        response.then()
                .log().all()
                .statusCode(200);

    }

    @Test
    @DisplayName("add cart")
    public void test4() {
        Response response = ApiPage.postDoAddCart1();
        ReturnBody returnBody = response.getBody().as(ReturnBody.class);
        int statusCode = response.getStatusCode();
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(statusCode).isEqualTo(200);
        softAssertions.assertThat(returnBody.Data).isEqualTo("Товар был добавлен в Вашу корзину");
        softAssertions.assertAll();
    }
}