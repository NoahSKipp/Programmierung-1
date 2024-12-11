package exercises.Weihnachtsbaum;

public class ElectricCandle extends Candle {
    private int powerInPercent;

    public ElectricCandle(String colour) {
        super(colour);
        int powerInPercent = 100;
    }
    @Override
    public void lightACandle(){
        if(powerInPercent >= 10){
            powerInPercent -= 10;
            isBurning = true;

        }
    }
    public void recharge(){

        powerInPercent = 100;
    }
    @Override
    public String toString(){
        return "Electric Candle [color=" + getColour() + ", isBurning=" + isBurning + "]";
    }
}
