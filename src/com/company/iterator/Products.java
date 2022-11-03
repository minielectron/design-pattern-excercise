package com.company.iterator;

import java.util.ArrayList;
import java.util.List;

public class Products {

    private List<Product> products = new ArrayList<>();

    void add(Product product){
        products.add(product);
    }

    public List<Product> getProducts(){
        return this.products;
    }
}
