package requests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class PostRequest {

    public static Response executeRequestGet(String url, String body){
        baseURI = url;
        Response response = given()
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .post(body)
                .then()
                .extract().response();
        return response;
    }
}
