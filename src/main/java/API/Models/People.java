package API.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class People extends BaseModel {
    private List<String> films;
    private String homeworld;
    private String gender;

    @JsonProperty("skin_color")
    private String skinColor;
    private String edited;
    private String created;
    private String mass;
    private List<String> vehicles;
    private String url;

    @JsonProperty("birth_year")
    private String birthYear;

    @JsonProperty("hair_color")
    private String hairColor;

    @JsonProperty("eye_color")
    private String eyeColor;
    private List<String> species;
    private List<String> starships;
    private String height;

    public List<String> getFilms(){
        return films;
    }

    public String getHomeworld(){
        return homeworld;
    }

    public String getGender(){
        return gender;
    }

    public String getSkinColor(){
        return skinColor;
    }

    public String getEdited(){
        return edited;
    }

    public String getCreated(){
        return created;
    }

    public String getMass(){
        return mass;
    }

    public List<String> getVehicles(){
        return vehicles;
    }

    public String getUrl(){
        return url;
    }

    public String getBirthYear(){
        return birthYear;
    }

    public String getHairColor(){
        return hairColor;
    }

    public String getEyeColor(){
        return eyeColor;
    }

    public List<String> getSpecies(){
        return species;
    }

    public List<String> getStarships(){
        return starships;
    }

    public String getName(){
        return name;
    }

    public String getHeight(){
        return height;
    }
}
