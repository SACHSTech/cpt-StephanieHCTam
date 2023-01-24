/* 

package cpt;

public class CountryDataPoint {

    private String country;
    private int year;
    private int tuberculosis;
    private int whoopingCough;
    private int meningitis;
    public int addData;

    public CountryDataPoint() {
        addData = 0;
    }

    public void addValue(String value){
        
        switch(addData){
            case 0:
                this.country = value;
                break;
            case 1:
                this.year = Integer.parseInt(value);
                break;
            case 2:
                this.tuberculosis = Integer.parseInt(value);
                break;
            case 3:
                this.whoopingCough = Integer.parseInt(value);
                break;
            case 4:
                this.meningitis = Integer.parseInt(value);
                break;
        }
        
        this.addData++;
    }
    public String getCountry() {
        return this.country;
    }
    public int getYear(){
        return this.year;
    }
    public int getTuberculosis(){
        return this.tuberculosis;
    }
    public int getWhoopingCough(){
        return this.whoopingCough;
    }
    public int getMeningitis(){
        return this.meningitis;
    }
    
}
*/