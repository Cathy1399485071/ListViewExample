package com.example.listviewexample;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Player {
    String name;
    int age;
    double worth;
    String main_sport;
    String url;
    int pictureAddress;
    //Todo finish the class player
        // Todo 5 member variables
        //Todo name, age, worth(money), main sport and int image resource from drawable

    public int getPictureAddress() {
        return pictureAddress;
    }

    public void setPictureAddress(int pictureAddress) {
        this.pictureAddress = pictureAddress;
    }

    public Player(String name, int age, double worth, String main_sport, String url, int address) {
        this.name = name;
        this.age = age;
        this.worth = worth;
        this.main_sport=main_sport;
        this.url= url;
        this.pictureAddress=address;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWorth(double worth) {
        this.worth = worth;
    }

    public void setMain_sport(String main_sport) {
        this.main_sport = main_sport;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWorth() {

        return worth;
    }

    public String getMain_sport() {
        return main_sport;
    }

    public String getUrl(){
        return url;
    }
}
