package API.Actions;

import API.Models.People;
import API.Models.Root;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class PeopleActions {
    private RequestSpecification requestSpecification;

    public PeopleActions(int id) {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(Root.baseUri)
                .setBasePath(Root.people + "/" + id)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL).build();
        RestAssured.responseSpecification = new ResponseSpecBuilder()
                .expectContentType(ContentType.JSON)
                .build();
    }

    public PeopleActions(String url) {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(url)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL).build();
        RestAssured.responseSpecification = new ResponseSpecBuilder()
                .expectContentType(ContentType.JSON)
                .build();
    }

    public People getMan() {
        return RestAssured.given(requestSpecification)
                .get()
                .as(People.class);
    }
}
