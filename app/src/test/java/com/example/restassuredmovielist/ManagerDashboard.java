package com.example.restassuredmovielist;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.basePath;
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

//current_subscription_package"
@Test
public void sManager_Dashboard_current_subscription_package()
{
    when().
            get("v2/partners/17903/dashboard?remember_token=aCwLKJ3zd4qcKdUfD6IqxAKFmEYz9nZDuxfZllQijcxzCNBZxfhpX6DkfH63NHxJgEgiyyACtyJHb3KzV9cxaxWEynqHUMocc0dLIrqr3EaHGzATXq3IhdrMFc8ZlbOPiTwTSnfqFzwHlhllnGk09uzNUaT5bHSOAB6GTkSnooqJInJxG3NF96McopCGsdVxqJWdtjEuPlqn3zmzdT5WIXCNd4tvefCtgXPbOng4O73ufyDGSv3ivfAUWEZtXt4")
            .then().body("data.geo_informations.lat",equalTo("23.790964"));

}
}
