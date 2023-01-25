package cpt;

public class TotalReader {

    // Initialize instance variables
    private int totalt2010;
    private int totalt2012;
    private int totalt2014;
    private int totalt2016;
    private int totalt2018;

    private int totalc2010;
    private int totalc2012;
    private int totalc2014;
    private int totalc2016;
    private int totalc2018;

    private int totalm2010;
    private int totalm2012;
    private int totalm2014;
    private int totalm2016;
    private int totalm2018;

    /**
     * Constructor - creates a new data instance
     * @param hitotal2010 - total deaths by tuberculosis
     * @param hitotal2012 - total deaths by whooping cough
     * @param hitotal2014 - total deaths by meningitis
     */

    public TotalReader(int hitotalt2010, int hitotalt2012, int hitotalt2014, int hitotalt2016, int hitotalt2018){
        this.totalt2010 = hitotalt2010;
        this.totalt2012 = hitotalt2012;
        this.totalt2014 = hitotalt2014;
        this.totalt2016 = hitotalt2016;
        this.totalt2018 = hitotalt2018;

        /* 
        this.total2010 = hitotal2010;
        this.total2012 = hitotal2012;
        this.total2014 = hitotal2014;
        this.total2016 = hitotal2016;
        this.total2018 = hitotal2018;

        this.total2010 = hitotal2010;
        this.total2012 = hitotal2012;
        this.total2014 = hitotal2014;
        this.total2016 = hitotal2016;
        this.total2018 = hitotal2018;
        */
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
    public int getTotalt2012(){
        return totalt2012;
    }

    /**
     * Getter method for meningitis
     * @return meningitis deaths
     */
    public int getTotalt2014(){
        return totalt2014;
    }

    /**
     * Getter method for meningitis
     * @return meningitis deaths
     */
    public int getTotalt2016(){
        return totalt2016;
    }

    /**
     * Getter method for meningitis
     * @return meningitis deaths
     */
    public int getTotalt2018(){
        return totalt2018;
    }
    
}
