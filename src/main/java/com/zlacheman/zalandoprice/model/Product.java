package com.zlacheman.zalandoprice.model;

public class Product {
    private String id;
    private String url;
    private float price;
    private String name;

    public Product(String id, String url, float price, String name) {
        this.id = id;
        this.url = url;
        this.price = price;
        this.name = name;
    }

    public Product(){ }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
