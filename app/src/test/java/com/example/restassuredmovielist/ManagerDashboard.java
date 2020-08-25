package com.example.restassuredmovielist;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.when;
import static org.hamcrest.core.IsEqual.equalTo;

public class ManagerDashboard {
    @Before
    public void setBaseURL(){
        RestAssured.baseURI = "https://api.sheba.xyz";
    }
    @Test
    public void sManager_Dashboard_StatusCode_200()
    {
        when().
                get("v2/partners/17903/dashboard?remember_token=aCwLKJ3zd4qcKdUfD6IqxAKFmEYz9nZDuxfZllQijcxzCNBZxfhpX6DkfH63NHxJgEgiyyACtyJHb3KzV9cxaxWEynqHUMocc0dLIrqr3EaHGzATXq3IhdrMFc8ZlbOPiTwTSnfqFzwHlhllnGk09uzNUaT5bHSOAB6GTkSnooqJInJxG3NF96McopCGsdVxqJWdtjEuPlqn3zmzdT5WIXCNd4tvefCtgXPbOng4O73ufyDGSv3ivfAUWEZtXt4")
                .then().statusCode(200);
    }
    @Test
    public void sManager_Dashboard_message_code_200()
    {
        when().
                get("v2/partners/17903/dashboard?remember_token=aCwLKJ3zd4qcKdUfD6IqxAKFmEYz9nZDuxfZllQijcxzCNBZxfhpX6DkfH63NHxJgEgiyyACtyJHb3KzV9cxaxWEynqHUMocc0dLIrqr3EaHGzATXq3IhdrMFc8ZlbOPiTwTSnfqFzwHlhllnGk09uzNUaT5bHSOAB6GTkSnooqJInJxG3NF96McopCGsdVxqJWdtjEuPlqn3zmzdT5WIXCNd4tvefCtgXPbOng4O73ufyDGSv3ivfAUWEZtXt4")
                .then().body("code",equalTo(200))
                .body("message", equalTo("Successful"));
    }
    @Test
    public void sManager_Dashboard_data()
    {
        when().
                get("v2/partners/17903/dashboard?remember_token=aCwLKJ3zd4qcKdUfD6IqxAKFmEYz9nZDuxfZllQijcxzCNBZxfhpX6DkfH63NHxJgEgiyyACtyJHb3KzV9cxaxWEynqHUMocc0dLIrqr3EaHGzATXq3IhdrMFc8ZlbOPiTwTSnfqFzwHlhllnGk09uzNUaT5bHSOAB6GTkSnooqJInJxG3NF96McopCGsdVxqJWdtjEuPlqn3zmzdT5WIXCNd4tvefCtgXPbOng4O73ufyDGSv3ivfAUWEZtXt4")
                .then().body("data.name",equalTo("Test.Sp"));

    }
    @Test
    public void sManager_Dashboard_data_badge()
    {
        when().
                get("v2/partners/17903/dashboard?remember_token=aCwLKJ3zd4qcKdUfD6IqxAKFmEYz9nZDuxfZllQijcxzCNBZxfhpX6DkfH63NHxJgEgiyyACtyJHb3KzV9cxaxWEynqHUMocc0dLIrqr3EaHGzATXq3IhdrMFc8ZlbOPiTwTSnfqFzwHlhllnGk09uzNUaT5bHSOAB6GTkSnooqJInJxG3NF96McopCGsdVxqJWdtjEuPlqn3zmzdT5WIXCNd4tvefCtgXPbOng4O73ufyDGSv3ivfAUWEZtXt4")
                .then().body("data.badge",equalTo(null));

    }

//current_subscription_package"

    @Test
    public void current_subscription_packag() {
        get("/v2/partners/17903/dashboard?remember_token=aCwLKJ3zd4qcKdUfD6IqxAKFmEYz9nZDuxfZllQijcxzCNBZxfhpX6DkfH63NHxJgEgiyyACtyJHb3KzV9cxaxWEynqHUMocc0dLIrqr3EaHGzATXq3IhdrMFc8ZlbOPiTwTSnfqFzwHlhllnGk09uzNUaT5bHSOAB6GTkSnooqJInJxG3NF96McopCGsdVxqJWdtjEuPlqn3zmzdT5WIXCNd4tvefCtgXPbOng4O73ufyDGSv3ivfAUWEZtXt4").
                then().assertThat()
                .body("data.current_subscription_package.id", (equalTo(2)));
    }
    @Test
    public void current_subscription_packag_billingType() {
        get("/v2/partners/17903/dashboard?remember_token=aCwLKJ3zd4qcKdUfD6IqxAKFmEYz9nZDuxfZllQijcxzCNBZxfhpX6DkfH63NHxJgEgiyyACtyJHb3KzV9cxaxWEynqHUMocc0dLIrqr3EaHGzATXq3IhdrMFc8ZlbOPiTwTSnfqFzwHlhllnGk09uzNUaT5bHSOAB6GTkSnooqJInJxG3NF96McopCGsdVxqJWdtjEuPlqn3zmzdT5WIXCNd4tvefCtgXPbOng4O73ufyDGSv3ivfAUWEZtXt4").
                then().assertThat()
                .body("data.current_subscription_package.billing_type", (equalTo("yearly")));
    }
    @Test
    public void current_subscription_package_rules_loan()
    {
        get("/v2/partners/17903/dashboard?remember_token=aCwLKJ3zd4qcKdUfD6IqxAKFmEYz9nZDuxfZllQijcxzCNBZxfhpX6DkfH63NHxJgEgiyyACtyJHb3KzV9cxaxWEynqHUMocc0dLIrqr3EaHGzATXq3IhdrMFc8ZlbOPiTwTSnfqFzwHlhllnGk09uzNUaT5bHSOAB6GTkSnooqJInJxG3NF96McopCGsdVxqJWdtjEuPlqn3zmzdT5WIXCNd4tvefCtgXPbOng4O73ufyDGSv3ivfAUWEZtXt4").
                then().assertThat().body("data.current_subscription_package.rules.loan",(equalTo(true)));
    }
    @Test
    public void current_subscription_package_rules_dashboardAnalytics()
    {
        get("/v2/partners/17903/dashboard?remember_token=aCwLKJ3zd4qcKdUfD6IqxAKFmEYz9nZDuxfZllQijcxzCNBZxfhpX6DkfH63NHxJgEgiyyACtyJHb3KzV9cxaxWEynqHUMocc0dLIrqr3EaHGzATXq3IhdrMFc8ZlbOPiTwTSnfqFzwHlhllnGk09uzNUaT5bHSOAB6GTkSnooqJInJxG3NF96McopCGsdVxqJWdtjEuPlqn3zmzdT5WIXCNd4tvefCtgXPbOng4O73ufyDGSv3ivfAUWEZtXt4").
                then().assertThat().body("data.current_subscription_package.rules.dashboard_analytics",(equalTo(true)));
    }
    @Test
    public void current_subscription_package_rules_pos_invoice_print()
    {
        get("/v2/partners/17903/dashboard?remember_token=aCwLKJ3zd4qcKdUfD6IqxAKFmEYz9nZDuxfZllQijcxzCNBZxfhpX6DkfH63NHxJgEgiyyACtyJHb3KzV9cxaxWEynqHUMocc0dLIrqr3EaHGzATXq3IhdrMFc8ZlbOPiTwTSnfqFzwHlhllnGk09uzNUaT5bHSOAB6GTkSnooqJInJxG3NF96McopCGsdVxqJWdtjEuPlqn3zmzdT5WIXCNd4tvefCtgXPbOng4O73ufyDGSv3ivfAUWEZtXt4").
                then().assertThat().body("data.current_subscription_package.rules.pos.invoice.print",(equalTo(true)));
    }
    @Test
    public void current_subscription_package_rules_pos_inventory_warranty()
    {
        get("/v2/partners/17903/dashboard?remember_token=aCwLKJ3zd4qcKdUfD6IqxAKFmEYz9nZDuxfZllQijcxzCNBZxfhpX6DkfH63NHxJgEgiyyACtyJHb3KzV9cxaxWEynqHUMocc0dLIrqr3EaHGzATXq3IhdrMFc8ZlbOPiTwTSnfqFzwHlhllnGk09uzNUaT5bHSOAB6GTkSnooqJInJxG3NF96McopCGsdVxqJWdtjEuPlqn3zmzdT5WIXCNd4tvefCtgXPbOng4O73ufyDGSv3ivfAUWEZtXt4").
                then().assertThat().body("data.current_subscription_package.rules.pos.inventory.warranty.add",(equalTo(true)));
    }
    @Test
    public void current_subscription_package_rules_pos_report()
    {
        get("/v2/partners/17903/dashboard?remember_token=aCwLKJ3zd4qcKdUfD6IqxAKFmEYz9nZDuxfZllQijcxzCNBZxfhpX6DkfH63NHxJgEgiyyACtyJHb3KzV9cxaxWEynqHUMocc0dLIrqr3EaHGzATXq3IhdrMFc8ZlbOPiTwTSnfqFzwHlhllnGk09uzNUaT5bHSOAB6GTkSnooqJInJxG3NF96McopCGsdVxqJWdtjEuPlqn3zmzdT5WIXCNd4tvefCtgXPbOng4O73ufyDGSv3ivfAUWEZtXt4").
                then().assertThat().body("data.current_subscription_package.rules.pos.report",(equalTo(false)));
    }
}
