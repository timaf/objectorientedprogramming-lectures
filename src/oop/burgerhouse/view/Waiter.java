package oop.burgerhouse.view;

import oop.burgerhouse.controller.WaiterAssistant;
import oop.burgerhouse.model.dish.Dish;
import oop.burgerhouse.model.Menu;
import oop.burgerhouse.model.Order;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Waiter {

    private Menu menu;

    private Scanner scanner = new Scanner(System.in);

    private WaiterAssistant waiterAssistant;

    public Waiter(Menu menu) {
        this.menu = menu;
        waiterAssistant = new WaiterAssistant(menu);
    }

    public void showMenu() {
        System.out.println("Welcome to the Burger House!");
        System.out.println("This is our menu:");
        menu.getItems().stream()
                .map(m -> m.getName() + " " + m.getPrice() + " Euro")
                .forEach(System.out::println);
    }

    public void show(List<Dish> dishes) {
        dishes.stream()
                .map(dish -> dish.getName())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .map(e -> e.getValue() + " " + e.getKey())
                .forEach(System.out::println);
    }

    public List<Order> getOders() {
        System.out.print("Your order: ");
        String order = scanner.nextLine();
        String[] writtenOrders = order.split(", ");
        return waiterAssistant.toOrders(writtenOrders);
    }

}
