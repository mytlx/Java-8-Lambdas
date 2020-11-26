package com.mytlx.exercise.chapter8.command;

import org.junit.jupiter.api.Test;

/**
 * @author TLX
 * @version 1.0.0
 * @date 2020.11.26 14:07
 */

public class Main {

    /**
     * 命令模式：传统方式
     */
    @Test
    public void test01() {
        Editor editor = new NotepadEditor();
        Macro macro = new Macro();
        macro.record(new Open(editor));
        macro.record(new Save(editor));
        macro.record(new Close(editor));
        macro.run();
    }

    /**
     * 命令模式：lambda
     */
    @Test
    public void test02() {
        Editor editor = new NotepadEditor();
        Macro macro = new Macro();
        macro.record(() -> editor.open());
        macro.record(() -> editor.save());
        macro.record(() -> editor.close());
        macro.run();
    }

    /**
     * 命令模式：函数引用
     */
    @Test
    public void test03() {
        Editor editor = new NotepadEditor();
        Macro macro = new Macro();
        macro.record(editor::open);
        macro.record(editor::save);
        macro.record(editor::close);
        macro.run();
    }

}
