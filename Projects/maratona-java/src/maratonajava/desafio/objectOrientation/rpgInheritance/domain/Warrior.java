package maratonajava.desafio.objectOrientation.rpgInheritance.domain;

public class Warrior extends Character{
    private double swordDamage;

    public Warrior(double life, double attack, double defense, double swordDamage) {
        super(life, attack, defense);
        this.swordDamage = swordDamage;
    }

    public void skillDestructor(Character character){
        character.receiveDamage(this.swordDamage*2);
    }

    @Override
    public void print(){
        super.print();
        System.out.println("sword damage: " + this.swordDamage);
    }

    public double getSwordDamage() {
        return swordDamage;
    }

    public void setSwordDamage(double swordDamage) {
        this.swordDamage = swordDamage;
    }
}