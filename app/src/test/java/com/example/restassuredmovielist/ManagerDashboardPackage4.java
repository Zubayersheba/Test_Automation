package com.example.restassuredmovielist;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.get;
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

    //////////////////////with variable///////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////
    public int partner_id=9;
    public String remeber_token="n6K76s0bClSxgDG6kmxx2r32ojizqDugZU0kkTAzLVrLXchFaRFZ3nWfi9WLMQEKD0CCeL7jTuwI5ZvxrTwoFkOYcAjiHG59rzBm7Mpw6b1TI26In2c1QAqNEg5I3r6PrapBL8gMl4Cnq8ybSZbD9O0Lz3N5TJl8fX7qUUmNnf6dDbg8DY4jh1ZVhvJKSnKeHRC1jsjRamu2OULy3WouSamtfnB3dw0o8UZI9yJbGFKPkpGGKEekKeiDLpTaEjS";
    @Test
    public void sManager_Dashboard_data_badge()
    {
        when().
                get("v2/partners/"+partner_id+"/dashboard?remember_token="+remeber_token+"")
                .then().body("data.badge",equalTo("gold")).log().all();

    }
    @Test
    public void current_subscription_packag() {
        get("v2/partners/"+partner_id+"/dashboard?remember_token="+remeber_token+"")
                .then().assertThat()
                .body("data.current_subscription_package.id", (equalTo(4)));
    }
    @Test
    public void current_subscription_packag_billingType() {
        get("v2/partners/"+partner_id+"/dashboard?remember_token="+remeber_token+"").
                then().assertThat()
                .body("data.current_subscription_package.billing_type", (equalTo("yearly")));
    }
    @Test
    public void current_subscription_package_rules_loan()
    {
        get("v2/partners/"+partner_id+"/dashboard?remember_token="+remeber_token+"").
                then().assertThat().body("data.current_subscription_package.rules.loan",(equalTo(true)));
    }
    @Test
    public void current_subscription_package_rules_pos_invoice_print()
    {
        get("v2/partners/"+partner_id+"/dashboard?remember_token="+remeber_token+"").
                then().assertThat().body("data.current_subscription_package.rules.pos.invoice.print",(equalTo(true)));
    }
    @Test
    public void current_subscription_package_rules_pos_inventory_warranty()
    {
        get("v2/partners/"+partner_id+"/dashboard?remember_token="+remeber_token+"").
                then().assertThat().body("data.current_subscription_package.rules.pos.inventory.warranty.add",(equalTo(true)));
    }
    @Test
    public void current_subscription_package_rules_pos_report()
    {
        get("v2/partners/"+partner_id+"/dashboard?remember_token="+remeber_token+"").
                then().assertThat().body("data.current_subscription_package.rules.pos.report",(equalTo(true)));
    }
    @Test
    public void current_subscription_package_rules_resource_add()
    {
        get("v2/partners/"+partner_id+"/dashboard?remember_token="+remeber_token+"").
                then().assertThat().body("data.current_subscription_package.rules.resource.type.add",(equalTo(true)));
    }
    @Test
    public void data_status()
    {
        get("v2/partners/"+partner_id+"/dashboard?remember_token="+remeber_token+"").
                then().assertThat().body("data.status",(equalTo("Active")));
    }
    @Test
    public void data_has_qr_code()
    {
        get("v2/partners/"+partner_id+"/dashboard?remember_token="+remeber_token+"").
                then().assertThat().body("data.has_qr_code",(equalTo(0)));
    }
}
