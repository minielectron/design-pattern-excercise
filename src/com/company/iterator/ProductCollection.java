package com.company.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    private final List<Product> products = new ArrayList<>();

    public void add(Product product) {
        this.products.add(product);
    }

    public ProductIterator iterator(){
        return new ProductIterator(this);
    }

    static class ProductIterator implements Iterator{

        private final ProductCollection collection;
        private int count;

        ProductIterator(ProductCollection collection){
            this.collection = collection;
        }

        @Override
        public boolean hasNext() {
            return collection.products.size() > count;
        }

        @Override
        public Product current() {
            return collection.products.get(count);
        }

        @Override
        public void next() {
            count++;
        }
    }
}

