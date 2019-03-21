package com.andersen.maks;

public class TestBean {

    private String name;

    public  TestBean (String name){
        this.name = name;
    }

    public void printText(){
        System.out.println("Hello i'm your first Spring programm");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
