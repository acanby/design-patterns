package com.canby.decorator.model.ingredients;

import com.canby.decorator.model.Food;

/**
 * Created by acanby on 14/10/2014.
 */
public class Tomato extends IngredientDecorator {
    public Tomato(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Tomato";
    }

    @Override
    public Double cost() {
        return food.cost() + 0.25;
    }
}
