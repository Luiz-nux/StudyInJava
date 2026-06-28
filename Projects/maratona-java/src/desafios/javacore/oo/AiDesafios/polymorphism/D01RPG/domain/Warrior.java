package desafios.javacore.oo.AiDesafios.polymorphism.D01RPG.domain;

public class Warrior extends Character{
    public Warrior(String name, int level) {
        super(name, level);
    }

    public Warrior(String name, int level, double damage, double life) {
        super(name, level, damage, life);
    }

    @Override
    public void attack(Character enemy) {
        System.out.println("The king Arthur attacked with your sword");
        this.logicForBasicAttack(enemy);
    }

    @Override
    public void specialAttack(Character enemy) {
        System.out.println("the king Arthur attack with tornado");
        double dmg = (this.calculateDmgForLevel(this.damage)*5);
        enemy.life -= dmg;
        if (enemy.life < 0){
            enemy.life = 0;
            System.out.println(enemy.name + " death");
            return;
        }
        System.out.println(enemy.name + " life: " + enemy.life);
    }
}
