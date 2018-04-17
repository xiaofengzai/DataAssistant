package com.wen.Button;

import javafx.scene.control.Button;

import java.util.Observer;

/**
 * Created by wenfeng on 2018/4/16.
 */
public interface Observerable {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public <T extends Button> void notifyObserver(T button,String message);
}
