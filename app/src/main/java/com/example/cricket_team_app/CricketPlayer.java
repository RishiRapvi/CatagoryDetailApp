package com.example.cricket_team_app;

import android.os.Parcel;
import android.os.Parcelable;

public class CricketPlayer implements Parcelable {
    private String name;
    private String position;
    private String desc;
    private int imageResourceID;

    public CricketPlayer(String name, String position, String desc, int imageResourceID) {
        this.name = name;
        this.position = position;
        this.desc = desc;
        this.imageResourceID = imageResourceID;
    }

    public CricketPlayer(Parcel parcel) {
        name = parcel.readString();
        position = parcel.readString();
        desc = parcel.readString();
        imageResourceID = parcel.readInt();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(position);
        dest.writeString(desc);
        dest.writeInt(imageResourceID);
    }

    public CricketPlayer() {
        name = "";
        position = "";
        desc = "";
        imageResourceID = 0;
    }

    public int describeContents() {
        return 0;
    }

    public String toString(){
        String name = " ";
        name += "";
        return this.name;
    }

    public static final CricketPlayer[] CRICKET_PLAYERS = {
            new CricketPlayer("Dwij Bhatt", "Right Arm Spin Bowler", "- Fremd Viking Pride Award Winner\n" +
                    "- Plum Grove Science Fair Project Winner\n" +
                    "- Best Physics Lab Partner\n" +
                    "", R.drawable.person),
            new CricketPlayer("Pranav Aiyar", "Right Arm Pace Bowler", "- Scholastic Bowl Captain\n" +
                    "", R.drawable.person),
            new CricketPlayer("Matthew Port Louis", "Left Armed Batsman/Cricket Club Captain", "- Hustlers University Prospective Student with:\n" +
                    "- 1776 SAT on 1600 scale (because I love 'Merica)\n" +
                    "- 15.0 unweighted GPA\n" +
                    "- 222222.46839 weighted GPA\n" +
                    "- 38 AP Classes (10s on all of the tests and in the process of forming the curriculum for AP Kindergarten Language and Culture with the homie Trevor Packer)\n" +
                    "- 45/45 IB Diploma\n" +
                    "- Founder, CEO, and the entire Board of Directors of an F500 Company\n" +
                    "- Part-Time NASA astronaut and scientist\n" +
                    "- Handpicked successor to Sebastian Vettel\n" +
                    "- Real name is Saheeb Surinder. ", R.drawable.person),
            new CricketPlayer("Mr. Dvorak", "Cricket Coach", "- Best US History teacher at Fremd.\n" +
                    "", R.drawable.person),

    };

    public static final Parcelable.Creator<CricketPlayer> CREATOR = new Parcelable.Creator<CricketPlayer>() {

                @Override
                public CricketPlayer createFromParcel(Parcel parcel) {
                    return new CricketPlayer(parcel);
                }

                @Override
                public CricketPlayer[] newArray(int size) {
                    return new CricketPlayer[0];
                }
    };


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

