package com.beanfactory.yashp.realtimerecyclercards;

public class Product {

    private String title, desc;
    private int rating;

    public Product(String title, String desc, int rating) {
        this.title = title;
        this.desc = desc;
        this.rating = rating;
    }

    public Product(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {

        return rating;
    }

    public Product() {
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
