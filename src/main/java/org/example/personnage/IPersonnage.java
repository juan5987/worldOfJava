package org.example.personnage;
import org.example.objets.Arme;
public interface IPersonnage {

    public String getNom();
    public void setNom(String nom);
    public Integer getPointDeVie();
    public void setPointDeVie(Integer pointDeVie);
    public Arme getArmes();
    public void setArmes(Arme arme);
    public void attaquer(IPersonnage adversaire);

}
