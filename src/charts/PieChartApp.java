package charts;

// Import statements
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;
import cpt.DataInteraction;
import cpt.DataReader;
import java.util.*;
import java.io.*;

public class PieChartApp extends Application {

    private PieChart chart;

    private int total2010 = 1843955;
    private int total2012 = 1763350;
    private int total2014 = 1715556;
    private int total2016 = 1645107;
    private int total2018 = 1569292;

    // chart title: Deaths Caused by Vaccine Preventable Diseases in the World

    public static ObservableList<PieChart.Data> generateData() {
        return FXCollections.observableArrayList(
            new PieChart.Data("Tuberculosis", 74),
            new PieChart.Data("Whooping Cough", 8),
            new PieChart.Data("Meningitis", 18));
    }

/* 
    for (int i = 0, i < 10; i++){
        public static ObservableList<PieChart.Data> generateData = FXCollections.observableArrayList(newPieChart.Data());
    }
*/
    // static String[] diseaseList = {"Tuberculosis", "Whooping Cough", "Meningitis"};

    /* 
    public static ObservableList<PieChart.Data> generateData() {
        for(int i = 0; i < diseaseList.length; i++){
                //new PieChart.Data("Tuberculosis", 74),
                //new PieChart.Data("Whooping Cough", 8),
                //new PieChart.Data(diseaseList.get(i), 18);
            }
        return FXCollections.observableArrayList();
    }
    

    public static ObservableList<PieChart.Data> generateData() {
        return FXCollections.observableArrayList(
                new PieChart.Data("Tuberculosis", dataInteraction.getTotalt2010()),
                new PieChart.Data("Whooping Cough", 8),
                new PieChart.Data("Meningitis", 2));
    }
    */

    public Parent PieChart() throws IOException{
        chart = new PieChart(generateData());
        chart.setClockwise(false);
        return chart;
    }

    @Override public void start(Stage primaryStage) throws IOException {

        // Constructor
        DataInteraction dataInteraction = new DataInteraction();

        ArrayList<DataReader> country2 = dataInteraction.countryName("World");

        primaryStage.setScene(new Scene(PieChart()));
        primaryStage.show();

        // Pie chart title
        chart.setTitle("Deaths Caused by Vaccine Preventable Diseases in the World");

    }

    /**
     * Java main for when running without JavaFX launcher
     * @param args command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}