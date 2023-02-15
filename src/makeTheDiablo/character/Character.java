package makeTheDiablo.character;

import makeTheDiablo.weapon.WeaponBehavior;

public abstract class Character
{
    protected int hp;
    protected int mp;
    //다른 기술들은 필요시 추가.
    WeaponBehavior weapon; // Association(Aggreagation) 부품처럼 가져다 쓸 수 있다.
    public void info()
    {
        System.out.println("체력 : " +hp+" 지능 : "+mp);
    }

    public void setWeapon(WeaponBehavior weapon) { // 리스코프 치환 원칙!
        this.weapon = weapon;
    }
    public final void performWeapon()
    {
        weapon.useWeapon();
    }
}
