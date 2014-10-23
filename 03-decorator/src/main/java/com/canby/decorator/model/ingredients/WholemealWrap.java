package com.canby.decorator.model.ingredients;

import com.canby.decorator.model.Food;

/**
 * Created by acanby on 14/10/2014.
 */
public class WholemealWrap extends IngredientDecorator {

    public WholemealWrap(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", on a tasty wholemeal wrap";
    }

    @Override
    public Double cost() {
        // these babies aren't cheap!
        return food.cost() + 1.39;
    }
}
