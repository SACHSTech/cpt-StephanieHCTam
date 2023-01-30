package cpt;
 
import java.io.FileReader;
import java.util.ArrayList;
import java.io.*;
import java.io.IOException;

/**
 * Data Interaction and Visualization CPT 
 * @author S. Tam
 * 
 */

public class DataInteraction {

    // New array list 
    private static ArrayList<DataReader> dataList = new ArrayList<DataReader>();

    /* 
    public static void main(String[] args) throws IOException{

       DataInteraction dataInteraction = new DataInteraction();

       // ArrayList <DataReader> dataList = new ArrayList <DataReader>();

        for(int i = 0; i<dataList.size(); i++){
            System.out.println(dataList.get(i).getCountry());
            System.out.println(dataList.get(i).getYear());
            System.out.println(dataList.get(i).getTuberculosis());
            System.out.println(dataList.get(i).getWhoopingCough());
            System.out.println(dataList.get(i).getMeningitis());
        }
    }
    */
    
    /**
     * Method that reads CSV file and creates data as new object, adds to an array list 
     * File Input/Output 
     * @throws IOException
     */
    public DataInteraction() throws IOException{
        BufferedReader key = new BufferedReader(new FileReader("src/Vaccine-preventable-diseases-deaths.csv"));

        String str = key.readLine();

        while(str != null){
            String[] holder = str.split(",");
            DataReader country = new DataReader(holder[0], Integer.parseInt(holder[1]), Integer.parseInt(holder[2]), Integer.parseInt(holder[3]), Integer.parseInt(holder[4]));
            dataList.add(country);
            str = key.readLine();
        }
        key.close();
    }

    /**
     * Method that extracts the name of the country and puts it into a new array list 
     * @param country
     * @return Return an array list that only includes the countries names 
     */
    public ArrayList<DataReader> countryName(String country){

        ArrayList <DataReader> newList = new ArrayList <DataReader>();

        for(int i = 0; i < dataList.size(); i++){
            if(dataList.get(i).getCountry().equals(country)) newList.add(dataList.get(i));
        }

        return newList;
    }

    /**
     * Method that extracts the year and puts it into a new array list
     * @param year
     * @return Return an array list that only includes years 
     */
    public ArrayList<DataReader> yearNum(int year){
        
        ArrayList <DataReader> newList = new ArrayList <DataReader>();

        for(int i = 0; i < dataList.size(); i++){
            if(dataList.get(i).getYear() == year) newList.add(dataList.get(i));
        }

        return newList;

    }

    // Methods for Total Tuberculosis
    public int getTotalt2010(){
        for(int i = 0; i < dataList.size(); i++){
            if(dataList.get(i).getCountry().equals("World") && dataList.get(i).getYear() == 2010){
                return dataList.get(i).getTuberculosis() / (dataList.get(i).getMeningitis() + dataList.get(i).getTuberculosis() + dataList.get(i).getWhoopingCough()) * 100;
            }
        }
        return -1;
    }

    public int getTotalt2018(){
        for(int i = 0; i < dataList.size(); i++){
            if(dataList.get(i).getCountry().equals("World") && dataList.get(i).getYear() == 2018){
                return dataList.get(i).getTuberculosis() / (dataList.get(i).getMeningitis() + dataList.get(i).getTuberculosis() + dataList.get(i).getWhoopingCough()) * 100;
            }
        }
        return -1;
    }

    // Methods for Total Whooping Cough
    public int getTotalc2010(){
        for(int i = 0; i < dataList.size(); i++){
            if(dataList.get(i).getCountry().equals("World") && dataList.get(i).getYear() == 2010){
                return dataList.get(i).getWhoopingCough() / (dataList.get(i).getMeningitis() + dataList.get(i).getTuberculosis() + dataList.get(i).getWhoopingCough()) * 100;
            }
        }
        return -1;
    }

    public int getTotalc2018(){
        for(int i = 0; i < dataList.size(); i++){
            if(dataList.get(i).getCountry().equals("World") && dataList.get(i).getYear() == 2018){
                return dataList.get(i).getWhoopingCough() / (dataList.get(i).getMeningitis() + dataList.get(i).getTuberculosis() + dataList.get(i).getWhoopingCough()) * 100;
            }
        }
        return -1;
    }

    // Methods for Total Meningitis
    public int getTotalm2010(){
        for(int i = 0; i < dataList.size(); i++){
            if(dataList.get(i).getCountry().equals("World") && dataList.get(i).getYear() == 2010){
                return dataList.get(i).getMeningitis() / (dataList.get(i).getMeningitis() + dataList.get(i).getTuberculosis() + dataList.get(i).getWhoopingCough()) * 100;
            }
        }
        return -1;
    }

    public int getTotalm2018(){
        for(int i = 0; i < dataList.size(); i++){
            if(dataList.get(i).getCountry().equals("World") && dataList.get(i).getYear() == 2018){
                return dataList.get(i).getMeningitis() / (dataList.get(i).getMeningitis() + dataList.get(i).getTuberculosis() + dataList.get(i).getWhoopingCough()) * 100;
            }
        }
        return -1;
    }

}