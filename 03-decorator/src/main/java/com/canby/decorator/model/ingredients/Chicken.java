package com.canby.decorator.model.ingredients;

import com.canby.decorator.model.Food;

/**
 * Created by acanby on 14/10/2014.
 */
public class Chicken extends IngredientDecorator {
    public Chicken(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Grilled Chicken";
    }

    @Override
    public Double cost() {
        // Free range, this ain't cheap
        return food.cost() + 4.00;
    }
}
