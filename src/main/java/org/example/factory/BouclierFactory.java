package org.example.factory;
import org.example.objets.Bouclier;
import java.util.Random;
public class BouclierFactory {
    public static Bouclier build(){
        int rand = new Random().nextInt(11);
        Bouclier bouclier;

        if (rand == 0){
            bouclier = new Bouclier("Bouclier de diamant", 20, 600);
        }
        else if (rand > 0 && rand < 5){
            bouclier = new Bouclier("Bouclier de fer", 15, 800);
        }
        else {
            bouclier = new Bouclier("Bouclier de bois", 10, 400);
        }
        return bouclier;
    }
}
