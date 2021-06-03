package com.eke;

public interface ShoppingItem {
    public double accept(ShoppingCartVisitor visitor);
}

