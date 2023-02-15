package MakeTheDiablo.weapon;

import MakeTheDiablo.weapon.WeaponBehavior;

public class Bow implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("활을 사용해 폭풍의 활 시전");
    }
}
