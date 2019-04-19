package com.app.astron.ui;

public interface UiInformableCallback<T> extends UiCallback<T> {
    void inform(String text);
}
