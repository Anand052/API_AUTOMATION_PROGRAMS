package com.api.automation.ex_11042025.CRUD.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class NonBDDSTYLE {

    RequestSpecification RequestSpecification;
    Response response;
    ValidatableResponse ValidatableResponse;

    // 6118
    // Token -  Token?
    // Payload - {
    //    "firstname" : "Pramod",
    //    "lastname" : "Brown",
    //    "totalprice" : 111,
    //    "depositpaid" : true,
    //    "bookingdates" : {
    //        "checkin" : "2018-01-01",
    //        "checkout" : "2019-01-01"
    //    },
    //    "additionalneeds" : "Breakfast"
    //}


    // POST - Auth - token
    // POST - Booking ID
    // PUT - token and BookingID


//    public void get_token(){
//
//    }
//
//    public void get_booking_id(){
//        return bookingid;
//    }

    @Test
    public void test_put_positive_tc(){
        // POST - AUTH - Token
        String token = "2a881bf57db4406";
        String bookingid = "4451";
        String payloadPUT= "{\n" +
                "    \"firstname\" : \"Shailendra\",\n" +
                "    \"lastname\" : \"Mishra\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : false,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2024-05-30\",\n" +
                "        \"checkout\" : \"2024-05-30\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Lunch\"\n" +
                "}";

        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" + bookingid);
        r.contentType(ContentType.JSON);
        r.cookie("token", token);
        r.body(payloadPUT).log().all();

        Response response = r.when().log().all().put();

        ValidatableResponse ValidatableResponse = response.then().log().all();
        ValidatableResponse.statusCode(200);



    }

}
