package com.san;

public class Wall {
    private String name;
    private int height;

    public Wall (String name, int height){
        this.name = name;
        this.height= height;
    }
    public void info(){
        System.out.println("Высота стены: " + height);
    }

    int getHeight(){
        return height;
    }
}
