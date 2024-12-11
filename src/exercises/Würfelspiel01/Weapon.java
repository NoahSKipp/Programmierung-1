package exercises.Würfelspiel01;

public enum Weapon {
    SWORD("Chainsword", 4),
    SPEAR("Guardian Spear", 2),
    AXE("Power Axe", 3),
    CLUB("Thunder Hammer", 1);

    private final String description;
    private final int power;

    Weapon(String description, int power) {
        this.description = description;
        this.power = power;
    }
    public String getDescription() {
        return description;
    }
    public int getPower() {
        return power;
    }
}
