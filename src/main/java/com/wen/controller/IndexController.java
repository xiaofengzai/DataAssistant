package com.wen.controller;

import com.wen.Button.MyButton;
import com.wen.Button.OperationChangeServer;
import com.wen.OperationTypeEnum;
import com.wen.StageTypeEnum;
import com.wen.TaskTypeEnum;
import com.wen.common.BusinessException;
import com.wen.common.EnumUtils;
import com.wen.common.StageUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import org.springframework.util.StringUtils;

import java.util.List;


/**
 * Created by wenfeng on 2018/4/13.
 */
public class IndexController {
    @FXML
    private TextField operation;
    @FXML
    private HBox operationGroup;
    @FXML
    private HBox taskOperationGroup;

    OperationChangeServer server = null;
    OperationChangeServer taskServer = null;
    private void  beforeClick(){
        if(server !=null && !server.isEmpty())
            return;
        List<Node> list=operationGroup.getChildren();
        server=new OperationChangeServer();
        list.stream().forEach(a->{
            Button button=(Button)a;
            server.registerObserver(new MyButton(button));
        });
    }

    private void  beforeClickTaskOperation(){
        if(taskServer !=null && !taskServer.isEmpty())
            return;
        List<Node> list=taskOperationGroup.getChildren();
        taskServer=new OperationChangeServer();
        list.stream().forEach(a->{
            Button button=(Button)a;
            taskServer.registerObserver(new MyButton(button));
        });
    }

    @FXML
    public void chooseOperationType(ActionEvent event){
        beforeClick();
        Button button=(Button) event.getSource();
        String buttonText=button.getText();
        OperationTypeEnum operationTypeEnum= EnumUtils.toEnum(buttonText,OperationTypeEnum.class);
        server.notifyObserver(button,"");
        operation.setText(operationTypeEnum.getValue().toString());
    }

    @FXML
    public void chooseTaskOperationType(ActionEvent event){
        String operationCode=operation.getText();
        if(StringUtils.isEmpty(operationCode))
            throw new BusinessException("请选择业务模块");
        beforeClickTaskOperation();
        Button button=(Button) event.getSource();
        String buttonText=button.getText();
        TaskTypeEnum taskTypeEnum= EnumUtils.toEnum(buttonText,TaskTypeEnum.class);
        taskServer.notifyObserver(button,"");
        OperationTypeEnum operationTypeEnum=EnumUtils.toEnum(Integer.valueOf(operationCode),OperationTypeEnum.class);
        StageTypeEnum stageTypeEnum=StageTypeEnum.getStageTypeEnumByOperationAndTaskType(operationTypeEnum,taskTypeEnum);
        new StageUtil().showStage(stageTypeEnum);
        //弹窗
    }

}
