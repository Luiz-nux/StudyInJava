package desafios.javacore.oo.AiDesafios.polymorphism.D01RPG.domain;

import desafios.javacore.oo.AiDesafios.polymorphism.D01RPG.attack.CharacterAttack;

public abstract class Character implements CharacterAttack {
    protected String name;
    protected int level;
    protected double damage;
    protected double life;

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getLife() {
        return life;
    }

    public void setLife(double life) {
        this.life = life;
    }

    public Character(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public Character(String name, int level, double damage, double life) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.life = life;
    }

    protected double calculateDmgForLevel(double dmg){
        return dmg * this.level;
    }

    protected void logicForBasicAttack(Character enemy){
        enemy.life -= this.calculateDmgForLevel(this.damage);
        if (enemy.life < 0){
            enemy.life = 0;
            System.out.println(enemy.name + " death");
            return;
        }
        System.out.println(enemy.name + " life: " + enemy.life);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}