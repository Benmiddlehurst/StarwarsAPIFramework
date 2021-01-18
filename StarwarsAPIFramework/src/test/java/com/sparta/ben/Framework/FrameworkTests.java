package com.sparta.ben.Framework;

import com.sparta.ben.DTO.*;
import com.sparta.ben.Framework.DataTypeTests.StringTests;
import org.junit.jupiter.api.*;

public class FrameworkTests {
    static StarWarsPeopleDTO requestedDTO;
    static String testURL;
    StringTests stringTests = new StringTests();
    static String endpoint;
    static int code;


    @BeforeAll
    static void setUp() {
        endpoint = "people";
        code = 1;
        testURL = Injector.connect(endpoint, code);
        requestedDTO = (StarWarsPeopleDTO) Injector.injectDTO(endpoint, code);
    }

    @Test
    @DisplayName("Test Status Code is 200")
    void testStatusCodeIs200() {
        Assertions.assertEquals(200, Injector.getStatusCode(endpoint, code));
        System.out.println("Status Code: "+ Injector.getStatusCode(endpoint, code));
    }


    @Test
    @DisplayName("String Tester")
    void stringTesters() {
        System.out.println("Testing for Null and Blank Strings");
        stringTests.stringTesters(endpoint, requestedDTO);

    }

     @Test
     @DisplayName("Does URL match getURL")
     void doesUrlMatchGetUrl() {
         System.out.println(testURL);
         System.out.println(requestedDTO.getUrl());
         Assertions.assertEquals(testURL, requestedDTO.getUrl());
     }

    @Test
    @DisplayName("Test People Name")
    void testPeopleName() {
        Assertions.assertEquals("Luke Skywalker", requestedDTO.getName());
        System.out.println(requestedDTO.getName());
    }


     @Test
     @DisplayName("Test Starship Names")
     void testStarshipNames() {
         System.out.println(requestedDTO.getStarships());
         System.out.println(requestedDTO.getStarshipNames());
         Assertions.assertEquals("[X-wing, Imperial shuttle]", requestedDTO.getStarshipNames().toString());
     }

    @Test
    @DisplayName("Test Film Names")
    void testFilmNames() {
        System.out.println(requestedDTO.getFilms());
        System.out.println(requestedDTO.getFilmNames());
        Assertions.assertEquals("[A New Hope, The Empire Strikes Back, Return of the Jedi, Revenge of the Sith]", requestedDTO.getFilmNames().toString());
    }

}
