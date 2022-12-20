package com.example.demo;

public class Biergarten {

    String name;
    int bierPreis;
    String bild;


    public Biergarten() {

    }

    public Biergarten(int bierPreis, String name, String bild) {
        this.bierPreis = bierPreis;
        this.name = name;
        this.bild = bild;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getBild() {
        return bild;
    }

    public void setBild(String bild) {
        this.bild = bild;
    }

    public int getBierPreis() {
        return bierPreis;
    }

    public void setBierPreis(int bierPreis) {
        this.bierPreis = bierPreis;
    }
}
