package exercises.KlassenDiagramme;

public class Player {
    private final String name;
    private int score;
    private boolean isActive;

    public Player(String name){
        this.name = name;
        this.isActive = true;
    }
    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }
    public void setScore(int score){
        this.score = score;
    }
    public boolean isActive(){
        return isActive;
    }
    public void setActive(boolean isActive){
        this.isActive = isActive;
    }
}
