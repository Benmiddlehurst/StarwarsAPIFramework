package com.sparta.ben.Framework;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConnectionManager {
    private static final String BASEURL = "http://swapi.dev/api";
    private static String endPoint;
    private static int code;
    private String URL;


    public static String connect(String endPointName) {
        endPoint = endPointName;
        return BASEURL + "/" + endPointName + "/1";
    }

    public String getURL() {
        return connect(endPoint);
    }
}
