package com.wen.controller.task;

import com.wen.common.AlertUtil;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;




/**
 * Created by wenfeng on 2018/4/17.
 */
public class CreateTaskController {
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    @FXML
    public void createTask(ActionEvent event){
        AlertUtil.SuccessMessage(username.getText());
    }
}
