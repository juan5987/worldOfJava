package org.example.factory;
import org.example.objets.Arme;
import org.example.objets.Bouclier;

import java.util.Random;
public class ArmeFactory {
    public static Arme build(){
        boolean isSword = new Random().nextBoolean();
        Arme arme;
        if (isSword){
            int randSword = new Random().nextInt(11);
            if (randSword == 0){
                arme = new Arme("Épée de diamant", 25, 50,600);
            }
            else if (randSword > 0 && randSword < 5){
                arme = new Arme("Épée de fer", 20, 50,800);
            }
            else {
                arme = new Arme("Épée de bois", 15, 50,400);
            }
            System.out.println(arme.getNom() + " (" + arme.getDegat() + " dégats, " + arme.getLongueur() + " cm, " + arme.getPoids() + " gr)" );
        }
        else {
            int randgourdin = new Random().nextInt(11);
            if (randgourdin == 0){
                arme = new Arme("Gourdin electrique", 25, 30,300);
            }
            else if (randgourdin > 0 && randgourdin < 5){
                arme = new Arme("Gourdin à pointes", 20, 30,400);
            }
            else {
                arme = new Arme("Gourdin en bois", 15, 30,200);
            }
            System.out.println(arme.getNom() + " (" + arme.getDegat() + " dégats, " + arme.getLongueur() + " cm, " + arme.getPoids() + " gr)" );
        }
        return arme;
    }
}
