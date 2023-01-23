package cpt;
 
import java.io.FileReader;
import java.util.ArrayList;
import java.io.*;
import java.io.IOException;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class DataInteraction {

    private static ArrayList<DataReader> dataList = new ArrayList<DataReader>();

    public static void main(String[] args) throws IOException{

       DataInteraction DataInteraction = new DataInteraction();

       // ArrayList <DataReader> dataList = new ArrayList <DataReader>();

        for(int i = 0; i<dataList.size(); i++){
            System.out.println(dataList.get(i).getCountry());
            System.out.println(dataList.get(i).getYear());
            System.out.println(dataList.get(i).getTuberculosis());
            System.out.println(dataList.get(i).getWhoopingCough());
            System.out.println(dataList.get(i).getMeningitis());
        }
    }
    
    public DataInteraction() throws IOException{
        BufferedReader key = new BufferedReader(new FileReader("Vaccine-preventable-diseases-deaths.csv"));

        String str = key.readLine();

        while(str != null){
            String[] holder = str.split(",");
            DataReader country = new DataReader(holder[0], Integer.parseInt(holder[1]), Integer.parseInt(holder[2]), Integer.parseInt(holder[3]), Integer.parseInt(holder[4]));
            dataList.add(country);
            str = key.readLine();
        }
        key.close();
    }


    // take country list, compare dataList 
    // create a method that compares everything single object in dataList in that object, if the same create other 

    // method take in country name, do: compare the orig dataList, loop: if the dataList at i the name of country then add it to different array, define it to that array


    public ArrayList<DataReader> countryName(String country){

        ArrayList <DataReader> newList = new ArrayList <DataReader>();

        for(int i = 0; i < dataList.size(); i++){
            if(dataList.get(i).getCountry().equals(country)) newList.add(dataList.get(i));
        }
        
        return newList;
    }

    public ArrayList<DataReader> yearNum(int year){
        
        ArrayList <DataReader> newList = new ArrayList <DataReader>();

        for(int i = 0; i < dataList.size(); i++){
            if(dataList.get(i).getYear() == year) newList.add(dataList.get(i));
        }

        return newList;

    }

    public ArrayList<DataReader> getList(){
        return dataList;
    }

}


