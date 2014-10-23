package com.canby.decorator.model.ingredients;

import com.canby.decorator.model.Food;

/**
 * Created by acanby on 14/10/2014.
 */
public class WhiteBread extends IngredientDecorator {
    public WhiteBread(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", on White bread";
    }

    @Override
    public Double cost() {
        return food.cost();
    }
}
