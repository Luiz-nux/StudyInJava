package desafios.javacore.oo.gameCard.domain;

public class Card {
    public String name;
    public double dmg;
    public double life;
    public int level;

    public void attack (Card enemy){
        System.out.println(this.name);
        System.out.println(this.name +" attack ");
        System.out.println(enemy.name +" life -"+ this.dmg);
        enemy.life -= this.dmg;
    }
        public void statusCard (){
        System.out.println(name);
        System.out.println("life: "+ life);
        System.out.println("dmg: " + dmg);
    }
}