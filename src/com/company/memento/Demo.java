package com.company.memento;

public class Demo {
    public static void main(String[] args) {
        Document document = new Document();
        document.setContent("This is first line"); // First memento
        document.setFontName("Font 1"); // Second Memento
        printState(document); // Document{content='This is first line', fontName='Font 1', fontSize=8}
        document.undo(); // Undoing font changes
        printState(document); // Document{content='This is first line', fontName='Calibre', fontSize=8}
        document.undo(); // Undoing content changes
        printState(document); // Sets to default --> Document{content='', fontName='Calibre', fontSize=8}
    }

    static void printState(Document document){
        System.out.println(document);
    }
}
