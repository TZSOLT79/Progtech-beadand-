package com.eke;

public class ShoppingCart implements ShoppingCartVisitor {

    private User user;

    @Override
    public double visit(Table table) {
        return table.getPrice();
    }

    @Override
    public double visit(Chair chair) {
        return chair.getPrice();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}