package cpt;

public class Deaths {

    private String entity;
    private int year;
    private String tuberculosis;

    public Deaths(String entity, int year, String tuberculosis){
        entity = this.entity;
        year = this.year;
        tuberculosis = this.tuberculosis;
    }

    public String getEntity(){
        return entity;
    }

    public int getYear(){
        return year;
    }

    public String getTuberculosis(){
        return tuberculosis;
    }

    public String toString(){
        return entity + " " + year + " " + tuberculosis;
    }
    
}