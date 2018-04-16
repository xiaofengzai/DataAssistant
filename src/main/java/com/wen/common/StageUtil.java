package com.wen.common;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

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
    public void showStage() throws IOException {
        Parent target = FXMLLoader.load(getClass().getResource("B.fxml"));
        Scene scene = new Scene(target); //创建场景；
        Stage stg=new Stage();//创建舞台；
        stg.setScene(scene); //将场景载入舞台；
        stg.show();
    }
}
