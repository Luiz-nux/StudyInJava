package desafios.javacore.oo.AiDesafios.polymorphism.D02Employees.domain;

public enum Positions {
    DEVELOPER(0.20),
    MANAGER(0.40),
    TRAINEE(0.0);

    private final double bonus;

    Positions(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
}
