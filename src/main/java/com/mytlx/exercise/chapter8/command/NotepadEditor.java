package com.mytlx.exercise.chapter8.command;

/**
 * @author TLX
 * @version 1.0.0
 * @date 2020.11.26 14:11
 */
public class NotepadEditor implements Editor {
    @Override
    public void save() {
        System.out.println("调用了save方法");
    }

    @Override
    public void open() {
        System.out.println("调用了open方法");
    }

    @Override
    public void close() {
        System.out.println("调用了close方法");
    }
}
