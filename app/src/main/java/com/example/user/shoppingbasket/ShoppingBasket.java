package com.example.user.shoppingbasket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

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

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void emptyBasket() {
        this.items.clear();
    }


    public double getBasketCost() {
        Double totalPrice = 0.0;
        for (Item aItem : items) {

            totalPrice += aItem.getPrice();
        }
        return totalPrice;
    }

    public int getBasketBogof() {
        int totalBogof = 0;
        for (Item aItem : items) {
            if (aItem.getitemBogof() == true) {
                totalBogof++;
            }
            ;
        }
        return totalBogof;
    }

    public double getTotalPriceBogof() {
        Double totalPrice = 0.0;
        for (Item aItem : items) {
            if (aItem.getitemBogof() == true) {
                totalPrice += aItem.getPrice();
            }
        }
        return totalPrice;
    }


    public double getDiscountTotal() {
        Double basketTotal = 0.0;
            for (Item aItem : items) {
                if (aItem.getBasketCost > 20) {
                    basketTotal ++;
                }
            }
    }

}