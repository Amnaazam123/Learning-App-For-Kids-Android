package com.example.learning_app;

public class myClass {
    String heading;
    String subheading;
    int imageid;
    public myClass(String heading, String subheading, int imageid) {
        this.heading = heading;
        this.subheading = subheading;
        this.imageid = imageid;
    }

    public String getHeading() {
        return heading;
    }

    public String getSubheading() {
        return subheading;
    }

    public int getImageid() {
        return imageid;
    }

}
