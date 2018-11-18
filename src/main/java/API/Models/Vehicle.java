package API.Models;

import java.util.List;

public class Vehicle {
    private String maxAtmospheringSpeed;
    private String cargoCapacity;
    private List<String> films;
    private String passengers;
    private List<String> pilots;
    private String edited;
    private String consumables;
    private String created;
    private String length;
    private String url;
    private String manufacturer;
    private String crew;
    private String vehicleClass;
    private String costInCredits;
    private String name;
    private String model;

    public String getMaxAtmospheringSpeed() {
        return maxAtmospheringSpeed;
    }

    public String getCargoCapacity() {
        return cargoCapacity;
    }

    public List<String> getFilms() {
        return films;
    }

    public String getPassengers() {
        return passengers;
    }

    public List<String> getPilots() {
        return pilots;
    }

    public String getEdited() {
        return edited;
    }

    public String getConsumables() {
        return consumables;
    }

    public String getCreated() {
        return created;
    }

    public String getLength() {
        return length;
    }

    public String getUrl() {
        return url;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getCrew() {
        return crew;
    }

    public String getVehicleClass() {
        return vehicleClass;
    }

    public String getCostInCredits() {
        return costInCredits;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return
                "Vehicle{" +
                        "max_atmosphering_speed = '" + maxAtmospheringSpeed + '\'' +
                        ",cargo_capacity = '" + cargoCapacity + '\'' +
                        ",films = '" + films + '\'' +
                        ",passengers = '" + passengers + '\'' +
                        ",pilots = '" + pilots + '\'' +
                        ",edited = '" + edited + '\'' +
                        ",consumables = '" + consumables + '\'' +
                        ",created = '" + created + '\'' +
                        ",length = '" + length + '\'' +
                        ",url = '" + url + '\'' +
                        ",manufacturer = '" + manufacturer + '\'' +
                        ",crew = '" + crew + '\'' +
                        ",vehicle_class = '" + vehicleClass + '\'' +
                        ",cost_in_credits = '" + costInCredits + '\'' +
                        ",name = '" + name + '\'' +
                        ",model = '" + model + '\'' +
                        "}";
    }
}