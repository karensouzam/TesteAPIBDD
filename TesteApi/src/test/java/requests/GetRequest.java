package requests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class GetRequest {

    public static Response executeRequestGet(String url){
        baseURI = url;
        Response response = given()
                .contentType(ContentType.JSON)
                .when()
                .get()
                .then()
                .extract().response();
        return response;
    }
}
