package com.company.mediator;

public class Button extends UIControl{
    private Boolean isEnabled;

    public Button(DialogBox owner) {
        super(owner);
    }

    public Boolean getEnabled() {
        return isEnabled;
    }

    public void setEnabled(Boolean enabled) {
        isEnabled = enabled;
    }
}
