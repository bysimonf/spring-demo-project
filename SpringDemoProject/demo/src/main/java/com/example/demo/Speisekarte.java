package com.example.demo;

import java.util.ArrayList;

public class Speisekarte {

    ArrayList<Speise> speiseListe = new ArrayList();


    public void addSpeise(Speise speise) {

        speiseListe.add(speise);

    }

    ArrayList<Getraenk> getraenkeListe = new ArrayList();

    public void addGetraenk(Getraenk getraenk) {

        getraenkeListe.add(getraenk);

    }

    ArrayList<Dessert> dessertListe = new ArrayList();

    public void addDessert(Dessert dessert) {

        dessertListe.add(dessert);
    }



    public ArrayList<Speise> getSpeiseListe() {
        return speiseListe;
    }

    public void setSpeiseListe(ArrayList<Speise> speiseListe) {
        this.speiseListe = speiseListe;
    }

    public ArrayList<Getraenk> getGetraenkeListe() {
        return getraenkeListe;
    }

    public void setGetraenkeListe(ArrayList<Getraenk> getraenkeListe) {
        this.getraenkeListe = getraenkeListe;
    }

    public ArrayList<Dessert> getDessertListe() {
        return dessertListe;
    }

    public void setDessertListe(ArrayList<Dessert> dessertListe) {
        this.dessertListe = dessertListe;
    }
}


