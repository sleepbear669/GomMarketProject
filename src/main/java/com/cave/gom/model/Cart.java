package com.cave.gom.model;

/**
 * Created by sleepbear on 2015-06-04.
 */
public class Cart {

    private int cart_id;
    private int product_id;
    private String buyerId;

    public Cart() {
    }

    public Cart(String buyer_id, int product_id) {
        this.buyerId = buyer_id;
        this.product_id = product_id;
    }

    public int getCart_id() {
        return cart_id;
    }

    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }
}
