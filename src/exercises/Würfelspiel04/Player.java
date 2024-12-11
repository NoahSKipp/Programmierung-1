package exercises.Würfelspiel04;

public class Player {
    private final String name;
    private int points;

    public Player(String name, int points) {
        this.name = name;
        this.points = points;
    }
    public String getName() {
        return name;
    }
    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }
}

