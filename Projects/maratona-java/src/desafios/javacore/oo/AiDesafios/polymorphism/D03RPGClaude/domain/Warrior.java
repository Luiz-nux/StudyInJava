package domain;

import print.TypeDamage;

public class Warrior extends Character implements SkillsCharacter{
    public Warrior(String name, double life) {
        super(name, life);
        this.setDamage(30);
        this.typeDamage = TypeDamage.PHYSICAL;
    }


    @Override
    public double skill() {
        return this.damage * 2;
    }

    @Override
    public void receiveDamage(double damage) {
        super.receiveDamage(damage/2);
    }
}
