package com.company.iterator;

public class Demo {
    public static void main(String[] args) {
        ProductCollection collection = new ProductCollection();
        collection.add(new Product(1,"Television"));
        collection.add(new Product(2,"Keyboard"));
        collection.add(new Product(3,"Laptop"));
        collection.add(new Product(4,"Mobile"));

        var iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
