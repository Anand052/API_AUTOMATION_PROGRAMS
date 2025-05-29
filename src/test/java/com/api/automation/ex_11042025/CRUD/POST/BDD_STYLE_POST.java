package com.api.automation.ex_11042025.CRUD.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class BDD_STYLE_POST {
    // POST Request
    // URL - https://restful-booker.herokuapp.com/auth
    // BODY - PAYLOAD - JSON
    // {
    //    "username" : "admin",
    //    "password" : "password123"
    //}
    // HEADER - Content Type -> application/json

    static String payload = "{\n" +
            "  \"username\": \"admin\", \n" +
            "  \"password\": \"password123\"\n" +
            "}";

    public static void main(String[] args) {
        RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth").contentType(ContentType.JSON).log().all()
                .body(payload)
                .when().log().all().post()
                .then().log().all().statusCode(200);
    }
}
