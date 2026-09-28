import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXDemo extends Application {

    public void start(Stage stage) {

        Label label = new Label("Enter your name:");
        TextField name = new TextField();
        Button button = new Button("Greet Me");
        Label output = new Label();

        button.setOnAction(e -> {
            output.setText("Hello, " + name.getText() + "!");
        });

        VBox box = new VBox(10);
        box.setAlignment(Pos.CENTER);
        box.getChildren().addAll(label, name, button, output);

        Scene scene = new Scene(box, 350, 200);

        stage.setTitle("JavaFX Demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}