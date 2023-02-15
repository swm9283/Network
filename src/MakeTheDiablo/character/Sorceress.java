package MakeTheDiablo.character;

public class Sorceress extends Character{
    public Sorceress() {
        hp = 300;
        mp = 550;
    }

    @Override
    public void info() {
        System.out.println("체력 : " +hp+" 지능 : "+mp);

    }
}
