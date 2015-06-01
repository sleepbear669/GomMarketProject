package com.cave.gom.model;

/**
 * Created by sleepbear on 2015-06-01.
 */
public class Product {
    private int product_id;
    private String  product_name;
    private String seller_id;
    private String contents;
    private String image;
    private int price;

    public Product(String product_name, String seller_id, String contents, String image, int price) {
        this.product_name = product_name;
        this.seller_id = seller_id;
        this.contents = contents;
        this.image = image;
        this.price = price;
    }

    public Product() {}

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
