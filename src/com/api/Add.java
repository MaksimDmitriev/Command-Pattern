package com.api;

/**
 * Created by admin on 27/06/2017.
 */
public class Add implements Command {

    private final String text;

    Add(String text) {
        this.text = text;
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
