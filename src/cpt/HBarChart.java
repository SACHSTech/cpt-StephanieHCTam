package cpt;

// Import statements

import java.util.*;
import java.io.*;

import java.util.Arrays;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
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

// choiceBox imports
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.TilePane;

// VBox imports
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;


public class HBarChart extends Application {

    private BarChart<Number, String> chart;
    private NumberAxis xAxis;
    private CategoryAxis yAxis;
    private XYChart.Series<Number, String> series1;
    private XYChart.Series<Number, String> series2;
    private XYChart.Series<Number, String> series3;
    private ArrayList<DataReader> country1;


    public Parent createContent() throws IOException{

        String[] years = {"2010", "2012", "2014", "2016", "2018"};

        // Constructor
        DataInteraction DataInteraction = new DataInteraction();

        // Testing ArrayList
        ArrayList<DataReader> listYear = new ArrayList<DataReader>();

        // ChoiceBox
        ChoiceBox<String> cb = new ChoiceBox<String>();

        cb.getItems().add("Afghanistan");
        cb.getItems().add("Bangladesh");
        cb.getItems().add("Canada");
        cb.getItems().add("Egypt");
        cb.getItems().add("Guatemala");
        cb.getItems().add("India");
        cb.getItems().add("Japan");
        cb.getItems().add("Mexico");
        cb.getItems().add("New Zealand");
        cb.getItems().add("Philippines");
        cb.getItems().add("Saudi Arabia");
        cb.getItems().add("Turkey");
        cb.getItems().add("United States");
        cb.getItems().add("Zambia");

        country1 = DataInteraction.countryName(String.valueOf(cb.getValue()));

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
        series1 = new XYChart.Series<>();
        series1.setName("Tuberculosis");

        for(int i = 0; i<country1.size(); i++){
            series1.getData().add(
            new XYChart.Data<Number, String>(country1.get(i).getTuberculosis(), Integer.toString(country1.get(i).getYear())));                
        }

        // series 2: Whooping Cough
        series2 = new XYChart.Series<>();
        series2.setName("Whooping Cough");
        
            for(int i = 0; i<country1.size(); i++){
                series2.getData().add(
                new XYChart.Data<Number, String>(country1.get(i).getWhoopingCough(), years[i]));                
            }

        // series 3: Meningitis
        series3 = new XYChart.Series<>();
        series3.setName("Meningitis");

            for(int i = 0; i<country1.size(); i++){
                series3.getData().add(
                new XYChart.Data<Number, String>(country1.get(i).getMeningitis(), years[i]));                
            }

        chart.getData().add(series1);
        chart.getData().add(series2);
        chart.getData().add(series3);
        //return chart;

       
        cb.setOnAction((event) -> {
            int selectedIndex = cb.getSelectionModel().getSelectedIndex();
            Object selectedItem = cb.getSelectionModel().getSelectedItem();

            System.out.println("Selection made: [" + selectedIndex + "] " + selectedItem);
            System.out.println("ChoiceBox.getValue(): " + cb.getValue());

            // check country in "cb"
            System.out.println(String.valueOf(cb.getValue()));

            country1 = DataInteraction.countryName(String.valueOf(cb.getValue()));

            //final ObservableList<String> categories =
            FXCollections.<String>observableArrayList(Arrays.asList(years));
            xAxis = new NumberAxis();
            yAxis = new CategoryAxis();
            //chart = new BarChart<>(xAxis, yAxis);
            chart.setTitle("Vaccine Preventable Diseases Deaths");
            yAxis.setLabel("Year");
            //yAxis.setCategories(categories);
            xAxis.setLabel("Deaths");
            
            // series 1: Tuberculosis
            //series1 = new XYChart.Series<>();
            
            series1.setName("Tuberculosis");

            for(int i = 0; i<country1.size(); i++){
                series1.getData().add(
                new XYChart.Data<Number, String>(country1.get(i).getTuberculosis(), Integer.toString(country1.get(i).getYear())));                
            }

            // series 2: Whooping Cough
            //series2 = new XYChart.Series<>();
            series2.setName("Whooping Cough");
            
                for(int i = 0; i<country1.size(); i++){
                    series2.getData().add(
                    new XYChart.Data<Number, String>(country1.get(i).getWhoopingCough(), Integer.toString(country1.get(i).getYear())));                
                }

            // series 3: Meningitis
            //series3 = new XYChart.Series<>();
            series3.setName("Meningitis");

                for(int i = 0; i<country1.size(); i++){
                    series3.getData().add(
                    new XYChart.Data<Number, String>(country1.get(i).getMeningitis(), Integer.toString(country1.get(i).getYear())));                
                }

            //chart.getData().add(series1);
            //chart.getData().add(series2);
            //chart.getData().add(series3);
            //return chart;

        });

        VBox vboxBarChart = new VBox(5);
        vboxBarChart.getChildren().addAll(cb, chart);
        vboxBarChart.setPrefHeight(1000);
        vboxBarChart.setPrefWidth(1000);
        return vboxBarChart;
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