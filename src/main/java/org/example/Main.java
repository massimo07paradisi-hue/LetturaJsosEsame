package org.example;

public class Main {
    public static void main(String[] args) {

        Lettore l = new Lettore("pallacanestro.json");
        l.start(); // avvia il thread
    }
}