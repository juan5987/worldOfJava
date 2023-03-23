package org.example.personnage;
import org.example.objets.Arme;
import org.example.objets.Bouclier;
import org.example.objets.Nourriture;
import org.example.objets.Inventaire;

public interface IPersonnage {

    public String getNom();
    public void setNom(String nom);
    public Integer getPointDeVie();
    public void setPointDeVie(Integer pointDeVie);
    public Arme getArmes();
    public void setArmes(Arme arme);
    public void attaquer(IPersonnage adversaire);
    public Inventaire getInventaire();
    public void ajouterArme(Arme arme);

    public void ajouterBouclier(Bouclier bouclier);

    public void ajouterNourriture(Nourriture nourriture);

    void setBouclier(Bouclier bouclierEquipe);
}
