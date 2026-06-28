package desafios.javacore.oo.AiDesafios.association.domain;

public class Mission {
    private String name;
    private int difficulty;
    private int xpReward;
    private double cashReward;

    public Mission(String name) {
        this.name = name;
    }

    public Mission(String name, int difficulty, int xpReward, double cashReward) {
        this.name = name;
        this.difficulty = difficulty;
        this.xpReward = xpReward;
        this.cashReward = cashReward;
    }

    public void printMission(){
        System.out.println("Mission: " + this.name);
        System.out.println("Difficulty: " + this.difficulty);
        System.out.println("$: " + this.cashReward);
        System.out.println("xp: " + this.xpReward);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getXpReward() {
        return xpReward;
    }

    public void setXpReward(int xpReward) {
        this.xpReward = xpReward;
    }

    public double getCashReward() {
        return cashReward;
    }

    public void setCashReward(double cashReward) {
        this.cashReward = cashReward;
    }
}
