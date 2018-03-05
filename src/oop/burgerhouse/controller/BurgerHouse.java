package oop.burgerhouse.controller;

import oop.burgerhouse.model.dish.Dish;
import oop.burgerhouse.model.Menu;
import oop.burgerhouse.model.Order;
import oop.burgerhouse.view.Waiter;

import java.util.List;

public class BurgerHouse {

    private Menu menu = Management.getMenu();
    private Waiter waiter = new Waiter(menu);
    private KitchenManager kitchenManager = new KitchenManager();

    public void visit() {
        // showMenu the menu -- we need one menu
        // write oders -- waiter is giving us a list of orders
        // give orders to kitchen manager -- he gives us back a list of dishes
        // display dishes -- waiter displays the dishes


        waiter.showMenu();
        List<Order> orders = waiter.getOders();
        List<Dish> dishes = kitchenManager.cook(orders);
        waiter.show(dishes);
    }
}
