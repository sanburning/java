package com.san;

public class Cat {
    private String name;
    private int jump;
    private int run;

    public Cat (String name, int jump, int run){
        this.name = name;
        this.jump = jump;
        this.run = run;
    }
    public void info(){
        System.out.println("Имя: " + name+ " Прыжок: "+ jump +" Бег:"+ run);
    }
    String getName(){return  name;}
    int getJump(){
        return jump;
    }
    int getRun(){
        return run;
    }
}
