package desafios.javacore.oo.AiDesafios.association.domain;

public class Player {
    private String name;
    private int level;
    private double cash;
    private String[] inventory;
    private Guild guild;
    private static int totalPlayer;

    {
        this.inventory = new String[30];
    }

    public Player(String name, int level, double cash) {
        this.name = name;
        this.level = level;
        this.cash = cash;
        Player.totalPlayer++;
    }

    public Player(String name, int level, double cash, Guild guild) {
        this(name, level, cash);
        this.guild = guild;
    }

    public void addItem(String item){
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null){
                inventory[i] = item;
                return;
            }
        }
        System.out.println("full inventory");
    }
    public void viewInventory(){
        for (String view: inventory){
            if (view == null) return;
            System.out.print(view + "  ");
        }
        System.out.println();
    }

    public void printStatus(){
        System.out.println("Name: " + this.name);
        System.out.println("Level: " + this.level);
        System.out.println("Cash: " + this.cash);
        System.out.println("Guild: " + this.guild.getName());
    }

    public void getReward(int xp, double cash){
        this.cash += cash;
        this.level += xp;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public String[] getInventory() {
        return inventory;
    }

    public void setInventory(String[] inventory) {
        this.inventory = inventory;
    }

    public Guild getGuild() {
        return guild;
    }

    public void setGuild(Guild guild) {
        this.guild = guild;
    }

}
