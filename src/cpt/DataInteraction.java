package cpt;

import java.io.FileReader;
import java.util.ArrayList;
import java.io.*;
import java.io.IOException;
import java.util.*;

public class DataInteraction {

    private static ArrayList<DataReader> dataList = new ArrayList<DataReader>();

    public void main(String[] args) throws IOException{

       // DataInteraction DataInteraction = new DataInteraction();

        ArrayList <DataReader> dataList = new ArrayList <DataReader>();

        for(int i = 0; i<dataList.size();i++){
            System.out.println(dataList.get(i).getCountry());
            System.out.println(dataList.get(i).getYear());
            System.out.println(dataList.get(i).getTuberculosis());
            System.out.println(dataList.get(i).getWhoopingCough());
            System.out.println(dataList.get(i).getMeningitis());
        }
    }
    
    public DataInteraction() throws IOException{
        BufferedReader key = new BufferedReader(new FileReader("Vaccine-preventable-diseases-deaths"));
        String str = key.readLine();

        while(str != null){
            String[] holder = str.split(",");
            DataReader country = new DataReader(holder[0], Integer.parseInt(holder[1]), Integer.parseInt(holder[2]), Integer.parseInt(holder[3]), Integer.parseInt(holder[4]));
            dataList.add(country);
            str = key.readLine();
        }
        key.close();
    }

    public ArrayList<String> countryName(){
        
        ArrayList <String> customList = new ArrayList <String>();

        for(int i = 0; i < dataList.size();i++) customList.add(dataList.get(i).getCountry());
        
        return customList;

    }

    public ArrayList<DataReader> yearNum(int year){

        ArrayList <DataReader> customList = new ArrayList <DataReader>();

        for(int i = 0; i < dataList.size();i++){
            if(dataList.get(i).getYear() == year) customList.add(dataList.get(i));
        }
        
        return customList;
    }

    public ArrayList<DataReader> getList(){
        return dataList;
    }


    

    ///////////////////////////////////////////////////

    /**
     * Search data set for country choice
     * @param array - the datareader array 
     * @param country - the name of the country
     * @return the array list that contains the country  
     */

     /* 
     public ArrayList<DataReader> countrySearch(DataReader[] array, String country){
        String countryElement;

        // Array list that holds all the data entries with the country choice
        ArrayList<DataReader> tempCountry = new ArrayList<DataReader>(); 

        // Check if the country in the array element is country of choice
        for(int i = 0; i < array.length; i++){
            countryElement = array[i].getCountry();	
            
            // Add to array list 
            if(countryElement.equals(country)){
                tempCountry.add(array[i]);
            }
        }
        
        // Return array list 
        return tempCountry; 
    }

    */

    /**
    * Searchs the data set for year choice
    * @param array - the datareader array 
    * @param year - the name of the year
    * @return the array list that contains the year    
    */

    /* 
    public ArrayList<DataReader> yearSearch(DataReader[] array, int year){
        int yearElement;

        // Array list that holds all the data entries with the year choice
        ArrayList<DataReader> tempYear = new ArrayList<DataReader>();

        // Check if the labour type in the array element is labour type of choice
        for (int i = 0; i < array.length; i++) {
            yearElement = array[i].getYear();				
            
            // Add to array list 
            if (yearElement == year) {
                tempYear.add(array[i]);
            }
        }
    
        // Return array list 
        return tempYear; 
    }

    */


}


