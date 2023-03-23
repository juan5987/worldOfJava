package org.example.factory;
import org.example.personnage.Monstre;
import java.util.Random;

public class MonstresFactory {
    public static Monstre build(){
        String nom = monstrePrenom[new Random().nextInt(monstrePrenom.length)]
                +monstreNom[new Random().nextInt(monstreNom.length)];
        Integer pdv = new Random().nextInt(50,101);
        Monstre nouveauMonstre = new Monstre(nom,pdv);
        System.out.println(nouveauMonstre.getNom() + " (" + nouveauMonstre.getPointDeVie() + " PV" +")");
        return nouveauMonstre;
    }

    public static String[] monstrePrenom = new String[] {
            "Gobelin ","Orc ","Troll ","Elfe ","Dragon ","Licorne ","Gorgone ","Minotaure ",
            "Harpie ","Kraken ","Méduse ","Chimère ","Centaure ","Vampires ","Loup-garou ",
            "Golem ","Banshee ","Naga ","Ange déchu ","Cyclope ","Sphinx ", "Wyvern ",
            "Nécromancien ","Elfe noir ","Succube ","Démon ","Serpent de mer ", "Yéti ",
    };
    public static String[] monstreNom = new String[] {
            "Effrayant","Menaçant","Sinistre","Terrifiant","Mortel","Féroce", "Meurtrier",
            "Sanguinaire","Hurlant","Géant","Hideux","Repoussant","Monstrueux", "Nauséabond",
            "Maléfique","Démoniaque","Surnaturel", "Invulnérable","Épouvantable", "Mystérieux",
            "Immortel","Invincible","Ancien", "Primitif","Surnaturel","Magique", "Puissant"
    };
}
