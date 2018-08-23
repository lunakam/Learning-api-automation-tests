package com.apiAutomation.api.serviceObject;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static io.restassured.RestAssured.given;

@Service
@Slf4j
public class FakeApiUserService {

    private Response response;
    private RequestSpecification request;

    public void createRequest() {
        request = given()
                .baseUri("https://jsonplaceholder.typicode.com");
    }

    public void getValidUser() {
        response = request.when()
                .get("/users/1")
                .andReturn();

    }

    public void verifyUserResponse() {
        response.then()
                .assertThat()
                .statusCode(200);
    }
}
