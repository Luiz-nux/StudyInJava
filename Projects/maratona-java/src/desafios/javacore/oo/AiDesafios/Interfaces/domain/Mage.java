package desafios.javacore.oo.AiDesafios.Interfaces.domain;

public class Mage extends Character implements Attackable{
    public Mage(String name) {
        super(name);
        this.life = 70;
    }

    @Override
    public void attack() {
        System.out.println(this.name + " throw one fire ball");
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
        System.out.println("Greetings, i am " + this.name + ", master of magic");
    }
}
