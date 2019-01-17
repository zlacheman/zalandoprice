package com.zlacheman.zalandoprice.scrapp;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class ScrappManager {
    public static int TIMEOUT = 1000;

    public static Document accessWebGoogleBot(String url){
        System.out.println("Trying to connect to url : " + url);
        try {
            return Jsoup.connect(url)
                        .userAgent("Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)")
                        .timeout(TIMEOUT)
                        .get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Document accessWebBot(String url){
        System.out.println("Trying to connect to url : " + url);
        try {
            return Jsoup.connect(url)
                        .userAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:25.0) Gecko/20100101 Firefox/25.0")
                        .referrer("http://www.google.com")
                        .timeout(TIMEOUT)
                        .get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Document accessWeb(String url){
        System.out.println("Trying to connect to url : " + url);
        try {
            return Jsoup.connect(url).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
