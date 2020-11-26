package com.mytlx.exercise.chapter8.command;

/**
 * @author TLX
 * @version 1.0.0
 * @date 2020.11.26 14:03
 */
public class Close implements Action {

    private final Editor editor;

    public Close(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void perform() {
        editor.close();
    }
}
