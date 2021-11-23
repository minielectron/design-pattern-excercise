package com.company.iterator;

public class Product {
    private final int id;
    private final String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Product{id=" + this.id + ", name='" + this.name + "'}";
    }
}

