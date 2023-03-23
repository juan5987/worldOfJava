package org.example.objets;

public class Nourriture implements Objets {
    private String nom;
    private Integer pointsRecuperationEndurance;
    private Integer poids;

    public Nourriture(String nom, Integer pointsRecuperationEndurance, Integer poids) {
        this.nom = nom;
        this.pointsRecuperationEndurance = pointsRecuperationEndurance;
        this.poids = poids;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getPointsRecuperationEndurance() {
        return pointsRecuperationEndurance;
    }

    public void setPointsRecuperationEndurance(Integer pointsRecuperationEndurance) {
        this.pointsRecuperationEndurance = pointsRecuperationEndurance;
    }

    @Override
    public Integer getPoids() {
        return poids;
    }

    @Override
    public void setPoids(Integer poids) {
        this.poids = poids;
    }
}
