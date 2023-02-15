package makeTheDiablo;
//import makeTheDiablo.*;
// 협업을 하는 상황에서는 *를 잘 사용하지 않는다.
import makeTheDiablo.character.Barbarian;
import makeTheDiablo.character.Sorceress;
import makeTheDiablo.weapon.Axe;
import makeTheDiablo.weapon.Bow;

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
        b1.setWeapon(()-> System.out.println("신오브로 아이스볼을 발사!"));
        b1.performWeapon();
    }
}
