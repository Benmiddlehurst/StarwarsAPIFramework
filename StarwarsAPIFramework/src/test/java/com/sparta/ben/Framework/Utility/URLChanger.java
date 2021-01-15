package com.sparta.ben.Framework.Utility;

public class URLChanger {
    public static String URLChanger(String url){
        url = url.replaceAll("http://", "https://");
        return url;
    }
}
