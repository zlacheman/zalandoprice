package com.zlacheman.zalandoprice.scrapp;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class ZalandoItem {

    private Document page;
    private String url;

    public ZalandoItem(String url) {
        try {
            this.page = Jsoup.connect(url).get();
            this.url = url;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ZalandoItem() {
    }

    public String getUrl(){
        return url;
    }

    public void setUrl(String url){
        this.url = url;
    }

    public Document getPage() {
        return page;
    }

    public void setPage(Document page) {
        this.page = page;
    }

    public float findPrice(){
        String strPrice = this.page.select("meta[name=twitter:data1]").get(0).attr("content");
        strPrice = strPrice.replace("€","");
        strPrice = strPrice.replace(",",".");
        float price = Float.parseFloat(strPrice);
        return price;
    }

    public String findId(){
        String str = this.page.select("meta[property=al:ios:url]").get(0).attr("content");
        Pattern pattern = Pattern.compile("=(.*?)&");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find())
        {
            str=matcher.group(1);
        }
        return str;
    }

    public String findName() {
        return this.page.title().toUpperCase();
    }

    public void showAll(){
        System.out.println("Price : " + this.findPrice());
        System.out.println("Id : " + this.findId());
        System.out.println("Name : " + this.findName());
        System.out.println("Url : " + this.getUrl());
    }

}
