package com.mytlx.exercise.chapter8.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TLX
 * @version 1.0.0
 * @date 2020.11.26 14:04
 */
public class Macro {

    private final List<Action> actions;

    public Macro() {
        actions = new ArrayList<>();
    }

    public void record(Action action) {
        actions.add(action);
    }

    public void run() {
        actions.forEach(Action::perform);
    }
}
