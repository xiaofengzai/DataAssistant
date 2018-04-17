package com.wen.Button;

import javafx.scene.control.Button;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wenfeng on 2018/4/16.
 */
public class OperationChangeServer implements Observerable {

    //注意到这个List集合的泛型参数为Observer接口，设计原则：面向接口编程而不是面向实现编程
    private List<Observer> list;

    public OperationChangeServer() {
        list = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {

        list.add(o);
    }

    public void removeObserver(Observer o) {
        if(!list.isEmpty())
            list.remove(o);
    }

    @Override
    public void registerObserver(java.util.Observer o) {

    }

    @Override
    public void removeObserver(java.util.Observer o) {

    }

    //遍历
    @Override
    public <T extends Button> void notifyObserver(T button,String message) {
        for(int i = 0; i < list.size(); i++) {
            Observer observer = list.get(i);
            observer.update(button,message);
        }
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

}
