package API.Actions;

import API.Models.Root;
import API.Models.Species;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class SpeciesActions {
    private RequestSpecification requestSpecification;

    public SpeciesActions(int id) {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(Root.baseUri)
                .setBasePath(Root.species + "/" + id)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL).build();
        RestAssured.responseSpecification = new ResponseSpecBuilder()
                .expectContentType(ContentType.JSON)
                .build();
    }

    public SpeciesActions(String url) {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(url)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL).build();
        RestAssured.responseSpecification = new ResponseSpecBuilder()
                .expectContentType(ContentType.JSON)
                .build();
    }

    public Species getSpecie() {
        return RestAssured.given(requestSpecification)
                .get()
                .as(Species.class);
    }
}
