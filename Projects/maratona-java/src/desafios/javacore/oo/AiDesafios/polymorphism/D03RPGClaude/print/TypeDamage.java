package print;

public enum TypeDamage {
    PHYSICAL("Physical"),
    MAGIC("Magic"),
    DISTANCE("Distance");

    String type;

    TypeDamage(String type) {
        this.type = type;
    }
}