package API.Actions;

import API.Models.Planet;
import API.Models.Root;
import API.Models.Vehicle;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class VehicleActions {
    RequestSpecification requestSpecification;

    public VehicleActions(int id) {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(Root.baseUri)
                .setBasePath(Root.vehicles + "/" + id)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL).build();
        RestAssured.responseSpecification = new ResponseSpecBuilder()
                .expectContentType(ContentType.JSON)
                .build();
    }

    public Vehicle getVehicle() {
        return RestAssured.given(requestSpecification)
                .get()
                .as(Vehicle.class);
    }
}
