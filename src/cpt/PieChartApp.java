package cpt;

// Import statements
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;


public class PieChartApp extends Application {

    private PieChart chart;

    // chart title: Deaths Caused by Vaccine Preventable Diseases in the World

    public static ObservableList<PieChart.Data> generateData() {
        return FXCollections.observableArrayList(
                new PieChart.Data("Tuberculosis", 74),
                new PieChart.Data("Whooping Cough", 8),
                new PieChart.Data("Meningitis", 2));
    }

    public Parent createContent() {
        chart = new PieChart(generateData());
        chart.setClockwise(false);
        return chart;
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
