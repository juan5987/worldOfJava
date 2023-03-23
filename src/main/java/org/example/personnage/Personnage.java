package org.example.personnage;
public abstract class Personnage implements IPersonnage {

    private String nom;
    private Integer pointDeVie;

    public Personnage(String nom, Integer pointDeVie){
        this.nom = nom;
        this.pointDeVie = pointDeVie;
    }
    public String toString(){
        return "nom: "+this.nom+", point de vie: "+this.pointDeVie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getPointDeVie() {
        return pointDeVie;
    }

    public void setPointDeVie(Integer pointDeVie) {
        this.pointDeVie = pointDeVie;
    }

    @Override
    public void attaquer(IPersonnage adversaire) {
        adversaire.setPointDeVie(adversaire.getPointDeVie() - (this.getArmes().getDegat()));
    }

}
