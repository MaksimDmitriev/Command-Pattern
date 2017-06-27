package com.api;

/**
 * Created by admin on 27/06/2017.
 */
public interface Command {

    void execute();

    void undo();
}
