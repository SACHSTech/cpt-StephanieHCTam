package cpt;

public class TotalReader {

    // Initialize instance variables
    private int totalTuberculosis;
    private int totalCough;
    private int totalMeningitis;

    /**
     * Constructor - creates a new data instance
     * @param hitotalTuberculosis - total deaths by tuberculosis
     * @param hitotalCough - total deaths by whooping cough
     * @param hitotalMeningitis - total deaths by meningitis
     */

    public TotalReader(int hitotalTuberculosis, int hitotalCough, int hitotalMeningitis){
        this.totalTuberculosis = hitotalTuberculosis;
        this.totalCough = hitotalCough;
        this.totalMeningitis = hitotalMeningitis;
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
        return totalTuberculosis + ", " + totalCough + ", " + totalMeningitis;
    }
    
}
