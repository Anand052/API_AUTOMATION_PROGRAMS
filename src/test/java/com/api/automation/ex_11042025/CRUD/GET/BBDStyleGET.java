package com.api.automation.ex_11042025.CRUD.GET;

import io.restassured.RestAssured;

public class BBDStyleGET {
    public static void main (String [] args){

        /*
        GET Request - https://api.zippopotam.us/IN/560037
        URL
        Header
        GET Method
        base URL = https://api.zippopotam.us
        base path = /IN/560037
        payload
        Auth - Basic, Digest, JWT, Bearer Token, 0Auth 2.0 ? no

        Verification
        Status Code
        Response Body
        Time, Header, Cookies

        ==========================================================

        given ->
         URL
        HEADER ?, Cookies
        base url = https://api.zippopotam.us
        basePath = /IN/560037
        Auth - Basic, Digest, JWT, Bearer Token, OAuth 2.0 ? = No


        When  ->
        PaYLOAD - ? NO/yES - JSON. XML  -> String, Hashmap, Object class
        GET Method



        Then()
        Response Validation
         Status Code
        Response Body
        Time, Headers ,Cookies

         */
        
        test1();
        test2();

        
    }

    private static void test2() {
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/560037")
                .when().log().all().get()
                .then().log().all().statusCode(200);
    }

    private static void test1() {
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/-1")
                .when().log().all().get()
                .then().log().all().statusCode(404);
    }
}
