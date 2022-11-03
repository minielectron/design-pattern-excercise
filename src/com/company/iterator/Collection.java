package com.company.iterator;

public interface Collection {
    void add(Product product);
    ProductCollection.ProductIterator getIterator();
}
