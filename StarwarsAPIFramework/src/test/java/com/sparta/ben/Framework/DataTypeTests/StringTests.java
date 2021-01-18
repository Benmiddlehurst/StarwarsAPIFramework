package com.sparta.ben.Framework.DataTypeTests;

import com.sparta.ben.DTO.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringTests {
//    @Test
//    public void stringTester(String dto, StarWarsDTO requestedDTO){
//        switch(dto) {
//            case "people":
//                isStringNullPeople((StarWarsPeopleDTO) requestedDTO);
//                isStringBlankPeople((StarWarsPeopleDTO) requestedDTO);
//            case "films":
//                isStringNullFilms((StarWarsFilmsDTO) requestedDTO);
//                isStringBlankFilms((StarWarsFilmsDTO) requestedDTO);
//            case "planets":
//                isStringNullPlanets((StarWarsPlanetsDTO) requestedDTO);
//                isStringBlankPlanets((StarWarsPlanetsDTO) requestedDTO);
//            case "starships":
//                isStringNullStarships((StarWarsStarshipsDTO) requestedDTO);
//                isStringBlankStarships((StarWarsStarshipsDTO) requestedDTO);
//            case "vehicles":
//                isStringNullVehicles((StarWarsVehiclesDTO) requestedDTO);
//                isStringBlankVehicles((StarWarsVehiclesDTO) requestedDTO);
//        }
//    }

    @Test
    public void stringTesters(String dto, StarWarsDTO requestedDTO) {
        if (dto.equals("people")) {
            isStringNullPeople((StarWarsPeopleDTO) requestedDTO);
            isStringBlankPeople((StarWarsPeopleDTO) requestedDTO);
        } else if (dto.equals("films")) {
            isStringNullFilms((StarWarsFilmsDTO) requestedDTO);
            isStringBlankFilms((StarWarsFilmsDTO) requestedDTO);
        } else if (dto.equals("planets")) {
            isStringNullPlanets((StarWarsPlanetsDTO) requestedDTO);
            isStringBlankPlanets((StarWarsPlanetsDTO) requestedDTO);
        } else if (dto.equals("starships")) {
            isStringNullStarships((StarWarsStarshipsDTO) requestedDTO);
            isStringBlankStarships((StarWarsStarshipsDTO) requestedDTO);
        } else if (dto.equals("vehicles")) {
            isStringNullVehicles((StarWarsVehiclesDTO) requestedDTO);
            isStringBlankVehicles((StarWarsVehiclesDTO) requestedDTO);
        }
    }


        @Test
    @DisplayName("Is String Null People")
    public void isStringNullPeople(StarWarsPeopleDTO starWarsDTO) {
        Assertions.assertNotNull(starWarsDTO.getName());
        Assertions.assertNotNull(starWarsDTO.getHeight());
        Assertions.assertNotNull(starWarsDTO.getMass());
        Assertions.assertNotNull(starWarsDTO.getHairColor());
        Assertions.assertNotNull(starWarsDTO.getSkinColor());
        Assertions.assertNotNull(starWarsDTO.getEyeColor());
        Assertions.assertNotNull(starWarsDTO.getBirthYear());
        Assertions.assertNotNull(starWarsDTO.getGender());
        Assertions.assertNotNull(starWarsDTO.getHomeworld());
        Assertions.assertNotNull(starWarsDTO.getFilms().toString());
        Assertions.assertNotNull(starWarsDTO.getSpecies());
        Assertions.assertNotNull(starWarsDTO.getVehicles().toString());
        Assertions.assertNotNull(starWarsDTO.getStarships().toString());
        Assertions.assertNotNull(starWarsDTO.getCreated());
        Assertions.assertNotNull(starWarsDTO.getEdited());
        Assertions.assertNotNull(starWarsDTO.getUrl());
    }

    @Test
    @DisplayName("Is String Blank? People")
    public void isStringBlankPeople(StarWarsPeopleDTO starWarsDTO) {
        Assertions.assertNotEquals(0, starWarsDTO.getName().length());
        Assertions.assertNotEquals(0, starWarsDTO.getHeight().length());
        Assertions.assertNotEquals(0, starWarsDTO.getMass().length());
        Assertions.assertNotEquals(0, starWarsDTO.getHairColor().length());
        Assertions.assertNotEquals(0, starWarsDTO.getSkinColor().length());
        Assertions.assertNotEquals(0, starWarsDTO.getEyeColor().length());
        Assertions.assertNotEquals(0, starWarsDTO.getBirthYear().length());
        Assertions.assertNotEquals(0, starWarsDTO.getGender().length());
        Assertions.assertNotEquals(0, starWarsDTO.getHomeworld().toString().length());
        Assertions.assertNotEquals(0, starWarsDTO.getFilms().toString().length());
        Assertions.assertNotEquals(0, starWarsDTO.getSpecies().toString().length());
        Assertions.assertNotEquals(0, starWarsDTO.getVehicles().toString().length());
        Assertions.assertNotEquals(0, starWarsDTO.getStarships().toString().length());
        Assertions.assertNotEquals(0, starWarsDTO.getCreated().length());
        Assertions.assertNotEquals(0, starWarsDTO.getEdited().length());
        Assertions.assertNotEquals(0, starWarsDTO.getUrl().length());
    }

    @Test
    @DisplayName("Is String Null Planets")
    public void isStringNullPlanets(StarWarsPlanetsDTO starWarsDTO) {
        Assertions.assertNotNull(starWarsDTO.getName());
        Assertions.assertNotNull(starWarsDTO.getRotationPeriod());
        Assertions.assertNotNull(starWarsDTO.getOrbitalPeriod());
        Assertions.assertNotNull(starWarsDTO.getDiameter());
        Assertions.assertNotNull(starWarsDTO.getClimate());
        Assertions.assertNotNull(starWarsDTO.getGravity());
        Assertions.assertNotNull(starWarsDTO.getTerrain());
        Assertions.assertNotNull(starWarsDTO.getSurfaceWater());
        Assertions.assertNotNull(starWarsDTO.getPopulation());
        Assertions.assertNotNull(starWarsDTO.getResidents());
        Assertions.assertNotNull(starWarsDTO.getFilms().toString());
        Assertions.assertNotNull(starWarsDTO.getCreated());
        Assertions.assertNotNull(starWarsDTO.getEdited());
        Assertions.assertNotNull(starWarsDTO.getUrl());
    }

    @Test
    @DisplayName("Is String Blank? Planets")
    public void isStringBlankPlanets(StarWarsPlanetsDTO starWarsDTO) {
        Assertions.assertNotEquals(0, starWarsDTO.getName().length());
        Assertions.assertNotEquals(0, starWarsDTO.getRotationPeriod().length());
        Assertions.assertNotEquals(0, starWarsDTO.getOrbitalPeriod().length());
        Assertions.assertNotEquals(0, starWarsDTO.getDiameter().length());
        Assertions.assertNotEquals(0, starWarsDTO.getClimate().length());
        Assertions.assertNotEquals(0, starWarsDTO.getGravity().length());
        Assertions.assertNotEquals(0, starWarsDTO.getTerrain().length());
        Assertions.assertNotEquals(0, starWarsDTO.getSurfaceWater().length());
        Assertions.assertNotEquals(0, starWarsDTO.getPopulation().length());
        Assertions.assertNotEquals(0, starWarsDTO.getResidents().toString().length());
        Assertions.assertNotEquals(0, starWarsDTO.getFilms().toString().length());
        Assertions.assertNotEquals(0, starWarsDTO.getCreated().length());
        Assertions.assertNotEquals(0, starWarsDTO.getEdited().length());
        Assertions.assertNotEquals(0, starWarsDTO.getUrl().length());
    }

    @Test
    @DisplayName("Is String Null Films")
    public void isStringNullFilms(StarWarsFilmsDTO starWarsDTO) {
        Assertions.assertNotNull(starWarsDTO.getTitle());
//        Assertions.assertNotNull(starWarsDTO.getEpisodeId());
        Assertions.assertNotNull(starWarsDTO.getOpeningCrawl());
        Assertions.assertNotNull(starWarsDTO.getDirector());
        Assertions.assertNotNull(starWarsDTO.getProducer());
        Assertions.assertNotNull(starWarsDTO.getReleaseDate());
        Assertions.assertNotNull(starWarsDTO.getCharacters());
        Assertions.assertNotNull(starWarsDTO.getPlanets());
        Assertions.assertNotNull(starWarsDTO.getStarships());
        Assertions.assertNotNull(starWarsDTO.getVehicles());
        Assertions.assertNotNull(starWarsDTO.getSpecies().toString());
        Assertions.assertNotNull(starWarsDTO.getCreated());
        Assertions.assertNotNull(starWarsDTO.getEdited());
        Assertions.assertNotNull(starWarsDTO.getUrl());
    }
    @Test
    @DisplayName("Is String Blank? Films")
    public void isStringBlankFilms(StarWarsFilmsDTO starWarsDTO) {
        Assertions.assertNotEquals(0, starWarsDTO.getTitle().length());
        Assertions.assertNotEquals(0, starWarsDTO.getEpisodeId());
        Assertions.assertNotEquals(0, starWarsDTO.getOpeningCrawl().length());
        Assertions.assertNotEquals(0, starWarsDTO.getDirector().length());
        Assertions.assertNotEquals(0, starWarsDTO.getProducer().length());
        Assertions.assertNotEquals(0, starWarsDTO.getReleaseDate().length());
        Assertions.assertNotEquals(0, starWarsDTO.getCharacters().toString().length());
        Assertions.assertNotEquals(0, starWarsDTO.getPlanets().toString().length());
        Assertions.assertNotEquals(0, starWarsDTO.getStarships().toString().length());
        Assertions.assertNotEquals(0, starWarsDTO.getVehicles().toString().length());
        Assertions.assertNotEquals(0, starWarsDTO.getSpecies().toString().length());
        Assertions.assertNotEquals(0, starWarsDTO.getCreated().length());
        Assertions.assertNotEquals(0, starWarsDTO.getEdited().length());
        Assertions.assertNotEquals(0, starWarsDTO.getUrl().length());
    }

    @Test
    @DisplayName("Is String Null Starships")
    public void isStringNullStarships(StarWarsStarshipsDTO starWarsDTO) {
        Assertions.assertNotNull(starWarsDTO.getName());
        Assertions.assertNotNull(starWarsDTO.getModel());
        Assertions.assertNotNull(starWarsDTO.getManufacturer());
        Assertions.assertNotNull(starWarsDTO.getCostInCredits());
        Assertions.assertNotNull(starWarsDTO.getLength());
        Assertions.assertNotNull(starWarsDTO.getMaxAtmospheringSpeed());
        Assertions.assertNotNull(starWarsDTO.getCrew());
        Assertions.assertNotNull(starWarsDTO.getPassengers());
        Assertions.assertNotNull(starWarsDTO.getCargoCapacity());
        Assertions.assertNotNull(starWarsDTO.getConsumables());
        Assertions.assertNotNull(starWarsDTO.getHyperdriveRating());
        Assertions.assertNotNull(starWarsDTO.getMGLT());
        Assertions.assertNotNull(starWarsDTO.getStarshipClass());
        Assertions.assertNotNull(starWarsDTO.getPilots());
        Assertions.assertNotNull(starWarsDTO.getFilms());
        Assertions.assertNotNull(starWarsDTO.getCreated());
        Assertions.assertNotNull(starWarsDTO.getEdited());
        Assertions.assertNotNull(starWarsDTO.getUrl());
    }

    @Test
    @DisplayName("Is String Blank? Starships")
    public void isStringBlankStarships(StarWarsStarshipsDTO starWarsDTO) {
        Assertions.assertNotEquals(0, starWarsDTO.getName().length());
        Assertions.assertNotEquals(0, starWarsDTO.getModel().length());
        Assertions.assertNotEquals(0, starWarsDTO.getManufacturer().length());
        Assertions.assertNotEquals(0, starWarsDTO.getCostInCredits().length());
        Assertions.assertNotEquals(0, starWarsDTO.getLength().length());
        Assertions.assertNotEquals(0, starWarsDTO.getMaxAtmospheringSpeed().length());
        Assertions.assertNotEquals(0, starWarsDTO.getCrew().length());
        Assertions.assertNotEquals(0, starWarsDTO.getPassengers().length());
        Assertions.assertNotEquals(0, starWarsDTO.getCargoCapacity().length());
        Assertions.assertNotEquals(0, starWarsDTO.getConsumables().length());
        Assertions.assertNotEquals(0, starWarsDTO.getHyperdriveRating().length());
        Assertions.assertNotEquals(0, starWarsDTO.getMGLT().length());
        Assertions.assertNotEquals(0, starWarsDTO.getStarshipClass().length());
        Assertions.assertNotEquals(0, starWarsDTO.getPilots().toString().length());
        Assertions.assertNotEquals(0, starWarsDTO.getFilms().toString().length());
        Assertions.assertNotEquals(0, starWarsDTO.getCreated().length());
        Assertions.assertNotEquals(0, starWarsDTO.getEdited().length());
        Assertions.assertNotEquals(0, starWarsDTO.getUrl().length());
    }


    @Test
    @DisplayName("Is String Null Vehicles")
    public void isStringNullVehicles(StarWarsVehiclesDTO starWarsDTO) {
        Assertions.assertNotNull(starWarsDTO.getName());
        Assertions.assertNotNull(starWarsDTO.getModel());
        Assertions.assertNotNull(starWarsDTO.getManufacturer());
        Assertions.assertNotNull(starWarsDTO.getCostInCredits());
        Assertions.assertNotNull(starWarsDTO.getLength());
        Assertions.assertNotNull(starWarsDTO.getMaxAtmospheringSpeed());
        Assertions.assertNotNull(starWarsDTO.getCrew());
        Assertions.assertNotNull(starWarsDTO.getPassengers());
        Assertions.assertNotNull(starWarsDTO.getCargoCapacity());
        Assertions.assertNotNull(starWarsDTO.getConsumables());
        Assertions.assertNotNull(starWarsDTO.getVehicleClass());
        Assertions.assertNotNull(starWarsDTO.getPilots());
        Assertions.assertNotNull(starWarsDTO.getFilms());
        Assertions.assertNotNull(starWarsDTO.getCreated());
        Assertions.assertNotNull(starWarsDTO.getEdited());
        Assertions.assertNotNull(starWarsDTO.getUrl());
    }

    @Test
    @DisplayName("Is String Blank? Vehicles")
    public void isStringBlankVehicles(StarWarsVehiclesDTO starWarsDTO) {
        Assertions.assertNotEquals(0, starWarsDTO.getName().length());
        Assertions.assertNotEquals(0, starWarsDTO.getModel().length());
        Assertions.assertNotEquals(0, starWarsDTO.getManufacturer().length());
        Assertions.assertNotEquals(0, starWarsDTO.getCostInCredits().length());
        Assertions.assertNotEquals(0, starWarsDTO.getLength().length());
        Assertions.assertNotEquals(0, starWarsDTO.getMaxAtmospheringSpeed().length());
        Assertions.assertNotEquals(0, starWarsDTO.getCrew().length());
        Assertions.assertNotEquals(0, starWarsDTO.getPassengers().length());
        Assertions.assertNotEquals(0, starWarsDTO.getCargoCapacity().length());
        Assertions.assertNotEquals(0, starWarsDTO.getConsumables().length());
        Assertions.assertNotEquals(0, starWarsDTO.getVehicleClass().length());
        Assertions.assertNotEquals(0, starWarsDTO.getPilots().toString().length());
        Assertions.assertNotEquals(0, starWarsDTO.getFilms().toString().length());
        Assertions.assertNotEquals(0, starWarsDTO.getCreated().length());
        Assertions.assertNotEquals(0, starWarsDTO.getEdited().length());
        Assertions.assertNotEquals(0, starWarsDTO.getUrl().length());
    }

}
