package com.company.memento;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * This class works are memento which is nothing but state of editor/originator.
 * */
public final class DocumentState implements Memento{
    private final String content;
    private final int fontSize;
    private final String fontName;

    public DocumentState(String content, int fontSize, String fontName) {
        this.content = content;
        this.fontSize = fontSize;
        this.fontName = fontName;
    }

    public String content() {
        return content;
    }

    public int fontSize() {
        return fontSize;
    }

    public String fontName() {
        return fontName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (DocumentState) obj;
        return Objects.equals(this.content, that.content) &&
                this.fontSize == that.fontSize &&
                Objects.equals(this.fontName, that.fontName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, fontSize, fontName);
    }

    @Override
    public String toString() {
        return "DocumentState[" +
                "content=" + content + ", " +
                "fontSize=" + fontSize + ", " +
                "fontName=" + fontName + ']';
    }

    @Override
    public String getDocumentName() {
        return "Document-snapshot-"+ LocalDateTime.now();
    }
}


