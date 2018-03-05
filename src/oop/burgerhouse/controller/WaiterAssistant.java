package oop.burgerhouse.controller;

import oop.burgerhouse.model.Menu;
import oop.burgerhouse.model.MenuItem;
import oop.burgerhouse.model.Order;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaiterAssistant {

    private Menu menu;

    public WaiterAssistant(Menu menu) {
        this.menu = menu;
    }

    public List<Order> toOrders(String[] writtenOrders) {
        return Stream.of(writtenOrders)
                .map(toMenuItem())
                .filter(menuItem -> menuItem.isPresent())
                .map(Optional::get)
                .map(toOrder())
                .collect(Collectors.toList());
    }

    private Function<String, Optional<MenuItem>> toMenuItem() {
        return name -> {
            return menu.getItems().stream()
                    .filter(menuItem -> menuItem.getName().equalsIgnoreCase(name))
                    .findFirst();
        };
    }

    private Function<MenuItem, Order> toOrder() {
        return menuItem -> {
            Order order = new Order();
            order.setName(menuItem.getName());
            order.setType(menuItem.getType());
            return order;
        };
    }
}
