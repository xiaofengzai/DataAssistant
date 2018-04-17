package com.wen.common;

import com.wen.StageTypeEnum;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wenfeng on 2018/4/16.
 */
public class StageUtil {
//    public static void startNewStage(Stage stage){
//        Platform.runLater(() -> {
//             new WindowEvent().start(new Stage());
//             stage.hide();
//        });
//    }
//
    public static  Map<Integer,Stage> stageMap=new HashMap();
    public static Stage currentStage=null;
    public  void showStage(StageTypeEnum stageTypeEnum)  {
        Stage newStage=null;
        if(stageMap.keySet().contains(stageTypeEnum.getValue())){
            newStage=stageMap.get(stageTypeEnum.getValue());
        }else{
            Parent target = null;
            try {
                target = FXMLLoader.load(getClass().getResource(stageTypeEnum.getResourceLocation()));
                Scene scene = new Scene(target); //创建场景；
                 newStage=new Stage();//创建舞台；
                newStage.setScene(scene); //将场景载入舞台；
                stageMap.put(stageTypeEnum.getValue(),newStage);

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        if(currentStage!=null){
            currentStage.hide();
        }
        newStage.show();
        currentStage=newStage;
    }
}
