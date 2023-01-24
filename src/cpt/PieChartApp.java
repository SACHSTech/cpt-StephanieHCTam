package cpt;

// Import statements
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

// Checkbox imports
import javafx.scene.control.CheckBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

import java.util.Arrays;
import java.util.*;
import java.io.*;

// checkbox for years 2010, 2012, 2014, 2016, 2018

public class PieChartApp extends Application {

    private PieChart chart;

    private int totalDeaths;

    // chart title: Deaths Caused by Vaccine Preventable Diseases in the World

    // ArrayList<DataReader> country1 = DataInteraction.countryName("Canada");

/* 
    for (int i = 0, i < 10; i++){
        public static ObservableList<PieChart.Data> generateData = FXCollections.observableArrayList(newPieChart.Data());
    }
*/
    static String[] diseaseList = {"Tuberculosis", "Whooping Cough", "Meningitis"};

    /* 
    public static ObservableList<PieChart.Data> generateData() {
        for(int i = 0; i < diseaseList.length; i++){
                //new PieChart.Data("Tuberculosis", 74),
                //new PieChart.Data("Whooping Cough", 8),
                //new PieChart.Data(diseaseList.get(i), 2);
            }
        return FXCollections.observableArrayList();
    }
    */

    public static ObservableList<PieChart.Data> generateData() {
        return FXCollections.observableArrayList(
                new PieChart.Data("Tuberculosis", 74),
                new PieChart.Data("Whooping Cough", 8),
                new PieChart.Data("Meningitis", 2));
    }

    public Parent PieChart() throws IOException{
        chart = new PieChart(generateData());
        chart.setClockwise(false);
        return chart;
    }

    /* 
    private void handleOptions(CheckBox box1, CheckBox box2, CheckBox box3, CheckBox box4, CheckBox box5){

        if(box1.isSelected()) chart.getData().add(series1);
        else chart.getData().remove(series1);
        if(box2.isSelected()) chart.getData().add(series2);
        else chart.getData().remove(series2);
        if(box3.isSelected()) chart.getData().add(series3);
        else chart.getData().remove(series3);
        if(box4.isSelected()) chart.getData().add(series4);
        else chart.getData().remove(series4);
        if(box5.isSelected()) chart.getData().add(series5);
        else chart.getData().remove(series5);
    }
    */


    @Override public void start(Stage primaryStage) throws IOException {
        primaryStage.setScene(new Scene(PieChart()));
        primaryStage.show();

        /* 
        CheckBox box1 = new CheckBox("2000");
        CheckBox box2 = new CheckBox("2012");
        CheckBox box3 = new CheckBox("2014");
        CheckBox box4 = new CheckBox("2016");
        CheckBox box5 = new CheckBox("2018");

        //Layout
        VBox vbox = new VBox();
        vbox.setSpacing(10);
        */
    }


    /**
     * Java main for when running without JavaFX launcher
     * @param args command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    /* 

    private static double normalizeAngle(double angle) {
        double a = angle % 360;
        if (a <= -180) {
            a += 360;
        }
        if (a > 180) {
            a -= 360;
        }
        return a;
    }
    */


}
