package cpt;

public class DataReader {

    // Initialize instance variables
    private String country;
    private int year;
    private int tuberculosis;
    private int whoopingCough;
    private int meningitis;

    /**
     * Constructor - creates a new data instance
     * @param country - country name
     * @param year - chosen year
     * @param tuberculosis - deaths by tuberculosis
     * @param whoopingCough - deaths by whooping cough
     * @param meningitis - deaths by meningitis
     */
    public DataReader(String country, int year, int tuberculosis, int whoopingCough, int meningitis){
        country = this.country;
        year = this.year;
        tuberculosis = this.tuberculosis;
        whoopingCough = this.whoopingCough;
        meningitis = this.meningitis;
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