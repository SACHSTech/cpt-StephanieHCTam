package cpt;

public class TotalReader {

    // Initialize instance variables
    private int total2010;
    private int total2012;
    private int total2014;
    private int total2016;
    private int total2018;

    /**
     * Constructor - creates a new data instance
     * @param hitotal2010 - total deaths by tuberculosis
     * @param hitotal2012 - total deaths by whooping cough
     * @param hitotal2014 - total deaths by meningitis
     */

    public TotalReader(int hitotal2010, int hitotal2012, int hitotal2014, int hitotal2016, int hitotal2018){
        this.total2010 = hitotal2010;
        this.total2012 = hitotal2012;
        this.total2014 = hitotal2014;
        this.total2016 = hitotal2016;
        this.total2018 = hitotal2018;
    }

    /**
     * Getter method for meningitis
     * @return meningitis deaths
     */
    public int getTotal2010(){
        return total2010;
    }

    /**
     * Getter method for meningitis
     * @return meningitis deaths
     */
    public int getTotal2012(){
        return total2012;
    }

    /**
     * Getter method for meningitis
     * @return meningitis deaths
     */
    public int getTotal2014(){
        return total2014;
    }

    /**
     * Getter method for meningitis
     * @return meningitis deaths
     */
    public int getTotal2016(){
        return total2016;
    }

    /**
     * Getter method for meningitis
     * @return meningitis deaths
     */
    public int getTotal2018(){
        return total2018;
    }
    
}
