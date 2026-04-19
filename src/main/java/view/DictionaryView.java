package view;

import controller.DictionaryController;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class DictionaryView extends Application {

    private DictionaryController controller;

    @Override
    public void init() {
        controller = new DictionaryController();
    }

    @Override
    public void start(Stage stage) {
        Label instructionLabel = new Label("Enter a word:");
        TextField wordField = new TextField();
        wordField.setPrefWidth(200);

        Button searchButton = new Button("Search");

        Label resultLabel = new Label("Meaning will appear here.");
        resultLabel.setWrapText(true);
        resultLabel.setPrefWidth(300);

        FlowPane pane = new FlowPane();
        pane.setHgap(10);
        pane.setVgap(10);
        pane.setPadding(new Insets(15));

        pane.getChildren().addAll(instructionLabel, wordField, searchButton, resultLabel);

        searchButton.setOnAction(event -> {
            String word = wordField.getText();
            String result = controller.searchMeaning(word);
            resultLabel.setText(result);
        });

        Scene scene = new Scene(pane, 350, 180);

        stage.setTitle("Virtual Dictionary");
        stage.setScene(scene);
        stage.show();
    }
}