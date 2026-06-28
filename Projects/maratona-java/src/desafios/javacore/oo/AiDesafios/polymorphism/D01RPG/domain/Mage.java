package desafios.javacore.oo.AiDesafios.polymorphism.D01RPG.domain;

public class Mage extends Character{
    private int mp;
    public Mage(String name, int level) {
        super(name, level);
    }

    public Mage(String name, int level, double damage, double life, int mp) {
        super(name, level, damage, life);
        this.mp = mp;
    }

    @Override
    public void attack(Character enemy) {
        System.out.println("Merlin shot a fire ball");
        mp -= 5;
        this.logicForBasicAttack(enemy);
    }

    @Override
    public void specialAttack(Character enemy) {
        System.out.println("Merlin used black hole");
        double dmg = (this.calculateDmgForLevel(this.damage) * 10);
        if (this.mp < 50){
            System.out.println("Not enough mana");
            return;
        }
        this.mp -= 50;
        enemy.life -= dmg;
        if (enemy.life < 0){
            enemy.life = 0;
            System.out.println(enemy.name + " death");
            return;
        }
        System.out.println(enemy.name + " life: " + enemy.life);
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }
}
