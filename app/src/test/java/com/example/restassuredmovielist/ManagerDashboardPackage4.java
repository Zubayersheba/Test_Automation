package com.example.restassuredmovielist;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.when;
import static org.hamcrest.core.IsEqual.equalTo;

public class ManagerDashboardPackage4 {

    @Before
    public void setBaseURL(){
        RestAssured.baseURI = "https://api.sheba.xyz";
    }
    @Test
    public void sManager_Dashboard_StatusCode_200()
    {
        when().
                get("v2/partners/9/dashboard?remember_token=n6K76s0bClSxgDG6kmxx2r32ojizqDugZU0kkTAzLVrLXchFaRFZ3nWfi9WLMQEKD0CCeL7jTuwI5ZvxrTwoFkOYcAjiHG59rzBm7Mpw6b1TI26In2c1QAqNEg5I3r6PrapBL8gMl4Cnq8ybSZbD9O0Lz3N5TJl8fX7qUUmNnf6dDbg8DY4jh1ZVhvJKSnKeHRC1jsjRamu2OULy3WouSamtfnB3dw0o8UZI9yJbGFKPkpGGKEekKeiDLpTaEjS")
                .then().statusCode(200).log().all();
    }
    @Test
    public void sManager_Dashboard_message_code_200()
    {
        when().
                get("v2/partners/9/dashboard?remember_token=n6K76s0bClSxgDG6kmxx2r32ojizqDugZU0kkTAzLVrLXchFaRFZ3nWfi9WLMQEKD0CCeL7jTuwI5ZvxrTwoFkOYcAjiHG59rzBm7Mpw6b1TI26In2c1QAqNEg5I3r6PrapBL8gMl4Cnq8ybSZbD9O0Lz3N5TJl8fX7qUUmNnf6dDbg8DY4jh1ZVhvJKSnKeHRC1jsjRamu2OULy3WouSamtfnB3dw0o8UZI9yJbGFKPkpGGKEekKeiDLpTaEjS")
                .then().body("code",equalTo(200))
                .body("message", equalTo("Successful"));
    }
    @Test
    public void sManager_Dashboard_data()
    {
        when().
                get("v2/partners/9/dashboard?remember_token=n6K76s0bClSxgDG6kmxx2r32ojizqDugZU0kkTAzLVrLXchFaRFZ3nWfi9WLMQEKD0CCeL7jTuwI5ZvxrTwoFkOYcAjiHG59rzBm7Mpw6b1TI26In2c1QAqNEg5I3r6PrapBL8gMl4Cnq8ybSZbD9O0Lz3N5TJl8fX7qUUmNnf6dDbg8DY4jh1ZVhvJKSnKeHRC1jsjRamu2OULy3WouSamtfnB3dw0o8UZI9yJbGFKPkpGGKEekKeiDLpTaEjS")
                .then().body("data.name",equalTo("Mistri.com.bd"));

    }
    @Test
    public void sManager_Dashboard_data_badge()
    {
        when().
                get("v2/partners/9/dashboard?remember_token=n6K76s0bClSxgDG6kmxx2r32ojizqDugZU0kkTAzLVrLXchFaRFZ3nWfi9WLMQEKD0CCeL7jTuwI5ZvxrTwoFkOYcAjiHG59rzBm7Mpw6b1TI26In2c1QAqNEg5I3r6PrapBL8gMl4Cnq8ybSZbD9O0Lz3N5TJl8fX7qUUmNnf6dDbg8DY4jh1ZVhvJKSnKeHRC1jsjRamu2OULy3WouSamtfnB3dw0o8UZI9yJbGFKPkpGGKEekKeiDLpTaEjS")
                .then().body("data.badge",equalTo("gold"));

    }
}
