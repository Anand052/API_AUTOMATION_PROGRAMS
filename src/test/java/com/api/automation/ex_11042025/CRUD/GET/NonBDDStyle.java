package com.api.automation.ex_11042025.CRUD.GET;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class NonBDDStyle {


    public static void main(String[] args) {
        // Relax HTTPS validation (optional)
        RestAssured.useRelaxedHTTPSValidation();


        testnon_bdd_1(); // Valid PIN code
        testnon_bdd_2(); // Invalid PIN code
    }

    private static void testnon_bdd_1() {
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/110001");
        r.when().log().all().get();
        r.then().log().all().statusCode(200);
        System.out.println("✅ testnon_bdd_1 passed: Valid PIN code");
    }

    private static void testnon_bdd_2() {
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/-1");
        r.when().get();
        r.then().log().all().statusCode(404);
        System.out.println("✅ testnon_bdd_2 passed: Invalid PIN code");
    }
}
