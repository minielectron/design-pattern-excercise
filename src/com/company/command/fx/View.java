package com.company.command.fx;

public class View {
    private ListenerInfo listenerInfo;

    public void setOnClickListener(OnViewClickListener clickListener) {
        getListenerInfo().clickListener = clickListener;
    }

    public void setOnLongPressListener(OnViewLongPressListener longPressListener) {
        getListenerInfo().longPressListener = longPressListener;
    }

    protected ListenerInfo getListenerInfo(){
        if (listenerInfo == null){
            listenerInfo = new ListenerInfo();
            return  listenerInfo;
        }
        return listenerInfo;
    }

    public void onClick(){
        var clickListener = getListenerInfo().clickListener;
        if (clickListener != null) {
            clickListener.onClick();
        }
    }

    public void onLongPress(){
        var longPressListener = getListenerInfo().longPressListener;
        if (longPressListener != null){
            longPressListener.onLongPress();
        }
    }

}


