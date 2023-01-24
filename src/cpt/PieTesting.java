package cpt;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;

import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

import javax.sound.sampled.Line;
import javax.swing.event.ChangeListener;
//import Data.*;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

public class PieTesting extends Application {

    private boolean tuberculosis;
    private boolean whoopingCough;
    private boolean meningitis;

    private int year;
    private DataInteraction interaction;

    private PieChart pieChart;
    private VBox pieChartBox;

    private String dataSet; //



    public PieTesting() throws IOException{

        tuberculosis = false;
        whoopingCough = false;
        meningitis = false;
        

        interaction = new DataInteraction();
        pieChart = new PieChart();
        pieChartBox = new VBox();

        //dataSet = "World"; //
       
    }
    DataReader temp = new DataReader(STYLESHEET_CASPIAN, year, year, year, )

    public void updatePiChart() throws IOException {

        List<ObservableList<PieChart.Data>> pieChartData = FXCollections.observableArrayList();

        for (int i = 0; i < 8; i++){
            ObservableList<PieChart.Data> newData = FXCollections.observableArrayList();
            pieChartData.add(newData);
        }

        // Constructor
        //DataInteraction DataInteraction = new DataInteraction();

        //ArrayList<DataReader> world = DataInteraction.countryName("World");

        ChoiceBox<String> dataChoice = new ChoiceBox<String>(FXCollections.observableArrayList("World"));

        dataChoice.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.equals("World")){
                tuberculosis = true;
                whoopingCough = true;
                meningitis = true;
            }
        });

        // choiceBox for years 2010, 2012, 2014, 2016, 2018

        String[] countryList = {"2010", "2012", "2014", "2016", "2018"};

        ChoiceBox<String> choicebox = new ChoiceBox<String>(FXCollections.observableArrayList(countryList));
        
        choicebox.getSelectionModel().selectedItemProperty().addListener((observableTwo, oldValueTwo, newValueTwo) -> {

            for (int i = 0; i < countryList.length; i++){
                ObservableList<PieChart.Data> newData = FXCollections.observableArrayList();
                pieChartData.add(newData);
            }

            if (tuberculosis){
                for (int i = 0; i < countryList.length; i++){
                    for (int x = i; x < 23200; x = x + 1 * 5){

                        pieChartData.get(i).add(new PieChart.Data(interaction.getList().get(x).getCountry(), interaction.getList().get(x).getTuberculosis()));
                    }
                }
            }
            if (whoopingCough){
                for (int i = 0; i < countryList.length; i++){
                    for (int x = i; x < 23200; x = x + 1 * 5){

                        pieChartData.get(i).add(new PieChart.Data(interaction.getList().get(x).getCountry(), interaction.getList().get(x).getWhoopingCough()));

                    }
                }
            }
            if (meningitis){
                for (int i = 0; i < countryList.length; i++){
                    for (int x = i; x < 23200; x = x + 1 * 5){

                        pieChartData.get(i).add(new PieChart.Data(interaction.getList().get(x).getCountry(), interaction.getList().get(x).getMeningitis()));

                    }
                }
            }
        
            switch(newValueTwo){
                case "2010":
                pieChartBox.getChildren().remove(pieChart);
                pieChart.getData().clear();
                pieChart = new PieChart(pieChartData.get(0));
                pieChartBox.getChildren().addAll(pieChart);
                pieChartData.clear();
                break;

                case "2012":
                pieChartBox.getChildren().remove(pieChart);
                pieChart.getData().clear();
                this.pieChart = new PieChart(pieChartData.get(1));
                pieChartBox.getChildren().addAll(pieChart);
                pieChartData.clear();
                break;

                case "2014":
                pieChartBox.getChildren().remove(pieChart);
                pieChart.getData().clear();
                this.pieChart = new PieChart(pieChartData.get(2));
                pieChartBox.getChildren().addAll(pieChart);
                pieChartData.clear();
                break;

                case "2016":

                pieChartBox.getChildren().remove(pieChart);
                pieChart.getData().clear();
                this.pieChart = new PieChart(pieChartData.get(3));
                pieChartBox.getChildren().addAll(pieChart);
                pieChartData.clear();
                break;

                case "2018":

                pieChartBox.getChildren().remove(pieChart);
                pieChart.getData().clear();
                this.pieChart = new PieChart(pieChartData.get(4));
                pieChartBox.getChildren().add(pieChart);
                pieChartData.clear();
                break;
            }

        });

        pieChartBox.getChildren().addAll(choicebox, dataChoice);
        pieChart.setTitle("Deaths Caused by Vaccine Preventable Diseases in the World");

        
    }
    public VBox returnChart(){
        return this.pieChartBox;
    }
 
    public Parent createContent() {
        pieChart = new PieChart(createContent());
        pieChart.setClockwise(false);
        return pieChart;
    }


    @Override public void start(Stage primaryStage) throws Exception {
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