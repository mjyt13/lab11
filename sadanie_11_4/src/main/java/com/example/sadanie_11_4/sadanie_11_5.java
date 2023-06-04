package com.example.sadanie_11_4;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import static java.lang.Math.*;
public class sadanie_11_5 extends Application {
    private LineChart<Number, Number> lineChart;

    public sadanie_11_5() {
    }

    @Override
    public void start(Stage prima) {
        prima.setTitle("График попадания точки в область");
        NumberAxis xA = new NumberAxis();
        NumberAxis yA = new NumberAxis();
        lineChart = new LineChart<>(xA, yA);
        VBox main = new VBox(20);
        main.setPadding(new Insets(20));
        main.getChildren().add(lineChart);
        XYChart.Series<Number, Number> ser1 = new XYChart.Series<>();
        ser1.setName("1 Серия");
        for (double x = -3; x <= -1; x += 0.005) {
            double y = sqrt(4-pow(x+1,2)) + 1;
            ser1.getData().add(new XYChart.Data<>(x, y));
        }
        XYChart.Series<Number, Number> ser2 = new XYChart.Series<>();
        ser2.setName("2 Серия");
        for (double x = -3; x <= 1; x += 0.005) {
            double y = 1;
            ser2.getData().add(new XYChart.Data<>(x, y));
        }
        XYChart.Series<Number, Number> ser3 = new XYChart.Series<>();
        ser3.setName("3 Серия");
        for (double x = -2; x <= -1; x += 0.005) {
            double y = 2*x+1;
            ser3.getData().add(new XYChart.Data<>(x, y));
        }
        XYChart.Series<Number, Number> ser4 = new XYChart.Series<>();
        ser4.setName("4 Серия");
        for (double x = -1; x <= 1; x += 0.005) {
            double y = -sqrt(4-pow(x+1,2))+1;
            ser4.getData().add(new XYChart.Data<>(x, y));
        }
        XYChart.Series<Number, Number> ser5 = new XYChart.Series<>();
        ser5.setName("5 Серия");
        for (double x = -1; x <= 0; x += 0.005) {
            double y = 2*x+5;
            ser5.getData().add(new XYChart.Data<>(x, y));
        }
        XYChart.Series<Number, Number> ser6 = new XYChart.Series<>();
        ser6.setName("6 Серия");
        for (double x = -2; x <= 3; x += 0.01) {
            double y = (4/5.0)*x-(7/5.0);
            ser6.getData().add(new XYChart.Data<>(x, y));
        }
        XYChart.Series<Number, Number> ser7 = new XYChart.Series<>();
        ser7.setName("7 Серия");
        for (double x = 0; x <= 2; x += 0.005) {
            double y = (-1/2.0)*x+5;
            ser7.getData().add(new XYChart.Data<>(x, y));
        }
        XYChart.Series<Number, Number> ser8 = new XYChart.Series<>();
        ser8.setName("8 Серия");
        for (double x = 2; x <= 3; x += 0.005) {
            double y = -3 * x + 10;
            ser8.getData().add(new XYChart.Data<>(x, y));
        }
        XYChart.Series<Number, Number> ser9 = new XYChart.Series<>();
        ser9.setName("9 Серия");
        for (double x = 2; x <= 4; x += 0.005) {
            double y = x-3;
            ser9.getData().add(new XYChart.Data<>(x, y));
        }
        XYChart.Series<Number, Number> ser10 = new XYChart.Series<>();
        ser10.setName("10 Серия");
        for (double x = 2; x <= 4; x += 0.005) {
            double y = -Math.sqrt(4-pow(x-4,2)) - 1;
            ser10.getData().add(new XYChart.Data<>(x, y));
        }
        XYChart.Series<Number, Number> ser11 = new XYChart.Series<>();
        ser11.setName("11 Серия");
        for (double x = 4; x <= 6; x += 0.005) {
            double y = Math.sqrt(4-pow(x-4,2)) - 1;
            ser11.getData().add(new XYChart.Data<>(x, y));
        }
        XYChart.Series<Number, Number> ser12 = new XYChart.Series<>();
        ser12.setName("12 Серия");
        for (double x = 4; x <= 5; x += 0.005) {
            double y = -x+1;
            ser12.getData().add(new XYChart.Data<>(x, y));
        }
        XYChart.Series<Number, Number> ser13 = new XYChart.Series<>();
        ser13.setName("13 Серия");
        for (double x = 6; x <= 7; x += 0.005) {
            double y = -2*x+11;
            ser13.getData().add(new XYChart.Data<>(x, y));
        }
        XYChart.Series<Number, Number> ser14 = new XYChart.Series<>();
        ser14.setName("14 Серия");
        for (double x = 5; x <= 7; x += 0.01) {
            double y = (1/2.0)*x-(13/2.0);
            ser14.getData().add(new XYChart.Data<>(x, y));
        }
        lineChart.getData().clear();
        lineChart.setCreateSymbols(false);
        lineChart.getData().addAll(ser1, ser2, ser3, ser4, ser5,
                ser6, ser7, ser8, ser9, ser10,
                ser11, ser12, ser13, ser14);

        Scene sc = new Scene(main, 450, 550);
        prima.setScene(sc);
        prima.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}