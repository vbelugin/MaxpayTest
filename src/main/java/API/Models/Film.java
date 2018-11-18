package API.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Film {
    private String edited;
    private String director;
    private String created;
    private List<String> vehicles;

    @JsonProperty("opening_crawl")
    private String openingCrawl;
    private String title;
    private String url;
    private List<String> characters;

    @JsonProperty("episode_id")
    private int episodeId;
    private List<String> planets;

    @JsonProperty("release_date")
    private String releaseDate;
    private List<String> starships;
    private List<String> species;
    private String producer;

    public String getEdited() {
        return edited;
    }

    public String getDirector() {
        return director;
    }

    public String getCreated() {
        return created;
    }

    public List<String> getVehicles() {
        return vehicles;
    }

    public String getOpeningCrawl() {
        return openingCrawl;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public List<String> getCharacters() {
        return characters;
    }

    public int getEpisodeId() {
        return episodeId;
    }

    public List<String> getPlanets() {
        return planets;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public List<String> getStarships() {
        return starships;
    }

    public List<String> getSpecies() {
        return species;
    }

    public String getProducer() {
        return producer;
    }

    @Override
    public String toString() {
        return
                "Response{" +
                        "edited = '" + edited + '\'' +
                        ",director = '" + director + '\'' +
                        ",created = '" + created + '\'' +
                        ",vehicles = '" + vehicles + '\'' +
                        ",opening_crawl = '" + openingCrawl + '\'' +
                        ",title = '" + title + '\'' +
                        ",url = '" + url + '\'' +
                        ",characters = '" + characters + '\'' +
                        ",episode_id = '" + episodeId + '\'' +
                        ",planets = '" + planets + '\'' +
                        ",release_date = '" + releaseDate + '\'' +
                        ",starships = '" + starships + '\'' +
                        ",species = '" + species + '\'' +
                        ",producer = '" + producer + '\'' +
                        "}";
    }

}
