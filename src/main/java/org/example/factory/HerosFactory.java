package org.example.factory;
import org.example.personnage.Hero;
import java.util.Random;

public class HerosFactory {
    public static Hero build(){
        String nom = heroNom[new Random().nextInt(heroNom.length)];
        Integer pdv = new Random().nextInt(50,101);
        Hero nouveauHero = new Hero(nom,pdv);
        System.out.println(nouveauHero.getNom() + " (" + nouveauHero.getPointDeVie() + " PV" +")");
        return nouveauHero;
    }

    public static String[] heroNom = new String[] {
            "Olivia","Delphine","Duong","Hélène","Mischa","Clément","Nseya","Achref",
            "Titouan","Antoine","Mélanie","Dorian","Lilas","Souleyman","François","Pierre",
            "Juan"
    };
}
