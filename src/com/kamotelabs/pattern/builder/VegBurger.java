package com.kamotelabs.pattern.builder;

public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.5f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
