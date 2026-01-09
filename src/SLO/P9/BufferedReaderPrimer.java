package SLO.P9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderPrimer {


    public static void main(String[] args) {
        BufferedReader br;
        FileReader fr;

        try {
            fr = new FileReader("src/SLO/P9/Izjeme.java");
            br = new BufferedReader( fr );
            String line;
            while((line = br.readLine()) != null ){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Error while reading");
        }
    }
}
