package com.canby.decorator.model.ingredients;

import com.canby.decorator.model.Food;

/**
 * Created by acanby on 14/10/2014.
 */
public class Lettuce extends IngredientDecorator {
    public Lettuce(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Lettuce";
    }

    @Override
    public Double cost() {
        return food.cost();  // ain't no cost on lettuce
    }
}
