package maratonajava.desafio.objectOrientation.rpgInheritance.domain;

public class Character {
    private double life;
    private double damage;
    private double defense;

    public Character(double life, double damage, double defense) {
        this.life = life;
        this.damage = damage;
        this.defense = defense;
    }

    public void print(){
        System.out.println("life: " + this.life);
        System.out.println("damage: " + this.damage);
        System.out.println("defense: " + this.defense);
    }

    public void attack(Character enemy){
        double finalDamage = this.damage - enemy.defense;

        if (finalDamage < 0){
            finalDamage = 0;
        }

        enemy.life -= finalDamage;
    }

    protected void receiveDamage(double damage){
        double finalDamage = damage - this.defense;
        if (finalDamage < 0){
            finalDamage = 0;
        }
        this.life -= finalDamage;
    }

    public double getLife() {
        return life;
    }

    public void setLife(double life) {
        this.life = life;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }
}
