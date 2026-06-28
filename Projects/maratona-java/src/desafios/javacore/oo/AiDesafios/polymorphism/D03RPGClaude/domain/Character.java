package domain;

import print.TypeDamage;

public abstract class Character{
    protected String name;
    protected double life;
    protected double damage;
    protected TypeDamage typeDamage;

    public Character(String name, double life) {
        this.name = name;
        this.life = life;
    }

    public double attack(){
        return this.damage;
    }

    public void receiveDamage(double damage){
        this.life -= damage;
        if (this.life < 0){
            this.life = 0;
        }
    }

    public boolean thisAAlive(){
        return this.life > 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public TypeDamage getTypeDamage() {
        return typeDamage;
    }
}
