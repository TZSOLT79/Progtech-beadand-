package com.eke;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Vásárló
        User user = new User.Builder("teszt", "teszt").setAge(28).build();

        //Beszállító
        User subcontractorIstvan = new User.Builder("subcontractor1", "subcontractor1@subcontractor.hu").setMobilePhone("+362012345678").build();

        //Lista a termékekről
        List<ShoppingItem> items = new ArrayList<>();
        items.add(new Table("table1",22, subcontractorIstvan));
        items.add(new Table("table2",3, subcontractorIstvan));
        items.add(new Table("table3",2,subcontractorIstvan));
        items.add(new Chair("chair1",45,subcontractorIstvan));

        ShoppingCartVisitor shoppingCart = new ShoppingCart();
        ((ShoppingCart) shoppingCart).setUser(user);


        double sum = 0;
        for(ShoppingItem shoppingItem : items)
            sum = sum + shoppingItem.accept(shoppingCart);

        System.out.println(((ShoppingCart) shoppingCart).getUser().getName() + " " + sum);
    }
}
