package cpt;

/**
 * Data Interaction and Visualization CPT 
 * @author S. Tam
 */

public class DataReader {

    // Initialize instance variables
    private String country;
    private int year;
    private int tuberculosis;
    private int whoopingCough;
    private int meningitis;

    /**
     * Constructor creates a new data instance
     * @param hicountry country name
     * @param hiyear chosen year
     * @param hituberculosis deaths by tuberculosis
     * @param hiwhoopingCough deaths by whooping cough
     * @param himeningitis deaths by meningitis
     * 
     */
    public DataReader(String hicountry, int hiyear, int hituberculosis, int hiwhoopingCough, int himeningitis){
        this.country = hicountry;
        this.year = hiyear;
        this.tuberculosis = hituberculosis;
        this.whoopingCough = hiwhoopingCough;
        this.meningitis = himeningitis;
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
    * String representation of a set of data 
    * @return all the attributes related to one set of data 
    */
    public String toString(){
        return country + ", " + year + ", " + tuberculosis + ", " + whoopingCough + ", " + meningitis;
    }
}