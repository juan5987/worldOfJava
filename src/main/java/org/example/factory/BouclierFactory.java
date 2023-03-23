package org.example.factory;
import org.example.objets.Bouclier;
import java.util.Random;
public class BouclierFactory {
    public static Bouclier build(){
        int rand = new Random().nextInt(11);
        Bouclier bouclier;

        if (rand == 0){
            bouclier = new Bouclier("Bouclier de diamant", 12, 600);
        }
        else if (rand > 0 && rand < 5){
            bouclier = new Bouclier("Bouclier de fer", 8, 800);
        }
        else {
            bouclier = new Bouclier("Bouclier de bois", 5, 400);
        }
        System.out.println(bouclier.getNom() + " (" + bouclier.getPointsEncaissement() + " points d'encaissement, " + bouclier.getPoids() + " gr)" );
        return bouclier;
    }
}
