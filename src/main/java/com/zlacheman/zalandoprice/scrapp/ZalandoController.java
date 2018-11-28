package com.zlacheman.zalandoprice.scrapp;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class ZalandoController {

    public static String searchById(String id){
        String url = "https://www.zalando.fr/catalogue/?q=" + id.toLowerCase();


        return "null";
    }
}
