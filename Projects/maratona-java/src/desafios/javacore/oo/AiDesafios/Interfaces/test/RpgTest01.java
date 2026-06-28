package desafios.javacore.oo.AiDesafios.Interfaces.test;

import desafios.javacore.oo.AiDesafios.Interfaces.domain.Attackable;
import desafios.javacore.oo.AiDesafios.Interfaces.domain.Character;
import desafios.javacore.oo.AiDesafios.Interfaces.domain.Mage;
import desafios.javacore.oo.AiDesafios.Interfaces.domain.Warrior;

public class RpgTest01 {
    public static void main(String[] args) {
        Warrior w = new Warrior("Arthur");
        Mage m = new Mage("Merlin");

        w.toPresent();
        m.toPresent();

        w.attack();
        m.attack();

        w.receiveDmg(30);
        w.showStatus();

        m.receiveDmg(80);
        System.out.println(m.isAlive());
    }
}
