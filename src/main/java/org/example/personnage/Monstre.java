package org.example.personnage;
import org.example.objets.Arme;
public class Monstre extends Personnage {
    private Arme arme;

    public Monstre(String nom, Integer pointDeVie) {
        super(nom,pointDeVie);
    }

    public Arme getArmes() {
        return arme;
    }

    public void setArmes(Arme arme) {
        this.arme = arme;
    }

}
