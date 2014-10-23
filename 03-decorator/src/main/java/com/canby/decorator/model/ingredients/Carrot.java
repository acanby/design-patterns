package com.canby.decorator.model.ingredients;

import com.canby.decorator.model.Food;

/**
 * Created by acanby on 14/10/2014.
 */
public class Carrot extends IngredientDecorator {
    public Carrot(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Carrot";
    }

    @Override
    public Double cost() {
        // Carrots are out of season
        return food.cost() + .10;
    }
}
