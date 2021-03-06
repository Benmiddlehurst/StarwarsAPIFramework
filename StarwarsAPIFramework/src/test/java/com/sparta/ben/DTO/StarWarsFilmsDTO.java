package com.sparta.ben.DTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sparta.ben.Framework.Injector;
import com.sparta.ben.Framework.Utility.URLChanger;

@JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "title",
            "episode_id",
            "opening_crawl",
            "director",
            "producer",
            "release_date",
            "characters",
            "planets",
            "starships",
            "vehicles",
            "species",
            "created",
            "edited",
            "url"
    })
    public class StarWarsFilmsDTO extends StarWarsDTO {

        public StarWarsFilmsDTO(){}


        @JsonProperty("title")
        private String title;
        @JsonProperty("episode_id")
        private int episodeId;
        @JsonProperty("opening_crawl")
        private String openingCrawl;
        @JsonProperty("director")
        private String director;
        @JsonProperty("producer")
        private String producer;
        @JsonProperty("release_date")
        private String releaseDate;
        @JsonProperty("characters")
        private List<String> characters = null;
        @JsonProperty("planets")
        private List<String> planets = null;
        @JsonProperty("starships")
        private List<String> starships = null;
        @JsonProperty("vehicles")
        private List<String> vehicles = null;
        @JsonProperty("species")
        private List<String> species = null;
        @JsonProperty("created")
        private String created;
        @JsonProperty("edited")
        private String edited;
        @JsonProperty("url")
        private String url;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("title")
        public String getTitle() {
            return title;
        }

        @JsonProperty("title")
        public void setTitle(String title) {
            this.title = title;
        }

        @JsonProperty("episode_id")
        public int getEpisodeId() {
            return episodeId;
        }

        @JsonProperty("episode_id")
        public void setEpisodeId(int episodeId) {
            this.episodeId = episodeId;
        }

        @JsonProperty("opening_crawl")
        public String getOpeningCrawl() {
            return openingCrawl;
        }

        @JsonProperty("opening_crawl")
        public void setOpeningCrawl(String openingCrawl) {
            this.openingCrawl = openingCrawl;
        }

        @JsonProperty("director")
        public String getDirector() {
            return director;
        }

        @JsonProperty("director")
        public void setDirector(String director) {
            this.director = director;
        }

        @JsonProperty("producer")
        public String getProducer() {
            return producer;
        }

        @JsonProperty("producer")
        public void setProducer(String producer) {
            this.producer = producer;
        }

        @JsonProperty("release_date")
        public String getReleaseDate() {
            return releaseDate;
        }

        @JsonProperty("release_date")
        public void setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
        }

        @JsonProperty("characters")
        public List<String> getCharacters() {
            return characters;
        }

        @JsonProperty("characters")
        public void setCharacters(List<String> characters) {
            this.characters = characters;
        }

        @JsonProperty("planets")
        public List<String> getPlanets() {
            return planets;
        }

        @JsonProperty("planets")
        public void setPlanets(List<String> planets) {
            this.planets = planets;
        }

        @JsonProperty("starships")
        public List<String> getStarships() {
            return starships;
        }

        @JsonProperty("starships")
        public void setStarships(List<String> starships) {
            this.starships = starships;
        }

        @JsonProperty("vehicles")
        public List<String> getVehicles() {
            return vehicles;
        }

        @JsonProperty("vehicles")
        public void setVehicles(List<String> vehicles) {
            this.vehicles = vehicles;
        }

        @JsonProperty("species")
        public List<String> getSpecies() {
            return species;
        }

        @JsonProperty("species")
        public void setSpecies(List<String> species) {
            this.species = species;
        }

        @JsonProperty("created")
        public String getCreated() {
            return created;
        }

        @JsonProperty("created")
        public void setCreated(String created) {
            this.created = created;
        }

        @JsonProperty("edited")
        public String getEdited() {
            return edited;
        }

        @JsonProperty("edited")
        public void setEdited(String edited) {
            this.edited = edited;
        }

        @JsonProperty("url")
        public String getUrl() {
            return url;
        }

        @JsonProperty("url")
        public void setUrl(String url) {
            this.url = URLChanger.URLChanger(url);
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }


        private List<String> vehicleNames;
        private List<String> starshipNames;
        private List<String> characterNames;
        private List<String> planetNames;

    public List<String> getVehicleNames() {
        setVehicleNames(vehicles);
        return vehicleNames;
    }

    public void setVehicleNames(List<String> vehicles) {
        StarWarsVehiclesDTO starWarsDTO;
        List<String> vehiclesNameList = new ArrayList<>();
        for (String vehicle : vehicles) {
            vehicle = URLChanger.URLChanger(vehicle);
            starWarsDTO = (StarWarsVehiclesDTO) Injector.injectDTOURL(vehicle, "vehicles");
            String shipName = starWarsDTO.getName();
            vehiclesNameList.add(shipName);
        }
        vehicleNames = vehiclesNameList;
    }

    public List<String> getCharacterNames() {
        setCharacterNames(characters);
        return characterNames;
    }

    public void setCharacterNames(List<String> characters) {
        StarWarsPeopleDTO starWarsDTO;
        List<String> characterNameList = new ArrayList<>();
        for (String character : characters) {
            character = URLChanger.URLChanger(character);
            starWarsDTO = (StarWarsPeopleDTO) Injector.injectDTOURL(character, "people");
            String characterName = starWarsDTO.getName();
            characterNameList.add(characterName);
        }
        characterNames = characterNameList;
    }

    public List<String> getPlanetNames() {
        setPlanetNames(planets);
        return planetNames;
    }

    public void setPlanetNames(List<String> planets) {
        StarWarsPlanetsDTO starWarsDTO;
        List<String> planetList = new ArrayList<>();
        for (String planet : planets) {
            planet = URLChanger.URLChanger(planet);
            starWarsDTO = (StarWarsPlanetsDTO) Injector.injectDTOURL(planet, "planets");
            String planetName = starWarsDTO.getName();
            planetList.add(planetName);
        }
        planetNames = planetList;
    }
    public void setStarshipNames(List<String> starships) {
        StarWarsStarshipsDTO starWarsDTO;
        List<String> starshipsNameList = new ArrayList<>();
        for (String starship : starships) {
            starship = URLChanger.URLChanger(starship);
            starWarsDTO = (StarWarsStarshipsDTO) Injector.injectDTOURL(starship, "starships");
            String shipName = starWarsDTO.getName();
            starshipsNameList.add(shipName);
        }
        starshipNames = starshipsNameList;
    }

    public List<String> getStarshipNames() {
        setStarshipNames(starships);
        return starshipNames;
    }

    }
