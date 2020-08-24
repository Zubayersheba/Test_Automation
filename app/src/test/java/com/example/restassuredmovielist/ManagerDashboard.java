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
        RestAssured.baseURI = "https://api.dev-sheba.xyz";
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
        get("/v2/partners/37662/dashboard?remember_token=vUXmcCyv6MblL0fafVZuRjrQdEVKB6fXn7nyGttEmlEY8hRUSEpHvrGPjM59").
                then().assertThat()
                .body("data.current_subscription_package.id", (equalTo(4)));
    }
}
