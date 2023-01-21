package cpt;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.*;
import java.io.IOException;
import java.util.*;

public class DataCollection {

    static ArrayList<Deaths> deathList = new ArrayList<Deaths>();

    public void main(String[] args) throws IOException{
    
        //DataCollection DataCollection = new DataCollection();
         
        for(int i = 0; i<deathList.size();i++){
            System.out.println(deathList.get(i).getEntity());
            System.out.println(deathList.get(i).getYear());
            System.out.println(deathList.get(i).getTuberculosis());
        }
    }
    
    public DataCollection() throws IOException{
        BufferedReader Br = new BufferedReader(new FileReader("Deaths-caused-by-Tuberculosis"));
        String str = Br.readLine();

        while(str != null){
            String[] holder = str.split(",");
            Deaths deaths = new Deaths(holder[0], Integer.parseInt(holder[1]), holder[2]);
            deathList.add(deaths);
            str = Br.readLine();
        }
        Br.close();
    }

}


