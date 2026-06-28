package maratonajava.desafio.objectOrientation.rpgInheritance.domain;

public class Archer extends Character{
    private double longRangeDamage;

    public Archer(double life, double damage, double defense, double longRangeDamage) {
        super(life, damage, defense);
        this.longRangeDamage = longRangeDamage;
    }

    public void skillPenetration(Character character){
        character.setLife(character.getLife() - (this.longRangeDamage*1.5));
    }

    @Override
    public void print(){
        super.print();
        System.out.println("long range damage: " + this.longRangeDamage);
    }

    public double getLongRangeDamage() {
        return longRangeDamage;
    }

    public void setLongRangeDamage(double longRangeDamage) {
        this.longRangeDamage = longRangeDamage;
    }
}
