package org.example.personnage;
import org.example.objets.Arme;

public class Hero extends Personnage {

    private Arme arme;

    public Hero(String nom, Integer pointDeVie){
        super(nom, pointDeVie);
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

}
