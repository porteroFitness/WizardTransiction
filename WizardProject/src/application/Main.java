package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * 
 * @author Sergy
 * @version 1.0
 * @see TranslationController
 *
 */
public class Main extends Application {
	
	Stage stage;

	@Override
	public void start(Stage primaryStage) {
		try {
			stage = primaryStage;
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Wizardvista.fxml"));
			AnchorPane pane = loader.load();
			stage.initStyle(StageStyle.UNDECORATED);
			stage.setScene(new Scene(pane));
			stage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}