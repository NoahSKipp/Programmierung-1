package exercises.Würfelspiel04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FoodCategoryDice {
    public FoodCategory rollTheDice(){
        Random random = new Random();
        int foodroll = random.nextInt(1,6);
        List<FoodCategory> foodCategories = new ArrayList<>();
        for(FoodCategory foodCategory : FoodCategory.values()){
            if(foodroll == foodCategory.getPoints()){
                return foodCategory;
            }
        }
        throw new IllegalStateException("No matching category found");
    }



}
