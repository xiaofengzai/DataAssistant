package com.wen.Button;

import javafx.scene.control.Button;

/**
 * Created by wenfeng on 2018/4/16.
 */
public interface Observer<T extends Button> {
    public void update(T button,String message);
}
