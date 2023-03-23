package org.example.actions;
import org.example.personnage.IPersonnage;
import java.util.Random;
public class Combat {
    private static Random random = new Random();
    public static void combat(IPersonnage hero, IPersonnage monster) {
        while(hero.getPointDeVie() > 0 && monster.getPointDeVie() > 0) {
            boolean isHeroTurn = random.nextBoolean();
            if (isHeroTurn ) {
                attaque(hero,monster);
            } else {
                attaque(monster,hero);
            }
            gagnant(hero, monster);
        }
    }

    private static void gagnant(IPersonnage hero, IPersonnage monster) {
        if (monster.getPointDeVie() <= 0) {
            System.out.println(monster.getNom() + " est vaincu, " + hero.getNom() + " remporte la victoire");
            System.out.println();
        }
        else if (hero.getPointDeVie() <= 0){
            System.out.println(hero.getNom() + " est vaincu, " + monster.getNom() + " remporte la victoire");
            System.out.println();
        }
    }

    private static void attaque(IPersonnage combattants1, IPersonnage combattants2){
        combattants1.attaquer(combattants2);
        System.out.println(combattants1.getNom() + " inflige " + combattants1.getArmes().getDegat() + " a " + combattants2.getNom());
        System.out.println("Il reste " + (combattants2.getPointDeVie() <= 0 ? 0 : combattants2.getPointDeVie()) + " point de vie a "+ combattants2.getNom());
        System.out.println("Il reste " + (combattants1.getPointDeVie() <= 0 ? 0 : combattants1.getPointDeVie()) + " point de vie a "+ combattants1.getNom());
        System.out.println();
    }
}
