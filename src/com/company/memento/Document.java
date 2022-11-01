package com.company.memento;

/**
 * This is originator class in memento pattern and responsible for creating and restoring the document state.
 * We can set the font name, size and text content to document. It also allow us to do multiple undo, if there is
 * nothing in undo stack it will reset the document state to default.
 * */
public class Document {

    private final String DEFAULT_FONT_NAME = "Calibre";
    private final int DEFAULT_FONT_SIZE = 8;
    private String content = "";
    private String fontName = DEFAULT_FONT_NAME;
    private int fontSize = DEFAULT_FONT_SIZE;
    private final History history = new History(); // This violates the single responsibility principle as Document is maintaning history.


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        history.push(createState());
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
        history.push(createState());
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
        history.push(createState());
    }

    private DocumentState createState() {
        return new DocumentState(content, fontSize, fontName);
    }

    private void restoreState(DocumentState state) {
        this.content = state.content();
        this.fontName = state.fontName();
        this.fontSize = state.fontSize();
    }

    public void undo() {
        var lastState =(DocumentState) history.pop();
        if (lastState != null){
            restoreState(lastState);
        } else{
            this.content = "";
            this.fontName = DEFAULT_FONT_NAME; // Default font name
            this.fontSize = DEFAULT_FONT_SIZE; // Default font size
        }
    }

    public String getCurrentDocument(){
        return this.toString();
    }

    public History getHistory(){
        return history;
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }
}