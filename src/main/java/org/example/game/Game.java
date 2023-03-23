package org.example.personnage;
import org.example.actions.Combat;
import org.example.factory.MonstresFactory;
import org.example.factory.HerosFactory;
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
        System.out.println("Création des héros");
        System.out.println("------------------");

        for(int i =0; i < nbJoueurs; i++ ){
            heros.addFighter(HerosFactory.build());
        }

        System.out.println();
        System.out.println("Création des Monstres");
        System.out.println("---------------------");

        for(int i =0; i < nbJoueurs; i++ ){
            monstres.addFighter(MonstresFactory.build());
        }
        System.out.println();
        System.out.println("Création des armes");
        System.out.println("------------------");
        heros.addArmes();
        monstres.addArmes();
    }

    public boolean demarrer() {
        boolean etat;
        boolean tourJeux = new Random().nextBoolean();
        //System.out.println(heros.size()+" "+monstres.size());
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