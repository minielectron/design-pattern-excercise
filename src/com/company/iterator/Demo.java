package com.company.iterator;

import java.util.List;
import java.util.function.Consumer;

public class Demo {
    public static void main(String[] args) {
        Products products = new Products();
        products.add(new Product(1,"Sony"));
        products.add(new Product(2,"Samsung"));
        products.add(new Product(3,"HP"));
        products.add(new Product(4,"Dell"));
        List<Product> storedProducts = products.getProducts();
        storedProducts.forEach(new ProductConsumer());

        ProductCollection collection = new ProductCollection();
        collection.add(new Product(1,"Television"));
        collection.add(new Product(2,"Keyboard"));
        collection.add(new Product(3,"Laptop"));
        collection.add(new Product(4,"Mobile"));

        var iterator = collection.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}

class ProductConsumer implements Consumer<Product> {

    @Override
    public void accept(Product product) {
        System.out.println(product.toString());
    }

    @Override
    public Consumer<Product> andThen(Consumer<? super Product> after) {
        return Consumer.super.andThen(after);
    }
}