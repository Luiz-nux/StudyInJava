package desafios.javacore.oo.AiDesafios.Interfaces.domain;

public abstract class Character {
    protected String name;
    protected int life;

    public Character(String name) {
        this.name = name;
    }

    public boolean isAlive(){
        return this.life > 0;
    }

    public void showStatus(){
        System.out.println("name: " + this.name);
        System.out.println("life: " + this.life);
    }

    public abstract void toPresent();
}
