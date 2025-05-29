package com.api.automation;

import io.restassured.RestAssured;

public class Test002_get {

    public static void main(String[] args){

        System.out.println("Rest Assured Testcase");
        System.out.println("Get Request Demo");

        // Gherkin Syntax
        // given() - url, headers, body or payload
        // when() - HTTP method - get, post, put, delete, patch
        // then() - verify response - Expected Result == Actual Result

        RestAssured
                .given()
                    .baseUri("https://restful-booker.herokuapp.com")
                    .basePath("/booking/1001").log().all()
                .when()
                    .get()
                .then().log().all()
                    .statusCode(200);

    }
}
