package com.wingled22.listsimple;

public class Product {
    private String Name;
    private String Description;
    private String Price;

    public Product(String name, String description, String price) {
        Name = name;
        Description = description;
        Price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }
}
