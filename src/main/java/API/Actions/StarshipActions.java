package API.Actions;

import API.Models.Root;
import API.Models.Starship;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class StarshipActions {
    private RequestSpecification requestSpecification;

    public StarshipActions(int id) {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(Root.baseUri)
                .setBasePath(Root.starships + "/" + id)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL).build();
        RestAssured.responseSpecification = new ResponseSpecBuilder()
                .expectContentType(ContentType.JSON)
                .build();
    }

    public Starship getShip() {
        return RestAssured.given(requestSpecification)
                .get()
                .as(Starship.class);
    }
}
