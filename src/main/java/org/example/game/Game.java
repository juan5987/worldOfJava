package org.example.personnage;
import org.example.actions.Combat;
import org.example.factory.ArmeFactory;
import org.example.factory.MonstresFactory;
import org.example.factory.HerosFactory;
import org.example.objets.Arme;
import org.example.objets.Bouclier;

import java.util.Random;

public class Game {
    Equipe heros = new Equipe();
    Equipe monstres = new Equipe();

    public Game(int nbJoueursDansChaqueEquipe){
        initialisation(nbJoueursDansChaqueEquipe);
    }

    public void initialisation(int nbJoueurs) {
        System.out.println("Initialisation de la partie");
        System.out.println("---------------------------");
        System.out.println("Joueurs dans chaque équipe : " + nbJoueurs);
        System.out.println();
        creerHeros(nbJoueurs);
        creerMonstres(nbJoueurs);
        creerArmes();
        creerBoucliers();
        rangerArmes();
        rangerBoucliers();
        equiperArmes();
        equiperBouclier();
    }
    private void creerArmes() {
        System.out.println("Création des armes");
        System.out.println("------------------");
        heros.addArmes();
        monstres.addArmes();
        System.out.println();
    }

    private void rangerArmes() {
        System.out.println("Gestion des inventaires");
        System.out.println("-----------------------");
        System.out.println("Armes:");
        for (IPersonnage hero: heros) {
            for (Arme arme: hero.getInventaire().getArmes()){
                System.out.println(hero.getNom() + " range " + arme.getNom() + " dans son inventaire");
            }
        }
        for (IPersonnage monstre: monstres) {
            for (Arme arme: monstre.getInventaire().getArmes()){
                System.out.println(monstre.getNom() + " range " + arme.getNom() + " dans son inventaire");
            }
        }
        System.out.println();
    }

    private void creerBoucliers() {
        System.out.println("Création des boucliers");
        System.out.println("------------------");
        heros.addBoucliers();
        monstres.addBoucliers();
        System.out.println();
    }

    private void rangerBoucliers() {
        System.out.println("Boucliers:");
        for (IPersonnage hero: heros) {
            for (Bouclier bouclier: hero.getInventaire().getBoucliers()){
                System.out.println(hero.getNom() + " range " + bouclier.getNom() + " dans son inventaire");
            }
        }
        for (IPersonnage monstre: monstres) {
            for (Bouclier bouclier: monstre.getInventaire().getBoucliers()){
                System.out.println(monstre.getNom() + " range " + bouclier.getNom() + " dans son inventaire");
            }
        }
        System.out.println();
    }

    private void equiperArmes(){
        System.out.println("Équipement des personnages");
        System.out.println("--------------------------");
        System.out.println("armes:");
        for (IPersonnage hero: heros) {
            int random = new Random().nextInt(hero.getInventaire().getArmes().size());
            Arme armeEquipee = hero.getInventaire().getArmes().get(random);
            hero.setArmes(armeEquipee);
            System.out.println(hero.getNom() + " s'équipe de l'arme : " + armeEquipee.getNom());
        }
        for (IPersonnage monstre: monstres) {
            int random = new Random().nextInt(monstre.getInventaire().getArmes().size());
            Arme armeEquipee = monstre.getInventaire().getArmes().get(random);
            monstre.setArmes(armeEquipee);
            System.out.println(monstre.getNom() + " s'équipe de l'arme : " + armeEquipee.getNom());
        }
    }

    private void equiperBouclier(){
        System.out.println();
        System.out.println("Boucliers:");
        for (IPersonnage hero: heros) {
            if(hero.getInventaire().getBoucliers().size() > 0){
                int random = new Random().nextInt(hero.getInventaire().getBoucliers().size());
                Bouclier bouclierEquipe = hero.getInventaire().getBoucliers().get(random);
                hero.setBouclier(bouclierEquipe);
                System.out.println(hero.getNom() + " s'équipe du bouclier : " + bouclierEquipe.getNom());
            }

        }
        for (IPersonnage monstre: monstres) {
            if(monstre.getInventaire().getBoucliers().size() > 0){
                int random = new Random().nextInt(monstre.getInventaire().getBoucliers().size());
                Bouclier bouclierEquipe = monstre.getInventaire().getBoucliers().get(random);
                monstre.setBouclier(bouclierEquipe);
                System.out.println(monstre.getNom() + " s'équipe du bouclier : " + bouclierEquipe.getNom());
            }
        }
    }

    private void creerMonstres(int nbJoueurs) {
        System.out.println("Création des Monstres");
        System.out.println("---------------------");

        for(int i = 0; i < nbJoueurs; i++ ){
            monstres.addFighter(MonstresFactory.build());
        }
        System.out.println();
    }

    private void creerHeros(int nbJoueurs) {
        System.out.println("Création des héros");
        System.out.println("------------------");

        for(int i = 0; i < nbJoueurs; i++ ){
            heros.addFighter(HerosFactory.build());
        }

        System.out.println();
    }

    public boolean demarrer() {
        boolean etat;
        boolean tourJeux = new Random().nextBoolean();

        try{
            if (tourJeux){
                Combat.combat(heros.chooseFighter(), monstres.chooseFighter());
                etat = heros.isDead();
                return !etat;
            }else {
                Combat.combat(monstres.chooseFighter(), heros.chooseFighter());
                etat = monstres.isDead();
                return !etat;
            }
        } catch (Exception e) {
            return true;
        }
    }

    public void teamWinner(){
        if (heros.size() == 0){
            System.out.println("Les monstres ont gagné !");
        }else if (monstres.size() == 0) {
            System.out.println("Les héros ont gagné !");
        }else{
            System.out.println("Égalité");
        }
    }
}