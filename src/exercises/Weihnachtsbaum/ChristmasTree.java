package exercises.Weihnachtsbaum;

import java.util.ArrayList;
import java.util.List;

public class ChristmasTree {
    private final String type;
    private final double sizeInM;
    private final List<Candle> candles;

    public ChristmasTree(String type, double sizeInM) {
        this.type = type;
        this.sizeInM = sizeInM;
        candles = new ArrayList<>();
    }
    public void addCandle(Candle candle) {
        candles.add(candle);
    }
    public void lightChristmasTree(){
        for(Candle candle : candles){
            candle.lightACandle();
        }
    }
    public int getNumberOfElectricCandles(){
        int numberOfElectricCandles = 0;

        for(Candle candle : candles){
            if (candle instanceof ElectricCandle){
                numberOfElectricCandles++;
            }
        }
        return numberOfElectricCandles;
    }

    public String getType() {
        return type;
    }
    public double getSizeInM() {
        return sizeInM;
    }
    public List<Candle> getCandles() {
        return candles;
    }
    public String toString(){
        return "Weihnachtsbaum [type=" + type + ", sizeInM=" + sizeInM + "]";
    }
}
