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
import javafx.stage.Stage;

public class Charts extends Application {

    private BarChart<Number, String> chart;
    private NumberAxis xAxis;
    private CategoryAxis yAxis;

    public Parent createContent() {

        final String[] years = {"2010", "2012", "2014", "2016", "2018"};
        final ObservableList<String> categories =
            FXCollections.<String>observableArrayList(Arrays.asList(years));
        xAxis = new NumberAxis();
        yAxis = new CategoryAxis();
        chart = new BarChart<>(xAxis, yAxis);
        chart.setTitle("Vaccine Preventable Diseases Deaths");
        yAxis.setLabel("Year");
        yAxis.setCategories(categories);
        xAxis.setLabel("Deaths");

        // add starting data
        XYChart.Series<Number, String> series1 = new XYChart.Series<>();
        series1.setName("Tuberculosis");
        series1.getData().addAll(
                new XYChart.Data<Number, String>(567, years[0]),
                new XYChart.Data<Number, String>(1292, years[1]),
                new XYChart.Data<Number, String>(2180, years[2]),
                new XYChart.Data<Number, String>(2180, years[3]),
                new XYChart.Data<Number, String>(2180, years[4]));

        XYChart.Series<Number, String> series2 = new XYChart.Series<>();
        series2.setName("Whooping Cough");
        series2.getData().addAll(
                new XYChart.Data<Number, String>(956, years[0]),
                new XYChart.Data<Number, String>(1665, years[1]),
                new XYChart.Data<Number, String>(2450, years[2]),
                new XYChart.Data<Number, String>(2180, years[3]),
                new XYChart.Data<Number, String>(2180, years[4]));

        XYChart.Series<Number, String> series3 = new XYChart.Series<>();
        series3.setName("Meningitis");
        series3.getData().addAll(
                new XYChart.Data<Number, String>(800, years[0]),
                new XYChart.Data<Number, String>(1000, years[1]),
                new XYChart.Data<Number, String>(2800, years[2]),
                new XYChart.Data<Number, String>(2180, years[3]),
                new XYChart.Data<Number, String>(2180, years[4]));

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














        /* 

        final String[] years = {"2010", "2012", "2014", "2016", "2018"};

        //DataInteraction DataInteraction = new DataInteraction();
        ArrayList<String> listCountryName = new ArrayList<String>();
        
        //ArrayList<DataReader> year1 = DataInteraction.yearNum(2000);
        //ArrayList<DataReader> year2 = DataInteraction.yearNum(2010);
        //ArrayList<DataReader> year3 = DataInteraction.yearNum(2015);


        //listCountryName = DataInteraction.countryName();

        final ObservableList<String> categories =
            //FXCollections.<String>observableArrayList(Arrays.asList(listCountryName));
            FXCollections.<String>observableArrayList(listCountryName);
        xAxis = new NumberAxis();
        yAxis = new CategoryAxis();
        chart = new BarChart<>(xAxis, yAxis);
        chart.setTitle("Vaccine Preventable Diseases Deaths");
        yAxis.setLabel("Year");
        yAxis.setCategories(categories);
        xAxis.setLabel("Deaths");

        // add starting data
        XYChart.Series<Number, String> series1 = new XYChart.Series<>();

        /* 
        series1.setName("2000");
            for(int i = 0; i<year1.size();i++){
                series1.getData().add(
                new XYChart.Data<Number, String>(year1.get(i).getTuberculosis(), year1.get(i).getCountry()));                
            }
        */

        /* 
        series1.setName("Tuberculosis");
        series1.getData().addAll(
                new XYChart.Data<Number, String>(567, years[0]),
                new XYChart.Data<Number, String>(1292, years[1]),
                new XYChart.Data<Number, String>(2180, years[2]));

        XYChart.Series<Number, String> series2 = new XYChart.Series<>();
        series2.setName("Whooping Cough");
        series2.getData().addAll(
                new XYChart.Data<Number, String>(956, years[0]),
                new XYChart.Data<Number, String>(1665, years[1]),
                new XYChart.Data<Number, String>(2450, years[2]));

        XYChart.Series<Number, String> series3 = new XYChart.Series<>();
        series3.setName("Meningitis");
        series3.getData().addAll(
                new XYChart.Data<Number, String>(800, years[0]),
                new XYChart.Data<Number, String>(1000, years[1]),
                new XYChart.Data<Number, String>(2800, years[2]));


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

    /*
    public static void main(String[] args) {
        launch(args);
    }

    */
    
    
}
