package utils;

import requests.GetRequest;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.is;

public class ValidacoesGet {

    public static void acessarApi(String url){
       GetRequest.executeRequestGet(url);
    }

    public static void validacaoConteudo(String campo, String valor){
        given()
                .contentType(ContentType.JSON)
                .when()
                .get()
                .then()
                .body(campo, is(valor));
    }

    public static void validacaoStatusCode(Integer statusCode){
        given()
                .contentType(ContentType.JSON)
                .when()
                .get()
                .then()
                .statusCode(statusCode);
    }

    public static void validacaoSchema(String json){
        given()
                .contentType(ContentType.JSON)
                .when()
                .get()
                .then()
                .body(matchesJsonSchemaInClasspath(json));
    }
}
