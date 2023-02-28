package src.main.java.hillel.hw.cofe.order;

class Order {
    private int orderNumber;
    private String name;

    public Order(int orderNumber, String name) {
        this.orderNumber = orderNumber;
        this.name = name;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getName() {
        return name;
    }
}