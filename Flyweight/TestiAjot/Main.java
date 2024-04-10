package Flyweight.TestiAjot;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            FlowPane pane = new FlowPane();
            pane.setBorder(BorderFactory.INSTANCE.getBorder());

            pane.setVgap(6);
            pane.setHgap(5);
            pane.setPrefWrapLength(2);

            Button startButton = new Button("Start");
            Button reset = new Button("Reset");
            TextField text = new TextField("Jännitystä!");
            Button first = new Button("1");
            Button second = new Button("2");

            pane.getChildren().add(startButton);
            pane.getChildren().add(reset);
            pane.getChildren().add(text);
            pane.getChildren().add(first);
            pane.getChildren().add(second);

            first.setOnAction(e -> {
                if (first.getBorder() != BorderFactory.INSTANCE.getBorder()) {
                    first.setBorder(BorderFactory.INSTANCE.getBorder());
                } else {
                    first.setBorder(null);
                }
            });

            second.setOnAction(e -> {
                if (second.getBorder() != BorderFactory.INSTANCE.getBorder()) {
                    second.setBorder(BorderFactory.INSTANCE.getBorder());
                } else {
                    second.setBorder(null);
                }
            });

            startButton.setOnAction(e -> {
                text.setText("Samat kehykset? " + (first.getBorder() == second.getBorder()));
            });

            reset.setOnAction(e -> {
                first.setBorder(null);
                second.setBorder(null);
                text.setText("Jännitystä!");
            });

            primaryStage.setTitle("Border flyweights");
            Scene scene = new Scene(pane, 500, 200);
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
