package com.san;

public class Book {
    private String name;
    private String number;


    public Book (String name, String number){
        this.name = name;
        this.number = number;
    }

    public Book() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
