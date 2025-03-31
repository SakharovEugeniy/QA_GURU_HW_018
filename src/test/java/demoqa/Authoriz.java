package demoqa;

import io.restassured.RestAssured;
import models.AuthorizRequestBody;
import models.AuthorizResponseBody;

import static io.restassured.http.ContentType.JSON;


public class Authoriz {

    private String token;
    private AuthorizRequestBody requestBody = new AuthorizRequestBody();

    public Authoriz() {
    requestBody.setUserName("testUser0018");
    requestBody.setPassword("testUser0018!");
    AuthorizResponseBody responseBody = RestAssured
            .given()
            .accept("application/json")
            .contentType("application/json")
            .body(requestBody)
            .log().all()
            .when()
            .post("/Account/v1/GenerateToken")
            .then()
            .log().all()
            //.statusCode(200)
            .extract()
            .as(AuthorizResponseBody.class);

    this.token = responseBody.getToken();
    }

    public String getToken(){
        return token;
    }
}
