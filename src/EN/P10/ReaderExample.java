package EN.P10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderExample {

    public static void main(String[] args) {
        String filename = "src/EN/P10/ReaderExample.java";

        try {
            String fileContent = readFile(filename);
            System.out.println(fileContent);
        }catch (FileNotFoundException e){
            System.out.println("File not found: "+ e.getMessage());
        } catch (IOException e){
            System.out.println("IO exception: "+e.getMessage());
        }
    }

    public static String readFile(String filename) throws IOException {
        String readText = "";
        BufferedReader br;

        br = new BufferedReader(new FileReader(filename));
        String line;
        while((line = br.readLine()) != null){
            readText += line +"\n";
        }
        return readText;
    }
}
