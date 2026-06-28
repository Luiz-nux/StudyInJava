package desafios.javacore.oo.AiDesafios.enumRPG.domain;

public enum CharacterClass {
    WARRIOR(80, 90, "Melee Combat", "Warrior"),
    MAGE(95, 40, "magic Spells", "Mage"),
    ARCHER(75, 60, "Long Range", "Archer"),
    HEALER(30, 70, "Team Support", "Healer");

    private int damage;
    private int defense;
    private final String specialty;
    private final String characterClass;

    CharacterClass(int damage, int defense, String specialty, String characterClass){
        this.damage = damage;
        this.defense = defense;
        this.specialty = specialty;
        this.characterClass = characterClass;
    }

    public void showInfo(){
        System.out.println("Class: " + this.name());
        System.out.println("Damage: " + this.getDamage());
        System.out.println("Defense: " + this.getDefense());
        System.out.println("Specialty: " + this.getSpecialty());
    }
    
    public int getDamage() {
        return damage;
    }

    public int getDefense() {
        return defense;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getCharacterClass() {
        return characterClass;
    }
}