package cpt;

public class TotalReader {

    // Initialize instance variables
    private int totalt2010;
    private int totalt2018;

    private int totalc2010;
    private int totalc2018;

    private int totalm2010;
    private int totalm2018;

    /**
     * Constructor - creates a new data instance
     * @param hitotal2010 - total deaths by tuberculosis
     * @param hitotal2012 - total deaths by whooping cough
     * @param hitotal2014 - total deaths by meningitis
     */

    public TotalReader(int hitotalt2010, int hitotalt2018, int hitotalc2010, int hitotalc2018, int hitotalm2010, int hitotalm2018){
        this.totalt2010 = hitotalt2010;
        this.totalt2018 = hitotalt2018;

        this.totalc2010 = hitotalc2010;
        this.totalc2018 = hitotalc2018;

        this.totalm2010 = hitotalm2010;
        this.totalm2018 = hitotalm2018;
    }

    /**
     * Getter method for meningitis
     * @return meningitis deaths
     */
    public int getTotalt2010(){
        return totalt2010;
    }

    /**
     * Getter method for meningitis
     * @return meningitis deaths
     */
    public int getTotalt2018(){
        return totalt2018;
    }

    /**
     * Getter method for meningitis
     * @return meningitis deaths
     */
    public int getTotalc2010(){
        return totalc2010;
    }

    /**
     * Getter method for meningitis
     * @return meningitis deaths
     */
    public int getTotalc2018(){
        return totalc2018;
    }

    /**
     * Getter method for meningitis
     * @return meningitis deaths
     */
    public int getTotalm2010(){
        return totalm2010;
    }

    /**
     * Getter method for meningitis
     * @return meningitis deaths
     */
    public int getTotalm2018(){
        return totalm2018;
    }
    
}