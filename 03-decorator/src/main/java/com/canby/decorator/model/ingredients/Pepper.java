package com.canby.decorator.model.ingredients;

import com.canby.decorator.model.Food;

/**
 * Created by acanby on 14/10/2014.
 */
public class Pepper extends IngredientDecorator {
    public Pepper(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Pepper";
    }

    @Override
    public Double cost() {
        return food.cost();
    }
}
