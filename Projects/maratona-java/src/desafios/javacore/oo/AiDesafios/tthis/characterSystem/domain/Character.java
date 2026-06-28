package desafios.javacore.oo.AiDesafios.tthis.characterSystem.domain;

public class Character {
    private String name;
    private double life;
    private double dmg;
    private int age;
    private double stamina;

    public Character(String name, double life, double dmg, int age, double stamina) {
        this.name = name;
        this.life = life;
        this.dmg = dmg;
        this.age = age;
        this.stamina = stamina;
    }

    public void attack(Character enemy){
        System.out.println("life the " + enemy.name+ " - dmg the you");
        enemy.life -= this.dmg;
        System.out.println(enemy.name + " life = " + enemy.life);
    }

    public void receiveDmg(Character enemy){
        this.life -= enemy.dmg;
        System.out.println("your life : " + this.life);
    }

    public boolean startGame(int choose){
        switch (choose) {
            case 1:
                return true;
            default:
                return false;

        }
    }

    public void viewCharacter(){
        System.out.println("name " + this.name);
        System.out.println("life " + this.life);
        System.out.println("dmg " + this.dmg);
        System.out.println("age " + this.age);
    }

    public boolean deadOrNo(){
        if (this.life <= 0) return true;
        return false;
    }

    public double getLife(){
        return life;
    }

    public void heal(double heal){
        this.life = heal;
    }
}
