package cpt;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.*;
import java.io.IOException;
import java.util.*;

public class DataInteraction {

    /**
     * Search data set for country choice
     * @param array - the datareader array 
     * @param country - the name of the country
     * @return the array list that contains the country  
     */

     public static ArrayList<DataReader> countrySearch(DataReader[] array, String country){
        String countryElement;

        // Array list that holds all the data entries with the country choice
        ArrayList<DataReader> temporary = new ArrayList<DataReader>(); 

        // Check if the country in the array element is country of choice
        for(int i = 0; i < array.length; i++){
            countryElement = array[i].getCountry();	
            
            // Add to array list 
            if(countryElement.equals(country)){
                temporary.add(array[i]);
            }
        }
        
        // Return array list 
        return temporary; 
    }

    /**
    * Searchs the data set for year choice
    * @param array - the datareader array 
    * @param year - the name of the year
    * @return the array list that contains the year    
    */
    public static ArrayList<DataReader> yearSearch(DataReader[] array, int year){
        int yearElement;

        // Array list that holds all the data entries with the year choice
        ArrayList<DataReader> temporary = new ArrayList<DataReader>();

        // Check if the labour type in the array element is labour type of choice
        for (int i = 0; i < array.length; i++) {
            yearElement = array[i].getYear();				
            
            // Add to array list 
            if (yearElement == year) {
                temporary.add(array[i]);
            }
        }
    
        // Return array list 
        return temporary; 
    }

    ///////////////////////////////////////////////////

        /* 
    private static ArrayList<DataReader> countrySearch = new ArrayList<DataReader>();

    public void main(String[] args) throws IOException{

        ArrayList <DataReader> countrySearch = new ArrayList <DataReader>();

        for(int i = 0; i<countrySearch.size();i++){
            System.out.println(countrySearch.get(i).getCountry());
            System.out.println(countrySearch.get(i).getYear());
            System.out.println(countrySearch.get(i).getTuberculosis());
            System.out.println(countrySearch.get(i).getWhoopingCough());
            System.out.println(countrySearch.get(i).getMeningitis());
        }

    }
    
    public DataInteraction() throws IOException{
        BufferedReader key = new BufferedReader(new FileReader("Vaccine-preventable-diseases-deaths"));
        String str = key.readLine();

        while(str != null){
            String[] holder = str.split(",");
            DataReader country = new DataReader(holder[0], Integer.parseInt(holder[1]), Integer.parseInt(holder[2]), Integer.parseInt(holder[3]), Integer.parseInt(holder[4]));
            countrySearch.add(country);
            str = key.readLine();
        }
        key.close();
    }

    */

}


