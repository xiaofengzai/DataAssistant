//package com.wen.Button;
//
//import com.wen.OperationTypeEnum;
//import javafx.scene.control.Button;
//
///**
// * Created by wenfeng on 2018/4/16.
// */
//public class MyOperationButton implements Observer{
//    private OperationTypeEnum operationTypeEnum;
//    private Button button;
//    public MyOperationButton(Button button, OperationTypeEnum operationTypeEnum){
//        this.button=button;
//        this.operationTypeEnum=operationTypeEnum;
//    }
//    public OperationTypeEnum getOperationTypeEnum() {
//        return operationTypeEnum;
//    }
//
//    public void setOperationTypeEnum(OperationTypeEnum operationTypeEnum) {
//        this.operationTypeEnum = operationTypeEnum;
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
//    public void update(OperationTypeEnum message) {
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
