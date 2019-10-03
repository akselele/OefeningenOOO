package ui;
import javafx.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;

public class ProductFX extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Input");

        Text text1 = new Text();
        text1.setText("1. Add party item");

        text1.setX(50);
        text1.setY(50);

        Text text2 = new Text();
        text2.setText("2. Remove party item");
        text2.setX(50);
        text2.setY(65);

        Text text3 = new Text();
        text3.setText("3. Rent party item");
        text3.setX(50);
        text3.setY(80);

        Text text4 = new Text();
        text4.setText("4. Return party item");
        text4.setX(50);
        text4.setY(95);

        Text text5 = new Text();
        text5.setText("5. Repair party item");
        text5.setX(50);
        text5.setY(110);

        Text text6 = new Text();
        text6.setText("6. Show available party items");
        text6.setX(50);
        text6.setY(125);

        Text text7 = new Text();
        text7.setText("0. Stop");
        text7.setX(50);
        text7.setY(155);

        Text text8 = new Text();
        text8.setText("Make your choice:");
        text8.setX(50);
        text8.setY(175);

        TextField input = new TextField();
        input.setLayoutX(50);
        input.setLayoutY(185);
        Button buttonOK = new Button("OK");
        buttonOK.setLayoutX(50);
        buttonOK.setLayoutY(215);
        Button buttonCancel = new Button("Cancel");
        buttonCancel.setLayoutX(100);
        buttonCancel.setLayoutY(215);

        Group group = new Group(text1,text2,text3,text4,text5,text6,text7,text8);
        group.getChildren().add(buttonOK);
        group.getChildren().add(buttonCancel);
        group.getChildren().add(input);

        Scene scene = new Scene(group, 600,300);

        buttonOK.setOnAction(e -> {
            Integer value1 = Integer.valueOf(input.getText());
            input.setText("You chose: " + value1.toString());
            input.setEditable(false);
        });

        buttonCancel.setOnAction(e -> {
            System.exit(0);
        });

        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}