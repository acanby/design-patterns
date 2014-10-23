package com.canby.decorator.model.ingredients;

import com.canby.decorator.model.Food;

/**
 * Created by acanby on 14/10/2014.
 */
public class Salt extends IngredientDecorator {
    public Salt(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Salt";
    }

    @Override
    public Double cost() {
        return food.cost();
    }
}
