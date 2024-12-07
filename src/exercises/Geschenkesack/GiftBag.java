package exercises.Geschenkesack;

import java.util.ArrayList;
import java.util.List;

public class GiftBag {
    private final List<Present> presents;

    public GiftBag() {
        presents = new ArrayList<Present>();
    }
    public void addPresent(Present present){
        presents.add(present);
    }
    public Present getMostExpensivePresent() {
        if (presents.isEmpty()) {
            return null;
        }

        Present mostExpensive = presents.get(0);
        for (int i = 1; i < presents.size(); i++) {
            if (presents.get(i).getPriceInEuro() > mostExpensive.getPriceInEuro()) {
                mostExpensive = presents.get(i);
            }
        }
        return mostExpensive;
    }

}
