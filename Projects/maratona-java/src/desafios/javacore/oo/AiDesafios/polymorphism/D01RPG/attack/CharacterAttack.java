package desafios.javacore.oo.AiDesafios.polymorphism.D01RPG.attack;

import desafios.javacore.oo.AiDesafios.polymorphism.D01RPG.domain.Character;

public interface CharacterAttack {
    public abstract void attack(Character enemy);

    public abstract void specialAttack(Character enemy);
}

