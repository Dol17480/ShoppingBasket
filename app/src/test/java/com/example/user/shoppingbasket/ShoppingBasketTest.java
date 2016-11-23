package com.example.user.shoppingbasket;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 22/11/2016.
 */

public class ShoppingBasketTest {

    ShoppingBasket basket;
    Item nappies;
    Item beer;


    @Before
    public void before() {
        basket = new ShoppingBasket();
        nappies = new Item("Nappies", true, 8.0);
        beer = new Item("Beer", false, 10.0);
    }


    @Test
    public void testCreateEmptyShoppingBasket() {
        Assert.assertEquals(0, basket.getItemCount());
    }

    @Test
    public void testCanAddToBasket() {
        basket.addItem(beer);
        Assert.assertEquals(1, basket.getItemCount());
    }

    @Test
    public void testCanRemoveFromBasket() {
        basket.addItem(nappies);
        basket.removeItem(nappies);
        Assert.assertEquals(0, basket.getItemCount());
    }

    @Test
    public void testCanEmptyBasket() {
        basket.addItem(nappies);
        basket.emptyBasket();
        Assert.assertEquals(0, basket.getItemCount());
    }


    @Test
    public void testCanGetCostOfBasket () {
        basket.addItem(nappies);
        basket.addItem(beer);
        assertEquals(18.0, basket.getBasketCost());
    }






}
