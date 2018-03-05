package oop.burgerhouse.controller.cook;

import oop.burgerhouse.model.Order;
import oop.burgerhouse.model.dish.Dessert;
import oop.burgerhouse.model.dish.Dish;

public class DessertCook implements Cook {

    @Override
    public Dish cook(Order order) {
        return new Dessert(order.getName());
    }

    @Override
    public String getType() {
        return "dessert";
    }
}
