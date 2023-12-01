package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
//	@Override
//	public void start(Stage primaryStage) throws Exception {

//		Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
//		Scene scene = new Scene(root);
//		primaryStage.setTitle("My Title");
//		primaryStage.setScene(scene);
//		primaryStage.show();

//		Label helloLabel = new Label("Hello, World!");
//
//		StackPane root = new StackPane();
//		root.getChildren().add(helloLabel);
//
//		Scene scene = new Scene(root, 300, 200);
//
//		primaryStage.setTitle("JavaFX Hello World");
//		primaryStage.setScene(scene);
//
//		primaryStage.show();
//	}

//		Button btn = new Button();
//		btn.setText("Say 'Hello World'");
//		btn.setOnAction(new EventHandler<ActionEvent>() {
//
//			@Override
//			public void handle(ActionEvent event) {
//				System.out.println("Hello World!");
//			}
//		});
//
//		StackPane root = new StackPane();
//		root.getChildren().add(btn);
//
//		Scene scene = new Scene(root, 300, 250);
//
//		primaryStage.setTitle("Hello World!");
//		primaryStage.setScene(scene);
//		primaryStage.show();

//	}

	@Override
	public void start(Stage primaryStage) {
		try {
			// Load the FXML file
			Parent root = FXMLLoader.load(getClass().getResource("/Main.fxml"));

			// Create a scene with the loaded FXML content
			Scene scene = new Scene(root, 400, 400);

			// Add the CSS stylesheet if needed
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			// Set the scene to the primary stage
			primaryStage.setScene(scene);

			// Set the title of the window
			primaryStage.setTitle("JavaFX Hello World");

			// Show the window
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
