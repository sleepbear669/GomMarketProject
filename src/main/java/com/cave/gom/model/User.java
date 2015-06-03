package com.cave.gom.model;

/**
* Created by sleepbear on 2015-05-31.
*/
public class User {
    private String id;
    private String name;
    private String password;
    private String type;

    public User() {
    }

    public User(String id, String name, String password, String type) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getType() {
        return type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isSeller() {
        return type.equals("seller") ? true : false;
    }

    public boolean isBuyer() {
        return type.equals("buyer") ? true : false;
    }
}
