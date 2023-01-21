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

    public String getCountry(){
        return country;
    }

    public int getYear(){
        return year;
    }

    public String getTuberculosis(){
        return tuberculosis;
    }

    public String toString(){
        return country + " " + year + " " + tuberculosis;
    }
    
}