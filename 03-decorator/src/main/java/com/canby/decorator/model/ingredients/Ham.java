package com.canby.decorator.model.ingredients;

import com.canby.decorator.model.Food;

/**
 * Created by acanby on 14/10/2014.
 */
public class Ham extends IngredientDecorator {
    public Ham(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Ham off the bone";
    }

    @Override
    public Double cost() {
        return food.cost() + 3.50;
    }
}
