package com.example.restassuredmovielist;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import io.restassured.RestAssured;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class Due_tracker_post_api {
    @Before
    public void setBaseURL() {
        RestAssured.baseURI = "https://api.dev-sheba.xyz";
    }

    @Test
    public void due_tracker_store_200() throws JSONException {

        JSONObject request=new JSONObject();
        request.put("amount", "100");
        request.put("type","due");
        request.put("remember_token","HqjPFF2xulIJrO91z0cvpYY1k65hdtlLezCI12wEiroe6PM7XrJ8JFxWT8HN");
        request.put("amount_cleared","0");

        given().body(request).
                post("/v2/partners/6420/due-tracker/store/160").
                then().statusCode(200);




    }

    @Test
    public void due_tracker_post_200(){
        RequestSpecification request = RestAssured.given();
       // String body= "{\"amount\": \"1000\", "+"  \"type\": \"due\", "+" \"remember_token\": \"HqjPFF2xulIJrO91z0cvpYY1k65hdtlLezCI12wEiroe6PM7XrJ8JFxWT8HN\", "+"  \"amount_cleared\": \"0\" }";
        String body= "{\"amount\": \"1000\",   \"type\": \"due\",  \"remember_token\": \"HqjPFF2xulIJrO91z0cvpYY1k65hdtlLezCI12wEiroe6PM7XrJ8JFxWT8HN\",  \"amount_cleared\": \"0\" }";
        request.header("Content-Type", "application/json");
        request.body(body);
        request.post("/v2/partners/6420/due-tracker/store/160").
                then().statusCode(200).log().all().assertThat().body("data.amount", equalTo("1000.00"));
    }






}
