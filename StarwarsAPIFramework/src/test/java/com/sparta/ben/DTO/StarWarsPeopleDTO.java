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
        "name",
        "height",
        "mass",
        "hair_color",
        "skin_color",
        "eye_color",
        "birth_year",
        "gender",
        "homeworld",
        "films",
        "species",
        "vehicles",
        "starships",
        "created",
        "edited",
        "url"
     })

    public class StarWarsPeopleDTO extends StarWarsDTO {


    public StarWarsPeopleDTO(){}

            @JsonProperty("name")
            private String name;
            @JsonProperty("height")
            private String height;
            @JsonProperty("mass")
            private String mass;
            @JsonProperty("hair_color")
            private String hairColor;
            @JsonProperty("skin_color")
            private String skinColor;
            @JsonProperty("eye_color")
            private String eyeColor;
            @JsonProperty("birth_year")
            private String birthYear;
            @JsonProperty("gender")
            private String gender;
            @JsonProperty("homeworld")
            private String homeworld;
            @JsonProperty("films")
            private List<String> films = null;
            @JsonProperty("species")
            private List<Object> species = null;
            @JsonProperty("vehicles")
            private List<String> vehicles = null;
            @JsonProperty("starships")
            private List<String> starships = null;
            @JsonProperty("created")
            private String created;
            @JsonProperty("edited")
            private String edited;
            @JsonProperty("url")
            private String url;
            @JsonIgnore
            private Map<String, Object> additionalProperties = new HashMap<String, Object>();
            @JsonProperty("name")
            public String getName() {
                return name;
            }
            private List<String> starshipNames;

    private List<String> vehicleNames;

            @JsonProperty("name")
            public void setName(String name) {
                this.name = name;
            }

            @JsonProperty("height")
            public String getHeight() {
                return height;
            }

            @JsonProperty("height")
            public void setHeight(String height) {
                this.height = height;
            }

            @JsonProperty("mass")
            public String getMass() {
                return mass;
            }

            @JsonProperty("mass")
            public void setMass(String mass) {
                this.mass = mass;
            }

            @JsonProperty("hair_color")
            public String getHairColor() {
                return hairColor;
            }

            @JsonProperty("hair_color")
            public void setHairColor(String hairColor) {
                this.hairColor = hairColor;
            }

            @JsonProperty("skin_color")
            public String getSkinColor() {
                return skinColor;
            }

            @JsonProperty("skin_color")
            public void setSkinColor(String skinColor) {
                this.skinColor = skinColor;
            }

            @JsonProperty("eye_color")
            public String getEyeColor() {
                return eyeColor;
            }

            @JsonProperty("eye_color")
            public void setEyeColor(String eyeColor) {
                this.eyeColor = eyeColor;
            }

            @JsonProperty("birth_year")
            public String getBirthYear() {
                return birthYear;
            }

            @JsonProperty("birth_year")
            public void setBirthYear(String birthYear) {
                this.birthYear = birthYear;
            }

            @JsonProperty("gender")
            public String getGender() {
                return gender;
            }

            @JsonProperty("gender")
            public void setGender(String gender) {
                this.gender = gender;
            }

            @JsonProperty("homeworld")
            public String getHomeworld() {
                return homeworld;
            }

            @JsonProperty("homeworld")
            public void setHomeworld(String homeworld) {
                this.homeworld = homeworld;
            }

            @JsonProperty("films")
            public List<String> getFilms() {
                return films;
            }

            @JsonProperty("films")
            public void setFilms(List<String> films) {
                this.films = films;
            }

            @JsonProperty("species")
            public List<Object> getSpecies() {
                return species;
            }

            @JsonProperty("species")
            public void setSpecies(List<Object> species) {
                this.species = species;
            }

            @JsonProperty("vehicles")
            public List<String> getVehicles() {
                return vehicles;
            }

            @JsonProperty("vehicles")
            public void setVehicles(List<String> vehicles) {
                this.vehicles = vehicles;
            }

            public int getNumberOfVehicles(){return vehicles.size();}

            @JsonProperty("starships")
            public List<String> getStarships() {
                return starships;
            }

            @JsonProperty("starships")
            public void setStarships(List<String> starships) {
                this.starships = starships;
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




            public List<String> getStarshipNames() {
                setStarshipNames(starships);
                return starshipNames;
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


}

