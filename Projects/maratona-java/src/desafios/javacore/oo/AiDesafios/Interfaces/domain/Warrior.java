package desafios.javacore.oo.AiDesafios.Interfaces.domain;

public class Warrior extends Character implements Attackable{

    public Warrior(String name) {
        super(name);
        this.life = 100;
    }

    @Override
    public void attack() {
        System.out.println(this.name + " Attack with the sword");
    }

    @Override
    public void receiveDmg(int dmg) {
        this.life -= dmg;
        if (this.life < 0){
            this.life = 0;
        }
    }

    @Override
    public void toPresent() {
        System.out.println("i am " + this.name + " a warrior fierce");
    }
}
