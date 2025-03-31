package demoqa;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BaseTest {

    @BeforeAll
    public static void setUp(){
        RestAssured.baseURI = "http://demoqa.com";
        //RestAssured.basePath = "/profile";
    }
    @Test
    public void testTest(){
        Authoriz atr = new Authoriz();
        System.out.println(atr.getToken());

    }



}
