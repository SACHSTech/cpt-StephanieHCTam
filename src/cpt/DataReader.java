package cpt;

// Import statements
//import javafx.beans.property.SimpleStringProperty;
//import javafx.beans.property.StringProperty;

public class DataReader {

    // Initialize instance variables
    private String country;
    private int year;
    private int tuberculosis;
    private int whoopingCough;
    private int meningitis;
    private int totalTuberculosis;
    private int totalCough;
    private int totalMeningitis;

    /**
     * Constructor - creates a new data instance
     * @param hicountry - country name
     * @param hiyear - chosen year
     * @param hituberculosis - deaths by tuberculosis
     * @param hiwhoopingCough - deaths by whooping cough
     * @param himeningitis - deaths by meningitis
     */

    public DataReader(String hicountry, int hiyear, int hituberculosis, int hiwhoopingCough, int himeningitis, int hitotalTuberculosis, int hitotalCough, int hitotalMeningitis){
        this.country = hicountry;
        this.year = hiyear;
        this.tuberculosis = hituberculosis;
        this.whoopingCough = hiwhoopingCough;
        this.meningitis = himeningitis;
        this.totalTuberculosis = hitotalTuberculosis;
        this.totalCough = hitotalCough;
        this.totalMeningitis = hitotalMeningitis;
    }

    /**
     * Getter method for country
     * @return country
     */
    public String getCountry(){
        return country;
    }

    /**
     * Getter method for year
     * @return year
     */
    public int getYear(){
        return year;
    }

    /**
     * Getter method for tuberculosis
     * @return tuberculosis deaths
     */
    public int getTuberculosis(){
        return tuberculosis;
    }

    /**
     * Getter method for whooping cough
     * @return whooping cough deaths
     */
    public int getWhoopingCough(){
        return whoopingCough;
    }           

    /**
     * Getter method for meningitis
     * @return meningitis deaths
     */
    public int getMeningitis(){
        return meningitis;
    }

    /**
     * Getter method for meningitis
     * @return meningitis deaths
     */
    public int getTotalTuberculosis(){
        return totalTuberculosis;
    }

    /**
     * Getter method for meningitis
     * @return meningitis deaths
     */
    public int getTotalCough(){
        return totalCough;
    }

    /**
     * Getter method for meningitis
     * @return meningitis deaths
     */
    public int getTotalMeningitis(){
        return totalMeningitis;
    }

    /**
    * String representation of a set of data 
    * @return all the attributes related to one set of data 
    */
    public String toString(){
        return country + ", " + year + ", " + tuberculosis + ", " + whoopingCough + ", " + meningitis;
    }
}