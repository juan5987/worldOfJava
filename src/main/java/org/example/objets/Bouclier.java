package org.example.objets;
public class Bouclier implements Objets {
    private String nom;
    private int pointsEncaissement;
    private Integer poids;

    public Bouclier(String nom, int pointsEncaissement, Integer poids) {
        this.nom = nom;
        this.pointsEncaissement = pointsEncaissement;
        this.poids = poids;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPointsEncaissement() {
        return pointsEncaissement;
    }

    public void setPointsEncaissement(int pointsEncaissement) {
        this.pointsEncaissement = pointsEncaissement;
    }

    public Integer getPoids() {
        return poids;
    }

    public void setPoids(Integer poids) {
        this.poids = poids;
    }
}
