//package com.wen.Button;
//
//import com.wen.OperationTypeEnum;
//import com.wen.TaskTypeEnum;
//import javafx.scene.control.Button;
//
///**
// * Created by wenfeng on 2018/4/16.
// */
//public class MyTaskButton implements Observer{
//    private TaskTypeEnum taskTypeEnum;
//    private Button button;
//    public MyTaskButton(Button button, TaskTypeEnum taskTypeEnum){
//        this.button=button;
//        this.taskTypeEnum=taskTypeEnum;
//    }
//    public TaskTypeEnum getTaskTypeEnum() {
//        return taskTypeEnum;
//    }
//
//    public void setTaskTypeEnum(TaskTypeEnum TaskTypeEnum) {
//        this.taskTypeEnum = taskTypeEnum;
//    }
//
//    public void updateOperationAndColor(){
//
//    }
//
//    public Button getButton() {
//        return button;
//    }
//
//    public void setButton(Button button) {
//        this.button = button;
//    }
//
//    @Override
//    public void update(TaskTypeEnum message) {
//        if(isActive(button)){
//            if(!this.operationTypeEnum.equals(message)){
//                this.button.getStyleClass().remove("SelectedButton");
//                this.button.getStyleClass().add("UnSelectedButton");
//
//            }
//        }else{
//            if(this.operationTypeEnum.equals(message)){
//                this.button.getStyleClass().remove("UnSelectedButton");
//                this.button.getStyleClass().add("SelectedButton");
//
//            }
//        }
//    }
//
//    private Boolean isActive(Button button){
//        return this.button.getStyleClass().contains("SelectedButton");
//    }
//}
//
