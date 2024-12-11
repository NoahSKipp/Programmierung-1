package exercises.Würfelspiel01;

public class Player {
    private final String name;
    private int points;

    public Player(String name, int points){
        this.name = name;
        this.points = points;
    }
    public void reducePoints(int value){
       int newpoints = points - value;
       points = newpoints;
    }
    public String getName(){
        return name;
    }
    public int getPoints(){
        return points;
    }

}
