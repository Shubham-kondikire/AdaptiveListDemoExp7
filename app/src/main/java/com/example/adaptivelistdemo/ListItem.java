package com.example.adaptivelistdemo;

public class ListItem {
    private final int imageResId;
    private final String title;
    private final String subtitle;
    private final String price;

    public ListItem(int imageResId, String title, String subtitle, String price) {
        this.imageResId = imageResId;
        this.title = title;
        this.subtitle = subtitle;
        this.price = price;
    }

    public int getImageResId() { return imageResId; }
    public String getTitle() { return title; }
    public String getSubtitle() { return subtitle; }
    public String getPrice() { return price; }
}
