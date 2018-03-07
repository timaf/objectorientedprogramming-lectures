package oop.burgerhouse.controller.cook;

import oop.burgerhouse.model.Order;
import oop.burgerhouse.model.dish.Dish;
import oop.burgerhouse.model.dish.Salad;

public class SaladCook implements Cook {

    @Override
    public Dish cook(Order order) {
        return new Salad(order.getName());
    }

    @Override
    public String getType() {
        return "salad";
    }
}
