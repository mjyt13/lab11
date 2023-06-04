package com.example.sadanie_11_4;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class sadanie_11_3 extends Application{
    TextField FTF;
    TextField TTF;
    Button button;
    LineChart<Number, Number> lineChart;
    @Override
    public void start(Stage prime){
        prime.setTitle("График функции f");
        NumberAxis x = new NumberAxis();
        NumberAxis y = new NumberAxis();
        lineChart = new LineChart<>(x,y);
        Label FL = new Label ("От");
        Label TL = new Label ("До");
        FTF = new TextField();
        TTF = new TextField();
        button = new Button("Построить");
        button.setOnAction(I ->{
            double fr = Double.parseDouble(FTF.getText());
            double to = Double.parseDouble(TTF.getText());
            XYChart.Series<Number, Number> series = new XYChart.Series<>();
            series.setName("График этой функции");
            for(double xx = fr; xx<=to; xx+=0.01){
                double yy = Math.pow(xx,2)+Math.pow(Math.cos(xx)+Math.pow(Math.cos(xx),2),2);
                series.getData().add(new XYChart.Data<>(xx,yy));
            }
            lineChart.getData().clear();
            lineChart.setCreateSymbols(false);
            lineChart.getData().add(series);
        });
        HBox IP = new HBox(15);
        IP.setAlignment(Pos.CENTER);
        IP.getChildren().addAll(FL,FTF,TL,TTF,button);
        VBox MP = new VBox(15);
        MP.setPadding(new Insets(15));
        MP.getChildren().addAll(IP, lineChart);
        Scene sc = new Scene(MP, 800, 600);
        prime.setScene(sc);
        prime.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
