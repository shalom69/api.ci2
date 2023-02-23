package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;

public class TestPostmanEcho {
    @Test
    void shouldShowPostRequest() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Тестовые данные")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Тестовые данные"))
        ;
    }
}