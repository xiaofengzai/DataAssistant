package com.wen.Button;

import com.wen.common.EnumMessage;
import javafx.scene.control.Button;

/**
 * Created by wenfeng on 2018/4/16.
 */
public class MyButton <T extends Button> implements Observer{
    private Button button;
    public MyButton(Button button){
        this.button=button;
    }


    public void updateOperationAndColor(){

    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    @Override
    public void update(Button clickedButton,String message) {
        if(isActive(button)){
            if(this.button!=clickedButton){
                this.button.getStyleClass().remove("SelectedButton");
                this.button.getStyleClass().add("UnSelectedButton");

            }
        }else{
            if(this.button==clickedButton){
                this.button.getStyleClass().remove("UnSelectedButton");
                this.button.getStyleClass().add("SelectedButton");

            }
        }
    }

    private Boolean isActive(Button button){
        return this.button.getStyleClass().contains("SelectedButton");
    }
}

