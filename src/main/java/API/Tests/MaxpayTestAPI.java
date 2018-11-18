package API.Tests;

import API.Actions.FilmActions;
import API.Actions.PeopleActions;
import API.Actions.PlanetActions;
import API.Models.Film;
import API.Models.People;
import API.Models.Planet;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

public class MaxpayTestAPI {
    private SoftAssertions softAssert = new SoftAssertions();

    @Test
    public void simpleTest() {
        People character = new PeopleActions(1).getMan();
        softAssert.assertThat(character.getName()).isEqualTo("Luke Skywalker");

        Planet planet = new PlanetActions(character.getHomeworld()).getPlanet();
        softAssert.assertThat(planet.getName()).isEqualTo("Tatooine");
        softAssert.assertThat(planet.getPopulation()).isEqualTo("200000");

        Film film = new FilmActions(planet.getFilms().get(0)).getFilm();
        softAssert.assertThat(film.getTitle()).isEqualTo("Attack of the Clones");

        softAssert.assertThat(film.getCharacters()).contains(character.getUrl());
        softAssert.assertThat(film.getPlanets()).contains(planet.getUrl());
        softAssert.assertAll();
    }
}
