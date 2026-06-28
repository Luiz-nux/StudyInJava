package maratonajava.desafio.objectOrientation.rpgInheritance.domain;

public class Mage extends Character{
    private double elementalDamage;
    private double mana;

    public Mage(double life, double damage, double defense, double elementalDamage, double mana){
        super(life, damage, defense);
        this.elementalDamage = elementalDamage;
        this.mana = mana;
    }

    public void skillFireBall(Character character){
        if (this.mana < 10) {
            System.out.println("insufficient mana");
            return;
        }
        character.receiveDamage(this.elementalDamage*1.5);
        this.mana -= 10;
    }

    public void skillSupernova(Character character){
        if (this.mana < 100){
            System.out.println("insufficient mana");
            return;
        }
        character.receiveDamage(this.elementalDamage*6);
        this.mana -= 100;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("elemental damage: " + this.elementalDamage);
        System.out.println("mana: " + this.mana);
    }

    public void setElementalDamage(double elementalDamage){
        this.elementalDamage = elementalDamage;
    }

    public double getElementalDamage(){
        return elementalDamage;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }
}
