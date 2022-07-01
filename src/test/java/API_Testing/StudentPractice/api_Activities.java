package API_Testing.StudentPractice;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class api_Activities {

    // Testing URI = https://fakerestapi.azurewebsites.net/api/v1/

    // Task 1: Using Rest Assured validate the status code for endpoint /Activities GET
    @Test
    public void verifyStatusCode(){
        RestAssured.given()
                .when()
                .get("https://fakerestapi.azurewebsites.net/api/v1/Activities")
                .then()
                .assertThat()
                .statusCode(200);
        System.out.println("Test verified, status code is 200 ok"); // Optional
    }

    // Task 2: Using Rest Assured Validate Content-Type  is application/json; charset=utf-8; v=1.0
    // for endpoint /Activities GET

    @Test
    public void verifyContentType(){
        RestAssured.given()
                .when()
                .get("https://fakerestapi.azurewebsites.net/api/v1/Activities")
                .then()
                .assertThat()
                .contentType(ContentType.JSON);
        System.out.println("Test verified that content type = JSON");
    }

    // Task 1: Using Rest Assured validate the status code for endpoint /Activities/12

    @Test
    public void verifyStatusCode12(){
        RestAssured.given()
                .when()
                .get("https://fakerestapi.azurewebsites.net/api/v1/Activities/12")
                .then()
                .assertThat()
                .statusCode(200);
        System.out.println("Test verified, status code is 200 ok"); // Optional
    }


    // Task 2: Using Rest Assured Validate Content-Type  is application/json; charset=utf-8; v=1.0
    // for endpoint /Activities/12

    @Test
    public void verifyContentTypeOption2(){
        RestAssured.given()
                .when()
                .get("https://fakerestapi.azurewebsites.net/api/v1/Activities")
                .then()
                .assertThat().header("Content-Type", "application/json; charset=utf-8; v=1.0");
    }
}
