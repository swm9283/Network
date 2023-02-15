package makeTheDiablo.weapon;

public class Axe implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("도끼를 사용해 대지 가르기 시전");
    }
}
