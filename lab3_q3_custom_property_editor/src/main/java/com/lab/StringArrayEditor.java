package com.lab;

import java.beans.PropertyEditorSupport;

public class StringArrayEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) {
        if (text != null) {
            setValue(text.split(",\s*"));
        }
    }
}
