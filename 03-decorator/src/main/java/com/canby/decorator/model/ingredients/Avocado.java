package com.canby.decorator.model.ingredients;

import com.canby.decorator.model.Food;

/**
 * Created by acanby on 14/10/2014.
 */
public class Avocado extends IngredientDecorator {

    public Avocado(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return food.getDescription() +  ", Avocado";
    }

    @Override
    public Double cost() {
        return food.cost() + 1.50;
    }
}
