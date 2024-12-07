package exercises.Geschenkesack;

public class GeschenkTask {
    public static void main(String[] args) {
        Person person = new Person("Peter", 17, 'M');
        Person person2 = new Person("Jack", 23, 'M');
        Person person3 = new Person("Jill", 23, 'F');
        Person person4 = new Person("Valentine", 23, 'M');

        Present present = new Present("Spielzeugbus", 320, person, person2);
        Present present2 = new Present("Spielzeugauto", 300, person, person3);
        Present present3 = new Present("Nintendo Switch", 600, person3, person4);

        GiftBag giftbag = new GiftBag();

        giftbag.addPresent(present);
        giftbag.addPresent(present2);
        giftbag.addPresent(present3);

        Present mostExpensive = giftbag.getMostExpensivePresent();

        if (mostExpensive != null) {
            System.out.println("Das teuerste Geschenk ist " + mostExpensive.getDescriptionM() +", mit einem Preis von " + mostExpensive.getPriceInEuro());
        } else {
            System.out.println("Es gibt diese Weihnachten wohl leider keine Geschenke!");
        }




    }
}
