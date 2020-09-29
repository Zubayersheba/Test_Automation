package com.example.restassuredmovielist;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.when;
import static org.hamcrest.core.IsEqual.equalTo;

public class ManagerDashboardPackage1 {
    public int partner_id=1;
    public String remeber_token="kKxJbSlMiiwAoOG9HN1JELhBuyTUhgavzkmVHIjwQ0ApQjQo20kvOJ8cSGmmsmlW1jfMUCgwayhgPhbIrR6uE1aI5DpSKgJtKXIHwBbGEL8WygzjfGn2sW9azz0dfZLqW1vJw7sNYSt85YEYk2C7xIEKtgkxCqjinZGfGcm6pafzO3YVloXLiCe36O2ZUSnEwKFDCkxwUocJ7S9VhahhWe73D5DzZYqVI1ypzqFg6lv1AIKsOuPtMhol1koZVX9";

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

    @Test
    public void sManager_Dashboard_message_code_200()
    {
        when().
                get("v2/partners/"+partner_id+"/dashboard?remember_token="+remeber_token+"")
                .then().body("code",equalTo(200))
                .body("message", equalTo("Successful"));
    }
    @Test
    public void sManager_Dashboard_message_code_404()
    {
        when().
                get("v2/partners/"+partner_id+"/dashboard?remember_token="+remeber_token+"")
                .then().body("code",equalTo(200))
                .body("message", equalTo("Successful"));
    }
    @Test
    public void sManager_Dashboard_data()
    {
        when().
                get("v2/partners/"+partner_id+"/dashboard?remember_token="+remeber_token+"")
                .then().body("data.name",equalTo("BD Transport"));

    }
    @Test
    public void sManager_Dashboard_data_badge()
    {
        when().
                get("v2/partners/"+partner_id+"/dashboard?remember_token="+remeber_token+"")
                .then().body("data.badge",equalTo(null)).log().all();

    }
    @Test
    public void current_subscription_packag() {
        get("v2/partners/"+partner_id+"/dashboard?remember_token="+remeber_token+"")
                .then().assertThat()
                .body("data.current_subscription_package.id", (equalTo(3)));
    }
    @Test
    public void current_subscription_packag_billingType() {
        get("v2/partners/"+partner_id+"/dashboard?remember_token="+remeber_token+"").
                then().assertThat()
                .body("data.current_subscription_package.billing_type", (equalTo("monthly")));
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
