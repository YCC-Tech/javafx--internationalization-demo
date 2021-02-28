package application;

import java.util.Locale;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import jfxtras.styles.jmetro.JMetro;
import jfxtras.styles.jmetro.Style;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.initStyle(StageStyle.UNDECORATED);
			
			Locale currentLocale = Locale.getDefault();
			
			Locale locale = new Locale("ja_JP");
			ResourceBundle bundle = ResourceBundle.getBundle("resources.languages.langs", locale);

			AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("Sample.fxml"), bundle);
			Scene scene = new Scene(root);

//			JMetro jMetro = new JMetro(Style.LIGHT);
//			jMetro.setScene(scene);

			// Font.loadFont(getClass().getResourceAsStream("/src/resources/fonts/cerebrisans-medium.ttf"), 14);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
