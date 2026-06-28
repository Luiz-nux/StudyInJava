package domain;

import print.TypeDamage;

public class Archer extends Character{
    public Archer(String name, double life) {
        super(name, life);
        this.damage = 20;
        typeDamage = TypeDamage.DISTANCE;
    }

    @Override
    public double attack() {
        return super.attack() * 2;
    }
}
