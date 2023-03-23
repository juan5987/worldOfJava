package org.example;

import org.example.personnage.Game;

public class Main {
    public static void main(String[] args) {

        Game partie = new Game(5);
        System.out.println();
        System.out.println("Lancement des combats");
        System.out.println("---------------------");

        boolean condition = true;
        while(condition){
            condition = partie.demarrer();
        }
        partie.teamWinner();
    }
}