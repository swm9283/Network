package MakeTheDiablo.weapon;

import MakeTheDiablo.weapon.WeaponBehavior;

public class Orb implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("오브를 사용해 파이어볼을 발사한다.");

    }
}
