package com.api.automation.ex_11042025.CRUD.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;


public class NON_BDD_STYLE_POST {
    // POST Request
    // URL - https://restful-booker.herokuapp.com/auth
    // BODY - PAYLOAD - JSON
    // {
    //    "username" : "admin",
    //    "password" : "password123"
    //}
    // HEADER - Content Type -> application/json


    @Test
    public void main(String[] args) {

        //  Payload  - String(1%), Hashmap(4%), Classes( 95%)
        String payload = "{\n" +
                "  \"username\": \"admin\", \n" +
                "  \"password\": \"password123\"\n" +
                "}";
         RequestSpecification r = RestAssured.given();

        // Given - Request Spec
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON).log().all();
        r.body(payload);

        // When -     Response
        Response response = r.when().log().all().post();

        // Then - ValidatableResponse
        // Validation
        ValidatableResponse ValidatableResponse = response.then().log().all().statusCode(200);
    }
}
