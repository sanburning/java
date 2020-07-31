package com.san;

public class Treadmill {
    private String name;
    private int distance;

    public Treadmill (String name, int distance){
        this.name = name;
        this.distance= distance;
    }
    public void info(){
        System.out.println("Дистанция беговой дорожки: " + distance);
    }

    int getDistance(){
        return distance;
    }
}
