package oop.burgerhouse.controller.cook;

import oop.burgerhouse.model.Order;
import oop.burgerhouse.model.dish.Burger;
import oop.burgerhouse.model.dish.Dish;

public class BurgerCook implements Cook {

    @Override
    public Dish cook(Order order) {
        return new Burger(order.getName());
    }

    @Override
    public String getType() {
        return "burger";
    }
}
