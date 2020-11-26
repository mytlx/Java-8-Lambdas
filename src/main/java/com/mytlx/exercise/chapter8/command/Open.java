package com.mytlx.exercise.chapter8.command;

/**
 * @author TLX
 * @version 1.0.0
 * @date 2020.11.26 14:02
 */
public class Open implements Action {

    private final Editor editor;

    public Open(Editor editor) {
        this.editor = editor;
    }


    @Override
    public void perform() {
        editor.open();
    }
}
