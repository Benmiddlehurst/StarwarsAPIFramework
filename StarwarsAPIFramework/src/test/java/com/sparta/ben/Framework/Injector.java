package com.sparta.ben.Framework;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.ben.DTO.*;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Injector {
    private static final String BASEURL = "https://swapi.dev/api";
    private static StarWarsDTO starWarsDTO;


    public static String connect(String endPointName, int code) {
        String fullURL = BASEURL + "/" + endPointName + "/" + code + "/";
        return fullURL;
    }

    public static StarWarsDTO injectDTO(String dto, int code) {
        String url = connect(dto, code);
        starWarsDTO = DTOFactory.starWarsDTO(dto);
        ObjectMapper objectMapper = new ObjectMapper();
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(url)).build();
        try {
            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            starWarsDTO = objectMapper.readValue(httpResponse.body(), starWarsDTO.getClass());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Connected to: "+ url);
        return starWarsDTO;
    }

    public static StarWarsDTO injectDTOURL(String url, String dto) {
        starWarsDTO = DTOFactory.starWarsDTO(dto);
        ObjectMapper objectMapper = new ObjectMapper();
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(url)).build();
        try {
            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            starWarsDTO = objectMapper.readValue(httpResponse.body(), starWarsDTO.getClass());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return starWarsDTO;
    }

    public static int getStatusCode(String endpoint, int code){
        injectDTO(endpoint, code);
        String url = connect(endpoint, code);
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(url))
                .method("GET", HttpRequest.BodyPublishers.noBody()).build();
        int statusCode;
        HttpResponse<String> httpResponse = null;
        try {
            httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        statusCode = httpResponse.statusCode();
        return statusCode;
    }


}