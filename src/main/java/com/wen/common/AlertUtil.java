package com.wen.common;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;


public class AlertUtil {
    public static void ErrorMessage(String message){
        Alert error = new Alert(Alert.AlertType.ERROR,message);
        Button err = new Button();
        error.show();
        err.setOnAction((ActionEvent e)->{
            error.showAndWait();
        });
    }

    public static void SuccessMessage(String message){
        Alert information = new Alert(Alert.AlertType.INFORMATION);
        information.setTitle("information"); //设置标题，不设置默认标题为本地语言的information
        information.setHeaderText("Information"); //设置头标题，默认标题为本地语言的information
        information.setContentText(message);
        information.show();
        Button infor = new Button();
        infor.setOnAction((ActionEvent)->{
            information.showAndWait(); //显示弹窗，同时后续代码等挂起
        }) ;
    }
}
