package com.canby.decorator.model.ingredients;

import com.canby.decorator.model.Food;

/**
 * Created by acanby on 14/10/2014.
 */
public abstract class IngredientDecorator extends Food {
    protected Food food;

    @Override
    public String getDescription() {
        return food.getDescription();
    }

    IngredientDecorator(Food food) {
        this.food = food;
    }
}
