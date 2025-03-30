package demoqa;

import io.restassured.RestAssured;
import models.AuthorizRequestBody;
import models.AuthorizResponseBody;

import static io.restassured.http.ContentType.JSON;

public class Authoriz {

    private String token;
    private AuthorizRequestBody requestBody = new AuthorizRequestBody();
    requestBody.setUserName("testUser0018");
    requestBody.setPassword("testUser0018!");


/*    public Authoriz() {

        AuthorizResponseBody authorizResponseBody = RestAssured
                .given()
                .contentType(JSON)
                .log().all()
                .when()
                .

    }*/
}
