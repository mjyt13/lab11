package com.example.sadanie_11_4;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Random;
public class sadanie_11_4 extends Application{
    private TextArea resultTextArea;
    @Override
    public void start(Stage primar){
        primar.setTitle("Генератор чисел");
        Button genBut = new Button("Сгенерировать");
        genBut.setOnAction(I -> {
            Random r = new Random();
            String P="";
            for (int i = 0; i < 7; i++) {
                int rnum = r.nextInt();
                String S = Integer.toString(rnum);
                S = S + "\n";
                P+=S;
            }
            resultTextArea.setText(P);
        });
        resultTextArea = new TextArea();
        resultTextArea.setEditable(false);
        VBox VB = new VBox(10);
        VB.setPadding(new Insets(10));
        VB.getChildren().addAll(genBut, resultTextArea);
        Scene sc = new Scene(VB, 400, 200);
        primar.setScene(sc);
        primar.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}