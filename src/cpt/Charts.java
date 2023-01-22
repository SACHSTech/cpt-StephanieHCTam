package cpt;

// Import statements

import java.util.*;
import java.io.*;

import java.util.Arrays;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.PieChart.Data;
import javafx.stage.Stage;

public class Charts extends Application {

    private BarChart<Number, String> chart;
    private NumberAxis xAxis;
    private CategoryAxis yAxis;

    public Parent createContent() throws IOException{

        //final 
        String[] years = {"2010", "2012", "2014", "2016", "2018"};

        // Constructor
        DataInteraction DataInteraction = new DataInteraction();

        // Testing ArrayList
        ArrayList<DataReader> listYear = new ArrayList<DataReader>();

        ArrayList<DataReader> country1 = DataInteraction.countryName("Canada");

        //listYear = DataInteraction.yearNum();

        //final ObservableList<String> categories =
            FXCollections.<String>observableArrayList(Arrays.asList(years));
        xAxis = new NumberAxis();
        yAxis = new CategoryAxis();
        chart = new BarChart<>(xAxis, yAxis);
        chart.setTitle("Vaccine Preventable Diseases Deaths");
        yAxis.setLabel("Year");
        //yAxis.setCategories(categories);
        xAxis.setLabel("Deaths");

        
        // series 1: Tuberculosis
        XYChart.Series<Number, String> series1 = new XYChart.Series<>();
        series1.setName("Tuberculosis");

        for(int i = 0; i<country1.size(); i++){
            series1.getData().add(
            new XYChart.Data<Number, String>(country1.get(i).getTuberculosis(), Integer.toString(country1.get(i).getYear())));                
        }

        // series 2: Whooping Cough
        XYChart.Series<Number, String> series2 = new XYChart.Series<>();
        series2.setName("Whooping Cough");
        
            for(int i = 0; i<country1.size(); i++){
                series2.getData().add(
                new XYChart.Data<Number, String>(country1.get(i).getWhoopingCough(), years[i]));                
            }

        // series 3: Meningitis
        XYChart.Series<Number, String> series3 = new XYChart.Series<>();
        series3.setName("Meningitis");

            for(int i = 0; i<country1.size(); i++){
                series3.getData().add(
                new XYChart.Data<Number, String>(country1.get(i).getMeningitis(), years[i]));                
            }

        chart.getData().add(series1);
        chart.getData().add(series2);
        chart.getData().add(series3);
        return chart;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(createContent()));
        primaryStage.show();
    }

    /**
     * Java main for when running without JavaFX launcher
     * @param args command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
