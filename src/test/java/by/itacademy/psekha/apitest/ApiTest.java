package by.itacademy.psekha.apitest;

import by.itacademy.psekha.api.ApiPage;
import by.itacademy.psekha.api.ReturnBody;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import jdk.jfr.Description;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ApiTest {

    @Test
    @Description("Get site")
    public void test() {
        Response response = ApiPage.getDoSite();
        response.then()
                .statusCode(200);
    }

    @Test
    @Description("Post login")
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
    @Description("Post addcart")
    public void test2() {
        Response response = ApiPage.postDoAddCart();
        response.then()
                .log().all()
                .statusCode(200);

    }

    @Test
    @Description("add cart")
    public void test4() {
        Response response = ApiPage.postDoAddCart1();
        ReturnBody returnBody = response.getBody().as(ReturnBody.class);
        int statusCode = response.getStatusCode();
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(statusCode).isEqualTo(200);
        softAssertions.assertThat(returnBody.Data).isEqualTo("Товар был добавлен в Вашу корзину");
        softAssertions.assertAll();
    }

    @Test
    @Description("Empty password field")
    public void testLogin() {
        String response = ApiPage.postDoLoginEmptyPassword()
                .then()
                .extract()
                .asString();
        JsonPath jsonPath = new JsonPath(response);
        String passwordEmpty = jsonPath.getString("ValidationErrors[0].v");
        assertThat(passwordEmpty, equalTo("Пожалуйста, введите Ваш пароль "));


    }

    @Test
    @Description("Empty Email field")
    public void testLogin1() {
        String response = ApiPage.postDoLoginEmptyEmail()
                .then()
                .extract()
                .asString();
        JsonPath jsonPath = new JsonPath(response);
        String emailEmpty = jsonPath.getString("ValidationErrors[0].v");
        assertThat(emailEmpty, equalTo("Пожалуйста, введите адрес электронной почты"));
    }
}