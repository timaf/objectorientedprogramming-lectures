package oop.burgerhouse.controller.cook;

import oop.burgerhouse.model.Order;
import oop.burgerhouse.model.dish.Dish;
import oop.burgerhouse.model.dish.Pizza;

public class PizzaCook implements Cook {

    @Override
    public Dish cook(Order order) {
        return new Pizza(order.getName());
    }

    @Override
    public String getType() {
        return "pizza";
    }
}
