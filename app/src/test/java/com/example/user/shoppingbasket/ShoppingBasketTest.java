package com.example.user.shoppingbasket;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by user on 22/11/2016.
 */

public class ShoppingBasketTest {

    ShoppingBasket basket;
    Item item;

    @Before
    public void before() {
        basket = new ShoppingBasket();
    }


    @Test
    public void testCreateEmptyShoppingBasket () {
        Assert.assertEquals(0, basket.getItemCount());
    }

    @Test
    public void testCanAddToBasket () {
        Item beer = new Item ("Beer", 10, 20.0);
        basket.addItem(beer);
        Assert.assertEquals(1, basket.getItemCount());
    }

    @Test
    public void testCanRemoveFromBasket () {
        Item nappies = new Item ("Nappies", 100, 50.0);
        basket.addItem(nappies);
        basket.removeItem(nappies);
        Assert.assertEquals(0, basket.getItemCount());
    }






}
