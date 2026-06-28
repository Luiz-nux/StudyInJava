package desafios.javacore.oo.AiDesafios.enumRPG.domain;

public class Character {
    private String name;
    private CharacterClass characterClass;

    public Character(String name, CharacterClass characterClass) {
        this.name = name;
        this.characterClass = characterClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }
}
