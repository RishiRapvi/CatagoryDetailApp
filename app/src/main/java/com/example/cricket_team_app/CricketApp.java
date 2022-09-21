package com.example.cricket_team_app;

public class CricketApp {
    private String name;
    private String position;
    private String desc;
    private int imageResourceID;

    public CricketApp(String name, String position, String desc, int imageResourceID) {
        this.name = name;
        this.position = position;
        this.desc = desc;
        this.imageResourceID = imageResourceID;
    }

    public String toString(){
        String name = " ";
        name += "";
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public void setImageResourceID(int imageResourceID) {
        this.imageResourceID = imageResourceID;
    }



}

