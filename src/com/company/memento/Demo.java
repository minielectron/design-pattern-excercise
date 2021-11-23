package com.company.memento;

public class Demo {
    public static void main(String[] args) {
        Document document = new Document();
        document.setContent("This is first line");
        document.setFontName("Font 1");
        document.undo();
        document.undo();
        System.out.println(document);

    }
}
