package API.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Planet extends BaseModel {
    private List<String> films;
    private String edited;
    private String created;
    private String climate;

    @JsonProperty("rotation_period")
    private String rotationPeriod;
    private String url;
    private String population;

    @JsonProperty("orbital_period")
    private String orbitalPeriod;

    @JsonProperty("surface_water")
    private String surfaceWater;
    private String diameter;
    private String gravity;
    private List<String> residents;
    private String terrain;

    public List<String> getFilms() {
        return films;
    }

    public String getEdited() {
        return edited;
    }

    public String getCreated() {
        return created;
    }

    public String getClimate() {
        return climate;
    }

    public String getRotationPeriod() {
        return rotationPeriod;
    }

    public String getUrl() {
        return url;
    }

    public String getPopulation() {
        return population;
    }

    public String getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public String getSurfaceWater() {
        return surfaceWater;
    }

    public String getDiameter() {
        return diameter;
    }

    public String getGravity() {
        return gravity;
    }

    public String getName() {
        return name;
    }

    public List<String> getResidents() {
        return residents;
    }

    public String getTerrain() {
        return terrain;
    }

    @Override
    public String toString() {
        return
                "Planet{" +
                        "films = '" + films + '\'' +
                        ",edited = '" + edited + '\'' +
                        ",created = '" + created + '\'' +
                        ",climate = '" + climate + '\'' +
                        ",rotation_period = '" + rotationPeriod + '\'' +
                        ",url = '" + url + '\'' +
                        ",population = '" + population + '\'' +
                        ",orbital_period = '" + orbitalPeriod + '\'' +
                        ",surface_water = '" + surfaceWater + '\'' +
                        ",diameter = '" + diameter + '\'' +
                        ",gravity = '" + gravity + '\'' +
                        ",name = '" + name + '\'' +
                        ",residents = '" + residents + '\'' +
                        ",terrain = '" + terrain + '\'' +
                        "}";
    }
}