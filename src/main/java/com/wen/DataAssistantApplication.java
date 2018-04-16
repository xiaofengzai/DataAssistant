package com.wen;

import com.wen.Button.OperationChangeServer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.CompletableFuture;

@SpringBootApplication
public class DataAssistantApplication extends Application {
	public static ConfigurableApplicationContext applicationContext;

	@Override
	public void init() throws Exception {
		CompletableFuture.supplyAsync(() -> {
			ConfigurableApplicationContext ctx = SpringApplication.run(this.getClass());
			return ctx;
		}).thenAccept(this::launchApplicationView);
//        Main.applicationContext = SpringApplication.run(this.getClass());
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("index.fxml"));
		primaryStage.setTitle("数据处理助手");
		Scene scene=new Scene(root, 800, 600);
		scene.getStylesheets().add("ui.css");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();



		primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
			@Override
			public void handle(WindowEvent event) {
				//释放资源（文件，数据库链接，http链接，文件）
				//System.out.print("监听到窗口关闭");
			}
		});
	}

	private void launchApplicationView(ConfigurableApplicationContext ctx) {
		DataAssistantApplication.applicationContext = ctx;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
