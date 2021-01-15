package com.sparta.ben.DTO;

import com.sparta.ben.Framework.Injector;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarWarsDTO {

    public void starWarsDTO(){}

    private List<String> listOfNames;

    public List<String> getListOfNames() {
        return listOfNames;
    }

    public StarWarsDTO setListOfNames(String url) {
        String element = "";
        String mydata = "some string with 'the data i want' inside";
        Pattern pattern = Pattern.compile("/(.*?)/");
        Matcher matcher = pattern.matcher(element);

        if (element.equals("people")) {
            StarWarsPeopleDTO dto;
            dto = (StarWarsPeopleDTO) Injector.injectDTOURL(url, element);
            return dto;
        } else if (element.equals("films")) {
            StarWarsFilmsDTO dto;
            dto = (StarWarsFilmsDTO) Injector.injectDTOURL(url, element);
            return dto;
        } else if (element.equals("planets")) {
            StarWarsPlanetsDTO dto;
            dto = (StarWarsPlanetsDTO) Injector.injectDTOURL(url, element);
            return dto;
        } else if (element.equals("starships")) {
            StarWarsStarshipsDTO dto;
            dto = (StarWarsStarshipsDTO) Injector.injectDTOURL(url, element);
            return dto;
        } else if (element.equals("vehicles")) {
            StarWarsVehiclesDTO dto;
            dto = (StarWarsVehiclesDTO) Injector.injectDTOURL(url, element);
            return dto;
        }
        return null;
    }

}
