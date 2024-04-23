package service;

import io.restassured.response.Response;
import utils.Global;

import static io.restassured.RestAssured.given;

public class CEP {

    public static Response getTest(String url) {
        Response response = given()
                .get(url);
        return response;
    }

    public static Response getCEP(String url, int CEP) {
        Response response = given()
            .get(url+ Global.CEP);
        return response;
    }

    public static Response getCEPNonExistent(String url) {
        Response response = given()
            .get(url+ 99999);
        return response;
    }
}
