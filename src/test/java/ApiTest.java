import entities.JsonResponse;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

public class ApiTest {

    @BeforeClass
    public static void setRequestUri() {
        RestAssured.baseURI = "https://reqres.in";
        RestAssured.basePath = "api/users/2";
    }

    @Test
    public void requestUserInfo_checkStatusCode_expect200() {
        when()
                .get().
        then()
                .assertThat().statusCode(200);
    }

    @Test
    public void requestUserInfo_checkResponseBody_expectNonNullFields() {

        JsonResponse response =
        when()
                .get().
        then().
                extract().as(JsonResponse.class);

        assertThat(response.getData().getId(), notNullValue());
        assertThat(response.getData().getEmail(), notNullValue());
        assertThat(response.getData().getFirstName(), notNullValue());
        assertThat(response.getData().getLastName(), notNullValue());
        assertThat(response.getData().getAvatar(), notNullValue());
    }
}
