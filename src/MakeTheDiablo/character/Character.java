package MakeTheDiablo.character;

import MakeTheDiablo.weapon.WeaponBehavior;

public abstract class Character
{
    protected int hp;
    protected int mp;
    //다른 기술들은 필요시 추가.
    WeaponBehavior weapon; // Association(Aggreagation) 부품처럼 가져다 쓸 수 있다.
    abstract void info();

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
    public final void performWeapon()
    {
        weapon.useWeapon();
    }
}
