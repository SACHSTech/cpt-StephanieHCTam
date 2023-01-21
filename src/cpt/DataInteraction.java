package cpt;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.*;
import java.io.IOException;
import java.util.*;

public class DataInteraction {

    // The methods below search the data set  

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

        // Check if the province in the array element is country of choice
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





    /*

    static ArrayList<DataReader> death = new ArrayList<DataReader>();

    public void main(String[] args) throws IOException{
    
        //DataCollection DataCollection = new DataCollection();
         
        for(int i = 0; i<death.size();i++){
            System.out.println(tuberculosis.get(i).getEntity());
            System.out.println(tuberculosis.get(i).getYear());
            System.out.println(tuberculosis.get(i).getTuberculosis());
        }
    }
    
    public DataInteraction() throws IOException{
        BufferedReader Br = new BufferedReader(new FileReader("Deaths-caused-by-Tuberculosis"));
        String str = Br.readLine();

        while(str != null){
            String[] holder = str.split(",");
            DataReader data = new DataReader(holder[0], Integer.parseInt(holder[1]), holder[2]);
            tuberculosis.add(data);
            str = Br.readLine();
        }
        Br.close();
    }

    */

}


