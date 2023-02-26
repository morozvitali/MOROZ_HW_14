package coffee.order;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {
    private List<Order> orders = new ArrayList<>();
    private int lastOrderNumber = 0;

    public void add(String name) {
        int newOrderNumber = lastOrderNumber + 1;
        lastOrderNumber = newOrderNumber;
        Order newOrder = new Order(newOrderNumber, name);
        orders.add(newOrder);
    }

    public void deliver() {
        if (orders.size() > 0) {
            Order nextOrder = orders.get(0);
            System.out.println("Delivering order #" + nextOrder.getOrderNumber() + " for " + nextOrder.getName());
            orders.remove(0);
        } else {
            System.out.println("No orders to deliver.");
        }
    }

    public void deliver(int orderNumber) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderNumber() == orderNumber) {
                Order foundOrder = orders.get(i);
                System.out.println("Delivering order #" + foundOrder.getOrderNumber() + " for " + foundOrder.getName());
                orders.remove(i);
                return;
            }
        }
        System.out.println("coffee.order.Order #" + orderNumber + " not found.");
    }

    public void draw() {
        System.out.println("=========================");
        System.out.println("Num | Name");
        for (Order order : orders) {
            System.out.println(order.getOrderNumber() + " | " + order.getName());
        }
    }
}

