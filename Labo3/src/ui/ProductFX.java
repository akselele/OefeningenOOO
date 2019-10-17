package ui;

import domain.*;
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
        ProductShopInMemory ps = new ProductShopInMemory();
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

            Stage stage2 = new Stage();
            switch(value1){
                case 1:
                    primaryStage.hide();
                    stage2.show();
                    stage2.setTitle("Add party item");
                    Text textAddItem = new Text();
                    textAddItem.setText("How much does this item cost?");
                    textAddItem.setX(50);
                    textAddItem.setY(50);
                    TextField inputAddItem = new TextField();
                    inputAddItem.setLayoutX(50);
                    inputAddItem.setLayoutY(70);
                    Button buttonAddItem = new Button("OK");
                    buttonAddItem.setLayoutX(50);
                    buttonAddItem.setLayoutY(110);
                    Group group3 = new Group(textAddItem);
                    group3.getChildren().add(inputAddItem);
                    group3.getChildren().add(buttonAddItem);
                    stage2.setScene(new Scene(group3, 600,300));
                    buttonAddItem.setOnAction(e2 -> {
                        Product product = new Product(Double.valueOf(inputAddItem.getText()));
                        ps.addproduct(product);
                        textAddItem.setText("Item added - this is item number " + Integer.valueOf(ps.getAll().size() - 1));
                        inputAddItem.setVisible(false);
                    });
                    break;


                case 2:
                    primaryStage.hide();
                    stage2.show();
                    stage2.setTitle("Remove party item");
                    Text textRemovItem = new Text();
                    textRemovItem.setText("Which item do you want to remove? (ItemID)");
                    textRemovItem.setX(50);
                    textRemovItem.setY(50);
                    TextField inputRemoveItem = new TextField();
                    inputRemoveItem.setLayoutX(50);
                    inputRemoveItem.setLayoutY(70);
                    Button buttonRemoveItem = new Button("OK");
                    buttonRemoveItem.setLayoutX(50);
                    buttonRemoveItem.setLayoutY(110);
                    Group group4 = new Group(textRemovItem);
                    group4.getChildren().add(inputRemoveItem);
                    group4.getChildren().add(buttonRemoveItem);
                    stage2.setScene(new Scene(group4, 600,300));
                    buttonRemoveItem.setOnAction(e2 -> {
                        ps.showProduct(Integer.valueOf(inputRemoveItem.getText())).getState().verwijderen();

                        textRemovItem.setText("Item removed");
                        inputRemoveItem.setVisible(false);
                    });
                    break;



                case 5:
                    primaryStage.hide();
                    stage2.show();
                    stage2.setTitle("Repair party item");
                    Text textChooseRepair = new Text();
                    textChooseRepair.setText("What item do you want to repair? (ItemID)");
                    textChooseRepair.setX(50);
                    textChooseRepair.setY(50);
                    TextField inputChooseRepair = new TextField();
                    inputChooseRepair.setLayoutX(50);
                    inputChooseRepair.setLayoutY(70);
                    Button buttonChooseRepairOK = new Button("OK");
                    buttonChooseRepairOK.setLayoutX(50);
                    buttonChooseRepairOK.setLayoutY(110);
                    Group group2 = new Group(textChooseRepair);
                    group2.getChildren().add(inputChooseRepair);
                    group2.getChildren().add(buttonChooseRepairOK);

                    stage2.setScene(new Scene(group2,600,300));
                    buttonChooseRepairOK.setOnAction(e2 -> {
                        Product product = ps.showProduct(Integer.valueOf(inputChooseRepair.getText()));
                        textChooseRepair.setText("Schadevergoeding: $" + product.getSchadevergoeding());
                        Text t2 = new Text();
                        t2.setX(50);
                        t2.setY(70);
                        t2.setText("Uitleenprijs: $" + product.getUitleenPrijs());
                        group2.getChildren().add(t2);
                        inputChooseRepair.setVisible(false);
                    });
                    break;
            }
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