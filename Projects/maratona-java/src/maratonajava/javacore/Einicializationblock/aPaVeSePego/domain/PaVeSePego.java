package maratonajava.javacore.Einicializationblock.aPaVeSePego.domain;

public class PaVeSePego {
    private String name;
    private int age;
    private boolean approved;
    {
            System.out.println("enter your bill");

    }
    public PaVeSePego(String name, int age, boolean approved){
        this(name, age);
        this.approved = approved;
    }
    public PaVeSePego(String name, int age){
        this.name = name;
        this.age = age;
    }

    public boolean choose(int choose){
        if (choose == 1){
            return true;
        }
        return false;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public boolean isApproved() {
        return approved;
    }
}
