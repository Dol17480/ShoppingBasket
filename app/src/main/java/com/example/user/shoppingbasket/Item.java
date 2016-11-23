package com.example.user.shoppingbasket;

/**
 * Created by user on 22/11/2016.
 */

public class Item {

    private String itemName;
    private int quantity;
    private double totalPrice;


    public Item(String itemName, int quantity, double totalPrice) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }


    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

}
