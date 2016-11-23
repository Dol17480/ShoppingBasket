package com.example.user.shoppingbasket;

/**
 * Created by user on 22/11/2016.
 */

public class Item {

    private String itemName;
    private boolean bogof;
    private double price;


    public Item(String itemName, boolean bogof, double price) {
        this.itemName = itemName;
        this.bogof = bogof;
        this.price = price;
    }


    public String getItemName() {
        return itemName;
    }

    public boolean getitemBogof() {
        return bogof;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return itemName;
    }
}
