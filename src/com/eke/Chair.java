package com.eke;

public class Chair implements ShoppingItem {

    private double price;
    private String name;
    private User subcontractor;

    public Chair(String name, double price, User subcontractor) {
        this.name = name;
        this.price = price;
        this.subcontractor = subcontractor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
