package com.wen.controller.task;

import com.wen.common.AlertUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;




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
