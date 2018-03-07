package oop.burgerhouse.controller.cook;

import oop.burgerhouse.model.dish.Dish;
import oop.burgerhouse.model.Order;

public interface Cook {

    Dish cook(Order order);

    String getType();

}
