package com.example.restassuredmovielist;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.when;
import static org.hamcrest.core.IsEqual.equalTo;

public class Movie_List_Get_Api {

    public int affiliate_id = 39169;

    @Before
    public void setBaseURL() {
        RestAssured.baseURI = "https://api.dev-sheba.xyz";
    }

    @Test
    public void movielist_getapi_statuscode_200() {

        when().get("/v2/affiliates/" + affiliate_id + "/movie-ticket/movie-list?remember_token=YguKQVLGiEJbqZORmlCbRkngzTulqdfRPHYaUMknRXtmnLLDEyfVyVKwMKKCVANpdRLGnaSYsgQYkIyjXOJJlVBECkmQycWdZpjktvURfeQsYLtmgSctAFyyhJZRmEnZkyxyatNaBHYixkUcmcHYNuTjxUzGjfLRCsTDWcjQtzcfinLKXJmXtEdNfEoZVmnnbzOhBKZUgCqIQqifLUCsIDpcPmnmnPjsugtGFqYZSDquNIxIJIFbHPPyxpMQtse")
                .then().statusCode(200);
    }
    @Test
    public void movielist_getapi_datalist_200() {

       when().get("/v2/affiliates/" + affiliate_id + "/movie-ticket/movie-list?remember_token=YguKQVLGiEJbqZORmlCbRkngzTulqdfRPHYaUMknRXtmnLLDEyfVyVKwMKKCVANpdRLGnaSYsgQYkIyjXOJJlVBECkmQycWdZpjktvURfeQsYLtmgSctAFyyhJZRmEnZkyxyatNaBHYixkUcmcHYNuTjxUzGjfLRCsTDWcjQtzcfinLKXJmXtEdNfEoZVmnnbzOhBKZUgCqIQqifLUCsIDpcPmnmnPjsugtGFqYZSDquNIxIJIFbHPPyxpMQtse")
                .then().body("code",equalTo(404))
                .body("movies.id[0]",equalTo(490)).log().all();
    }
}
