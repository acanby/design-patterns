package com.canby.decorator.model;

import com.canby.decorator.model.ingredients.*;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;

public class FoodTest {
    @Test
    public void testChickenSandwich() {
        Food sandwich = new Chicken(new Sandwich());

        Assert.assertEquals(new Double(8.99), sandwich.cost());
        Assert.assertThat(sandwich.getDescription(), containsString("Chicken"));
        Assert.assertThat(sandwich.getDescription(), containsString("Sandwich"));
    }

    @Test
    public void testDoubleMeat() {
        Food sandwich = new Chicken(new Chicken(new Sandwich()));

        Assert.assertEquals(new Double(12.99), sandwich.cost());
    }

    @Test
    public void testSaladWithCarrotCheeseAndBeef() {
        Food salad = new Salad();
        salad = new Carrot(salad);
        salad = new Cheese(salad);
        salad = new Beef(salad);

        Assert.assertEquals(new Double(6.39), salad.cost());
    }

    @Test
    public void testWrapWithTheLot() {
        Food wrap = new WholemealWrap(new Sandwich());
        wrap = new Avocado(wrap);
        wrap = new Beef(wrap);
        wrap = new Capsicum(wrap);
        wrap = new Carrot(wrap);
        wrap = new Cheese(wrap);
        wrap = new Chicken(wrap);
        wrap = new Cucumber(wrap);
        wrap = new Ham(wrap);
        wrap = new Lettuce(wrap);
        wrap = new Onion(wrap);
        wrap = new Pepper(wrap);
        wrap = new Salt(wrap);
        wrap = new Tomato(wrap);

        // Make sure the costs add up
        Assert.assertEquals(new Double(17.73), wrap.cost());

        // Check the description
        Assert.assertThat(wrap.getDescription(), containsString("Sandwich"));
        Assert.assertThat(wrap.getDescription(), containsString("wholemeal wrap"));
        Assert.assertThat(wrap.getDescription(), containsString("Avocado"));
        Assert.assertThat(wrap.getDescription(), containsString("Beef"));
        Assert.assertThat(wrap.getDescription(), containsString("Capsicum"));
        Assert.assertThat(wrap.getDescription(), containsString("Carrot"));
        Assert.assertThat(wrap.getDescription(), containsString("Cheese"));
        Assert.assertThat(wrap.getDescription(), containsString("Chicken"));
        Assert.assertThat(wrap.getDescription(), containsString("Cucumber"));
        Assert.assertThat(wrap.getDescription(), containsString("Ham"));
        Assert.assertThat(wrap.getDescription(), containsString("Lettuce"));
        Assert.assertThat(wrap.getDescription(), containsString("Onion"));
        Assert.assertThat(wrap.getDescription(), containsString("Pepper"));
        Assert.assertThat(wrap.getDescription(), containsString("Salt"));
        Assert.assertThat(wrap.getDescription(), containsString("Tomato"));

    }
}