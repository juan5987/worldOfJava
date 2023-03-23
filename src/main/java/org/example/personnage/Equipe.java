package org.example.personnage;
import org.example.factory.ArmeFactory;
import org.example.factory.BouclierFactory;
import org.example.objets.Arme;
import org.example.objets.Bouclier;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Equipe implements Iterable<IPersonnage> {
    private final List<IPersonnage> tab;
    public Equipe(){
        this.tab = new ArrayList<>();
    }

    // Permet d’ajouter un combattant à une équipe
    public void addFighter(IPersonnage pCombattants ){
        tab.add(pCombattants);
    }

    // Permet d’ajouter une arme à un combattant en parcourant l’équipe
    public void addArmes(){
        for (IPersonnage personnage: tab) {
            int rand = new Random().nextInt(1, 4);
            for(int i = 0; i < rand; i++){
                Arme nouvelleArme = ArmeFactory.build();
                personnage.ajouterArme(nouvelleArme);
            }
        }
    }

    public void addBoucliers(){
        for (IPersonnage personnage: tab) {
            int rand = new Random().nextInt(0, 4);
            for(int i = 0; i < rand; i++){
                Bouclier nouveauBouclier = BouclierFactory.build();
                personnage.ajouterBouclier(nouveauBouclier);
            }
        }
    }

    // Permet de recuperate le 1er combatant de l'équipe , celui a l'index 0
    public IPersonnage chooseFighter(){
        if (tab.size() == 0){
            throw new RuntimeException("L'équipe est vide !");
        }else{
            int rand = new Random().nextInt(tab.size());
            return tab.get(rand);
        }
    }

    public IPersonnage get(int index){
        return tab.get(index);
    }
    public int size(){
        return tab.size();
    }

    @Override
    public Iterator<IPersonnage> iterator() {
        return tab.iterator();
    }

    public boolean isDead(){
        boolean resultat = true;
        Iterator<IPersonnage> iter = iterator();
        while(iter.hasNext()){
            IPersonnage e = iter.next();
            if(e.getPointDeVie() > 0) {
                resultat = false ;
            } else {
                iter.remove();
            }
        }
        return resultat;
    }
}
