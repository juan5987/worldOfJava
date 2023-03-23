package org.example.personnage;
import org.example.objets.Arme;
import org.example.objets.Bouclier;
import org.example.objets.Inventaire;
import org.example.objets.Nourriture;

public class Monstre extends Personnage {
    private Arme arme;
    private Bouclier bouclier;

    private Inventaire inventaire;

    public Monstre(String nom, Integer pointDeVie) {

        super(nom,pointDeVie);
        this.inventaire = new Inventaire();
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
