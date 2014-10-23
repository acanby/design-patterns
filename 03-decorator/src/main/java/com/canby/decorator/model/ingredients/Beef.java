package com.canby.decorator.model.ingredients;

import com.canby.decorator.model.Food;

/**
 * Created by acanby on 14/10/2014.
 */
public class Beef extends IngredientDecorator {

    public Beef(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return food.getDescription() + ", Roast Beef";
    }

    @Override
    public Double cost() {
        // no extra for beef
        return food.cost();
    }
}
