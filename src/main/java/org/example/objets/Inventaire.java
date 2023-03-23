package org.example.objets;
import java.util.List;
import java.util.ArrayList;
public class Inventaire {
    private List<Arme> armes;
    private List<Bouclier> boucliers;
    private List<Nourriture> nourriture;

    public Inventaire() {
        this.armes = new ArrayList<>();
        this.boucliers = new ArrayList<>();
        this.nourriture = new ArrayList<>();
    }

    public List<Arme> getArmes() {
        return armes;
    }

    public List<Bouclier> getBoucliers() {
        return boucliers;
    }

    public List<Nourriture> getNourriture() {
        return nourriture;
    }

    public void ajouterArme(Arme arme) {
        this.armes.add(arme);
    }

    public void ajouterBouclier(Bouclier bouclier) {
        this.boucliers.add(bouclier);
    }

    public void ajouterNourriture(Nourriture nourriture) {
        this.nourriture.add(nourriture);
    }


}
