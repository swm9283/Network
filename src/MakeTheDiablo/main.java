package MakeTheDiablo;

import MakeTheDiablo.character.Barbarian;
import MakeTheDiablo.character.Sorceress;
import MakeTheDiablo.weapon.Axe;
import MakeTheDiablo.weapon.Bow;

public class main {
    public static void main(String[] args) {
        Barbarian b1 = new Barbarian();
        Sorceress s1 = new Sorceress();
        Bow windForce = new Bow();
        Axe berserkerAxe = new Axe();
        b1.setWeapon(berserkerAxe);
        s1.setWeapon(windForce); // get weapon
        b1.performWeapon();
        s1.performWeapon();
        s1.setWeapon(new Axe());
        s1.performWeapon();
        s1.info();

    }
}
