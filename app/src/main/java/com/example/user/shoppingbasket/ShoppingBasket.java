package com.example.user.shoppingbasket;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by user on 22/11/2016.
 */

public class ShoppingBasket {

    private ArrayList<Item> items;
    private double totalValue;


    public ShoppingBasket() {
        items = new ArrayList<Item>();
    }

    public int getItemCount() {
        return this.items.size();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem (Item item) {
        items.remove(item);
    }

    public void emptyBasket () {
        this.items.clear();
    }


    public double getBasketCost () {
        Double totalPrice = 0.0;
        for ( Item aItem : items ) {

            totalPrice += aItem.getPrice();
        }
        return totalPrice;
    }

}