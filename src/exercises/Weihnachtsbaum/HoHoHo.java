package exercises.Weihnachtsbaum;

public class HoHoHo {
    public static void main(String[] args) {
        ElectricCandle ec1 = new ElectricCandle("Red");
        ElectricCandle ec2 = new ElectricCandle("Blue");
        ElectricCandle ec3 = new ElectricCandle("Green");
        Candle c1 = new Candle("Red");
        Candle c2 = new Candle("Blue");
        Candle c3 = new Candle("Green");
        ChristmasTree ct1 = new ChristmasTree("Tannenbaum", 1.20);
        ct1.addCandle(c1);
        ct1.addCandle(c2);
        ct1.addCandle(c3);
        ct1.addCandle(ec1);
        ct1.addCandle(ec2);
        ct1.addCandle(ec3);
        ct1.lightChristmasTree();
        ct1.getNumberOfElectricCandles();

        System.out.println("Weihnachtsbaum " + ct1 + " besitzt über " + ct1.getNumberOfElectricCandles() + " elektrische Kerzen. Insgesamt besitzt der Baum die Kerzen: " + ct1.getCandles());


    }
}
