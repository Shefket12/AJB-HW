package com.example.assignment02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;

public class Assignment02 extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        var root = new BorderPane();
        stage.setTitle("Code3MersFX!");

        // Init the Textfield, where the DNA-string will be put in and the textarea, to display result later
        TextField input =new TextField();
        var output = new TextArea();
        root.setTop(input);
        root.setCenter(output);

        // Init the Vertical Box with it's ToggleButtons and their respective functions
        VBox vbox = new VBox(8); // spacing = 8
        var show = new Label("Show");
        var codes = new ToggleButton("Codes");
        var threeMers = new ToggleButton("3Mers");
        var counts = new ToggleButton("Counts");
        vbox.getChildren().addAll(show, codes, threeMers, counts);

        var codesSelected = codes.isSelected();
        var threeMersSelected = threeMers.isSelected();
        var countsSelected = counts.isSelected();

        // Init the Horizontal Box with it's ToggleButtons and their respective functions
        HBox hbox = new HBox(8); // spacing = 8
        Button clear = new Button("Clear");
        clear.setOnAction(e -> {
            input.clear();
            output.clear();} );
        Button analyze = new Button("Analyze");
        // Computes the 3Mers and their values, when the Button is pressed
        analyze.setOnAction(e -> {


        });
        Button quit = new Button("Quit");
        quit.setOnAction(e -> System.exit(0));
        hbox.getChildren().addAll(clear, analyze, quit);


        root.setRight(vbox);
        root.setBottom(hbox);

        var scene = new Scene(root, 300, 300);

        stage.setScene(scene);
        stage.show();
        //FXMLLoader fxmlLoader = new FXMLLoader(Assignment02.class.getResource("hello-view.fxml"));
        /*var root = new BorderPane();

        root.getChildren().addAll(label1, input);

        var scene =new Scene(root, 300, 300);
        stage.setScene(scene);
        stage.show();*/
    }

    public static void main(String[] args) {
        launch();
    }
}