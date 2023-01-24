package cpt;

// Imports 
import java.util.*;
import java.io.IOException;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.stage.Stage;
import javafx.scene.chart.XYChart;
import java.util.Arrays;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Side;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.chart.ScatterChart;

// Pie Chart imports
import javafx.scene.chart.PieChart;

// choiceBox imports
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.TilePane;

// VBox imports
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;

public class Main extends Application{

    // Variables for bar chart
    private BarChart<Number, String> barChart;
    private NumberAxis xAxis;
    private CategoryAxis yAxis;
    private XYChart.Series<Number, String> series1;
    private XYChart.Series<Number, String> series2;
    private XYChart.Series<Number, String> series3;
    private ArrayList<DataReader> country1;

    // Variable for tab pane 
    TabPane tabPane;

    // Variables for pie chart
    private PieChart pieChart;


    // Data for Pie Chart
    public static ObservableList<PieChart.Data> generateData() {
        return FXCollections.observableArrayList(
                new PieChart.Data("Tuberculosis", 74),
                new PieChart.Data("Whooping Cough", 8),
                new PieChart.Data("Meningitis", 2));
    }


    public Parent HorizontalBarChart() throws IOException{

        String[] years = {"2010", "2012", "2014", "2016", "2018"};

        // Constructor
        DataInteraction DataInteraction = new DataInteraction();

        // Testing ArrayList
        //ArrayList<DataReader> listYear = new ArrayList<DataReader>();

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

        FXCollections.<String>observableArrayList(Arrays.asList(years));
        xAxis = new NumberAxis();
        yAxis = new CategoryAxis();
        barChart = new BarChart<>(xAxis, yAxis);
        barChart.setTitle("Vaccine Preventable Diseases Deaths");
        yAxis.setLabel("Year");
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

        barChart.getData().add(series1);
        barChart.getData().add(series2);
        barChart.getData().add(series3);

        cb.setOnAction((event) -> {
            int selectedIndex = cb.getSelectionModel().getSelectedIndex();
            Object selectedItem = cb.getSelectionModel().getSelectedItem();

            System.out.println("Selection made: [" + selectedIndex + "] " + selectedItem);
            System.out.println("ChoiceBox.getValue(): " + cb.getValue());

            // check country in "cb"
            System.out.println(String.valueOf(cb.getValue()));

            country1 = DataInteraction.countryName(String.valueOf(cb.getValue()));

            FXCollections.<String>observableArrayList(Arrays.asList(years));
            xAxis = new NumberAxis();
            yAxis = new CategoryAxis();
            barChart.setTitle("Vaccine Preventable Diseases Deaths");
            yAxis.setLabel("Year");
            xAxis.setLabel("Deaths");
            
            // series 1: Tuberculosis
            series1.setName("Tuberculosis");

            for(int i = 0; i<country1.size(); i++){
                series1.getData().add(
                new XYChart.Data<Number, String>(country1.get(i).getTuberculosis(), Integer.toString(country1.get(i).getYear())));                
            }

            // series 2: Whooping Cough
            series2.setName("Whooping Cough");
            
                for(int i = 0; i<country1.size(); i++){
                    series2.getData().add(
                    new XYChart.Data<Number, String>(country1.get(i).getWhoopingCough(), years[i]));                
                }

            // series 3: Meningitis
            series3.setName("Meningitis");

                for(int i = 0; i<country1.size(); i++){
                    series3.getData().add(
                    new XYChart.Data<Number, String>(country1.get(i).getMeningitis(), years[i]));                
                }

        });

        VBox vboxBarChart = new VBox(5);
        vboxBarChart.getChildren().addAll(cb, barChart);
        vboxBarChart.setPrefHeight(1000);
        vboxBarChart.setPrefWidth(1000);
        return vboxBarChart;
    }
    
        public Parent PieChart() throws IOException{
            
            pieChart = new PieChart(generateData());
            pieChart.setClockwise(false);
            return pieChart;
        }
    

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setScene(new Scene(HorizontalBarChart()));
        primaryStage.show();

        primaryStage.setScene(new Scene(PieChart()));
        primaryStage.show();

        //Border pane
        BorderPane root = new BorderPane();

        // Tabs set up
        tabPane = new TabPane();
        tabPane.setSide(Side.TOP);


        // Tab 1
        Tab tab1 = new Tab("Chart #1 (Horizontal Bar Chart)");
        tab1.setClosable(false);
        VBox layout1 = new VBox(10);
        layout1.setPadding(new Insets(10)); 
        layout1.getChildren().addAll(tabPane, HorizontalBarChart());
        tab1.setContent(layout1);
        tabPane.getTabs().add(tab1);

        // Tab 2
        Tab tab2 = new Tab("Chart #2 (Pie Chart)");
        tab2.setClosable(false);
        VBox layout2 = new VBox(10);
        layout2.setPadding(new Insets(10)); 
        layout2.getChildren().addAll(tabPane, PieChart());
        tab2.setContent(layout2);
        tabPane.getTabs().add(tab2);

        root.setCenter(tabPane);

        // Set screen
        Scene screen = new Scene(root); 
        primaryStage.setTitle("ICS4U Data Modelling and Visualization - Stephanie Tam");
        primaryStage.setScene(screen);
        primaryStage.setWidth(1000);
        primaryStage.setHeight(1000);
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