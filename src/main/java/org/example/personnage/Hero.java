package org.example.personnage;
import org.example.objets.Arme;
import org.example.objets.Bouclier;
import org.example.objets.Nourriture;
import org.example.objets.Objets;
import org.example.objets.Inventaire;

import java.util.ArrayList;

public class Hero extends Personnage {

    private Arme arme;
    private Bouclier bouclier;
    private Inventaire inventaire;

    public Hero(String nom, Integer pointDeVie){
        super(nom, pointDeVie);
        this.inventaire = new Inventaire();
    }

    public String toString(){
        return super.toString();
    }

    public Arme getArmes() {
        return arme;
    }

    public void setArmes(Arme arme) {
        this.arme = arme;
    }

    public Inventaire getInventaire() {
        return inventaire;
    }

    public void ajouterArme(Arme arme) {
        this.inventaire.ajouterArme(arme);
    }

    public void ajouterBouclier(Bouclier bouclier) {
        this.inventaire.ajouterBouclier(bouclier);
    }

    public void ajouterNourriture(Nourriture nourriture) {
        this.inventaire.ajouterNourriture(nourriture);
    }

    @Override
    public void setBouclier(Bouclier bouclier) {
        this.bouclier = bouclier;
    }
}
