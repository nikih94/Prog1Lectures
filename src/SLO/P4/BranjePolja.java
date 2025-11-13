package SLO.P4;

import java.util.Scanner;

public class BranjePolja {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Vnesi poljubno stevilo celih stevil, stevila morajo biti locena s presledkom");

        String line = sc.nextLine();//preberemo string

        String[] tokens = line.split(" ");

        int[] stevila = new int[tokens.length];

        for (int i = 0; i < stevila.length; i++) {
            stevila[i] = Integer.parseInt(tokens[i]);
        }

        System.out.println("Prebral sem naslednje polje int");
        for (int i : stevila){
            System.out.print(i+",");
        }
        System.out.println();
    }
}
