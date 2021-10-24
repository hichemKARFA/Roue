package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Player> liste = new ArrayList<>();
        for (int index = 0; index < args.length; index ++) {
            liste.add(new Player(args[index].toString()));
        }
        Roue roue = new Roue();
        roue.playRoue(liste);
    }
}
