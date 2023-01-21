package cpt;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.*;
import java.io.IOException;
import java.util.*;

public class DataCollection {

    static ArrayList<Deaths> DataCollection = new ArrayList<Deaths>();
    
    public DataCollection() throws IOException{
        BufferedReader Br = new BufferedReader(new FileReader("Deaths-caused-by-Tuberculosis"));
        String str = Br.readLine();

        while(str != null){
            String[] holder = str.split(",");
            Deaths deaths = new Deaths(holder[0], Integer.parseInt(holder[1]), holder[2]);
            DataCollection.add(deaths);
            str = Br.readLine();
        }
        Br.close();
    }

}


