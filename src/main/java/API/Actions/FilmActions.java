package API.Actions;

import API.Models.Film;
import API.Models.Root;
import io.restassured.RestAssured;
import io.restassured.builder.ResponseBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.internal.RequestSpecificationImpl;
import io.restassured.specification.RequestSpecification;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;

public class FilmActions {
    RequestSpecification requestSpecification;

    public FilmActions(int id) {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(Root.baseUri)
                .setBasePath(Root.films + "/" + id)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL).build();
        RestAssured.responseSpecification = new ResponseSpecBuilder()
                .expectContentType(ContentType.JSON)
                .build();
    }

    public FilmActions(String url) {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(url)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL).build();
        RestAssured.responseSpecification = new ResponseSpecBuilder()
                .expectContentType(ContentType.JSON)
                .build();
    }

    public Film getFilm() {
        return RestAssured.given(requestSpecification)
                .get()
                .as(Film.class);
    }
}
