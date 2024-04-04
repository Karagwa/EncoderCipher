import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CipherGUI extends Application {
    private SubstitutionCipher cipher;

    @Override
    public void start(Stage primaryStage) {
        cipher = new SubstitutionCipher(3); // replace with desired shift

        TextField textField = new TextField();
        Button encodeButton = new Button("Encode");
        TextArea textArea = new TextArea();
        textArea.setEditable(false);

        encodeButton.setOnAction(e -> {
            String plainText = textField.getText();
            String encoded = cipher.encode(plainText);
            textArea.appendText(encoded + "\n");
            textField.clear();
        });

        VBox vbox = new VBox(10, textField, encodeButton, textArea);
        vbox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vbox, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Substitution Cipher");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
