package com.company.memento;

public class DocumentState {
    private final String content;
    private final int fontSize;
    private final String fontName;

    public DocumentState(String content, int fontSize, String fontName) {
        this.content = content;
        this.fontSize = fontSize;
        this.fontName = fontName;
    }

    public String getContent() {
        return content;
    }

    public int getFontSize() {
        return fontSize;
    }

    public String getFontName() {
        return fontName;
    }
}

