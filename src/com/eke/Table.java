package com.eke;

public class Table implements ShoppingItem {

    private double price;
    private String name;
    private User subcontractor;

    public Table(String name, double price, User subcontractor) {
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

    public User getSubcontractor() {
        return subcontractor;
    }

    public void setSubcontractor(User subcontractor) {
        this.subcontractor = subcontractor;
    }

    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
