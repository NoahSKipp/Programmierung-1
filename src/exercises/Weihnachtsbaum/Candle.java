package exercises.Weihnachtsbaum;

public class Candle {
    protected boolean isBurning;
    private final String colour;

    public Candle(String colour){
        this.colour = colour;
    }

    public String getColour(){
        return colour;
    }

    public void lightACandle(){
        isBurning = true;

    }
    public void turnOffACandle(){
        isBurning = false;
    }
}
