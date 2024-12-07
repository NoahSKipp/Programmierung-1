package exercises.Musterklausur.Aufgabe01;

public class Lecture {
    private final String description;
    private final int creditPoints;

    public Lecture(String description, int creditPoints) {
        this.description = description;
        this.creditPoints = creditPoints;
    }
    public String getDescription() {
        return description;
    }
    public int getCreditPoints() {
        return creditPoints;
    }
}
