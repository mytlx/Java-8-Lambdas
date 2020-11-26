package com.mytlx.exercise.chapter8.command;

/**
 * @author TLX
 * @version 1.0.0
 * @date 2020.11.26 9:37
 */
public class Save implements Action {

    public final Editor editor;

    public Save(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void perform() {
        editor.save();
    }
}
