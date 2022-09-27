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
            new CricketPlayer("Dwij Bhatt", "Right Arm Spin Bowler", "" +
                    "\tFremd Viking Monarch Award Winner " +
                    "", R.drawable.dwij),
            new CricketPlayer("Pranav Aiyar", "Right Arm Pace Bowler", "\t\tScholastic Bowl Captain " +
                    "", R.drawable.pranav),
            new CricketPlayer("Matthew Port Louis", "Left Armed Batsman/Cricket Club Captain",
                    "\t\tHandpicked successor to Sebastian Vettel " , R.drawable.mpl),
            new CricketPlayer("Rishi Singhvi", "Right Armed Batsman/Keeper",
                    "\t\tJuice WRLD Enthusiast " , R.drawable.rishi),
            new CricketPlayer("Sai Mihir Kovour", "Right Armed Batsman",
                    "\t\tJustin Fields Enthusiast " , R.drawable.sai),
            new CricketPlayer("Praneet Popuri", "Right Armed Spinner",
                    "\t\tBest Bowler To Get It Poppin'" , R.drawable.praneet),
            new CricketPlayer("Aashman Sharma", "Right Armed Batsman",
                    "\t\tBest Code Sensei" , R.drawable.aashmanjpg),
            new CricketPlayer("Richard Poruthoor", "Left Armed Batsman",
                    "\t\tVarsity Water Polo Player" , R.drawable.richard),
            new CricketPlayer("Devin Patel", "Right Armed Batsman",
                    "\t\tVarsity Golfer" , R.drawable.devin),
            new CricketPlayer("Kuldeep Debnath", "Right Armed Pacer",
                    "\t\tI AM BETTER THAN AASHMAN" , R.drawable.kuldeep),

    };

    public static final CricketPlayer[] CRICKET_COACHES = {
            new CricketPlayer("Mr. Dvorak", "Cricket Coach", "- Best US History teacher at Fremd.\n" +
                    "", R.drawable.person),

    };

    public static final CricketPlayer[] ORDER_LINEUP = {
            new CricketPlayer("Pranav Aiyar", "Right Arm Pace Bowler", "\t\tScholastic Bowl Captain " +
                    "", R.drawable.pranav),
            new CricketPlayer("Dwij Bhatt", "Right Arm Spin Bowler", "" +
                    "\tFremd Viking Monarch Award Winner " +
                    "", R.drawable.dwij),
            new CricketPlayer("Matthew Port Louis", "Left Armed Batsman/Cricket Club Captain",
                    "\t\tHandpicked successor to Sebastian Vettel " , R.drawable.mpl),
            new CricketPlayer("Rishi Singhvi", "Right Armed Batsman/Keeper",
                    "\t\tJuice WRLD Enthusiast " , R.drawable.rishi),
            new CricketPlayer("Sai Mihir Kovour", "Right Armed Batsman",
                    "\t\tJustin Fields Enthusiast " , R.drawable.sai),
            new CricketPlayer("Praneet Popuri", "Right Armed Spinner",
                    "\t\tBest Bowler To Get It Poppin'" , R.drawable.praneet),
            new CricketPlayer("Aashman Sharma", "Right Armed Batsman",
                    "\t\tBest Code Sensei" , R.drawable.aashmanjpg),
            new CricketPlayer("Richard Poruthoor", "Left Armed Batsman",
                    "\t\tVarsity Water Polo Player" , R.drawable.richard),
            new CricketPlayer("Devin Patel", "Right Armed Batsman",
                    "\t\tVarsity Golfer" , R.drawable.devin),
            new CricketPlayer("Kuldeep Debnath", "Right Armed Pacer",
                    "\t\tI AM BETTER THAN AASHMAN" , R.drawable.kuldeep),

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

