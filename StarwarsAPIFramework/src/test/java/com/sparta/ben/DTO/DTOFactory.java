package com.sparta.ben.DTO;

public class DTOFactory {

    public static StarWarsDTO starWarsDTO(String dto){
        switch(dto){
            case "people":
                return new StarWarsPeopleDTO();
            case "films":
                return new StarWarsFilmsDTO();
            case "planets":
                return new StarWarsPlanetsDTO();
            case "starships":
                return new StarWarsStarshipsDTO();
            case "vehicles":
                return new StarWarsVehiclesDTO();
        }
        return null;
    }
}
