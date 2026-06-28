package domain;

import print.TypeDamage;

public class Mage extends Character{

    public Mage(String name, double life) {
        super(name, life);
        typeDamage = TypeDamage.MAGIC;
    }
}
