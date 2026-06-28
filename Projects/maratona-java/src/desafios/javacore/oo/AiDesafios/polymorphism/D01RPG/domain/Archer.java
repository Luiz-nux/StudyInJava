package desafios.javacore.oo.AiDesafios.polymorphism.D01RPG.domain;

public class Archer extends Character{
    private  int criticalMultiplier;
    public Archer(String name, int level) {
        super(name, level);
    }

    public Archer(String name, int level, double damage, double life, int critical) {
        super(name, level, damage, life);
        this.criticalMultiplier = critical;
    }

    @Override
    public void attack(Character enemy) {
        System.out.println("Legolas shot a arrow");
        this.logicForBasicAttack(enemy);
    }

    @Override
    public void specialAttack(Character enemy) {
        System.out.println("Legolas shot a critical arrow");
        double dmg = (this.calculateDmgForLevel(this.damage) * this.criticalMultiplier);
        enemy.life -= dmg;
        if (enemy.life < 0){
            enemy.life = 0;
            System.out.println(enemy.name + " death");
            return;
        }
        System.out.println(enemy.name + " life: " + enemy.life);
    }

    public int getCriticalMultiplier() {
        return criticalMultiplier;
    }

    public void setCriticalMultiplier(int criticalMultiplier) {
        this.criticalMultiplier = criticalMultiplier;
    }
}
