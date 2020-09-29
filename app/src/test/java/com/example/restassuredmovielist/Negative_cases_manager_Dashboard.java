package com.example.restassuredmovielist;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.when;
import static org.hamcrest.core.IsEqual.equalTo;

public class Negative_cases_manager_Dashboard {
    public int partner_id=266290;
    public String remeber_token="dcLF3MwGUCaPk1LuMNfyNjljydtXD5sNhmZ9MGybzdLHklpvRkaSf8QsfSp";
    //public String remeber_token="dcLF3MwGUCaPk1LuMNfyNjljydtXD5sNhmZ9MGybzdLHklpvRkaSf8QsfSpA";
    //SoakDc5Pzdc5JnrSzknuFFBxK1WSPZC3zuJnjvprLd0uTaTQ0rsrb9ZLtdfTihaR9lLrsjANcrxdvQcGJLx9NabF21tbdQeOmMsZkvCmY7dqBUX6e0ifmvoGtmntVRQBWJgcgupPGoJcI9J2UxknXh7RjF6l91hi6CCJkftdoMRhiV741RuB4YWoMbGemE5Fe7bSfXZIRmxjlkeUET1Nq4XSsxn2ra4EGxrceZsaqX4d4n9yg7YchOnhoykumxv

    @Before
    public void setBaseURL(){
        RestAssured.baseURI = "https://api.sheba.xyz";
    }

    @Test
    public void sManager_Dashboard_StatusCode_200()
    {
        when().
                get("v2/partners/"+partner_id+"/dashboard?remember_token="+remeber_token+"")
                .then().statusCode(200).log().all();
    }
    // when remember token mismatch
    @Test
    public void sManager_Dashboard_message_code_400()
    {
        when().
                get("v2/partners/"+partner_id+"/dashboard?remember_token="+remeber_token+"")
                .then().body("code",equalTo(404))
                .body("message", equalTo("Partner or Resource not found.")).log().all();
    }
    public int partner_id_resource=9;
    public String remeber_token_resource="SoakDc5Pzdc5JnrSzknuFFBxK1WSPZC3zuJnjvprLd0uTaTQ0rsrb9ZLtdfTihaR9lLrsjANcrxdvQcGJLx9NabF21tbdQeOmMsZkvCmY7dqBUX6e0ifmvoGtmntVRQBWJgcgupPGoJcI9J2UxknXh7RjF6l91hi6CCJkftdoMRhiV741RuB4YWoMbGemE5Fe7bSfXZIRmxjlkeUET1Nq4XSsxn2ra4EGxrceZsaqX4d4n9yg7YchOnhoykumxv";
    @Test
    public void sManager_Dashboard_StatusCode_2000()
    {
        when().
                get("v2/partners/"+partner_id_resource+"/dashboard?remember_token="+remeber_token_resource+"")
                .then().statusCode(200).log().all();
    }

    // when resource is a handyman of this partner
    @Test
    public void sManager_Dashboard_message_code_403()
    {
        when().
                get("v2/partners/"+partner_id_resource+"/dashboard?remember_token="+remeber_token_resource+"")
                .then().body("code",equalTo(403))
                .body("message", equalTo("Forbidden. You're not a manager of this partner.")).log().all();
    }
}

