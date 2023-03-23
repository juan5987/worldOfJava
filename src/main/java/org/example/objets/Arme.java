package org.example.objets;
public class Arme implements Objets {

    private String nom;
    private Integer degat;
    private Integer longueur;
    private Integer poids;

    public Arme(String nom, Integer degat, Integer longueur, Integer poids) {
        this.nom = nom;
        this.degat = degat;
        this.longueur = longueur;
        this.poids = poids;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public Integer getDegat() {
        return degat;
    }
    public void setDegat(Integer degat) {
        this.degat = degat;
    }
    public Integer getLongueur() {
        return longueur;
    }
    public void setLongueur(Integer longueur) {
        this.longueur = longueur;
    }
    public Integer getPoids() {
        return poids;
    }
    public void setPoids(Integer poids) {
        this.poids = poids;
    }
}