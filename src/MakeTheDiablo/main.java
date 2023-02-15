package MakeTheDiablo;

import MakeTheDiablo.character.Sorceress;
import MakeTheDiablo.weapon.Bow;

public class main {
    public static void main(String[] args) {
        Sorceress s1 = new Sorceress();
        Bow windForce = new Bow();
        s1.setWeapon(windForce);
        s1.performWeapon();

    }
}
