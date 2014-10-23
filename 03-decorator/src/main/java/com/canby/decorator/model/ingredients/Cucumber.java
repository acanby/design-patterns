package com.canby.decorator.model.ingredients;

import com.canby.decorator.model.Food;

/**
 * Created by acanby on 14/10/2014.
 */
public class Cucumber extends IngredientDecorator {
    public Cucumber(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cucumber";
    }

    @Override
    public Double cost() {
        return food.cost();
    }
}
