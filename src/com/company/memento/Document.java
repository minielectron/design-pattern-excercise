package com.company.memento;

/*
* In the Exercises project, look at the code in the memento/Document
class. This class represents a document in a word processor like MS
Word or Apple Pages.
Our Document class has three attributes:
- content
- fontName
- fontSize
We should allow the user to undo the changes to any of these
attributes. In the future, we may add additional attributes in this
class and these attributes should also be undoable.
Implement the undo feature using the memento pattern.
* */

public class Document {

    private String content;
    private String fontName;
    private int fontSize;
    private final History history = new History();


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
        this.content = state.getContent();
        this.fontName = state.getFontName();
        this.fontSize = state.getFontSize();
    }

    public void undo() {
        var lastState = history.pop();
        if (lastState != null)
            restoreState(lastState);
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