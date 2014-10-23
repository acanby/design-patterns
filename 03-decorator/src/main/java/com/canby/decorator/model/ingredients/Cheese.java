package com.canby.decorator.model.ingredients;

import com.canby.decorator.model.Food;

/**
 * Created by acanby on 14/10/2014.
 */
public class Cheese extends IngredientDecorator {
    public Cheese(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }

    @Override
    public Double cost() {
        // Fetta, not cheap
        return food.cost() + 2.00;
    }
}
