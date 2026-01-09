package SLO.P9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputLoop {


    public static void main(String[] args) {
        int[] numbers = {2,5,10,22,100,22,23,42,69};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the index from: 0 to "+(numbers.length-1));

        while(true){

            try {
                int index = input.nextInt();
                System.out.println("Index " + index + ", value " + numbers[index]);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Index out of bounds, insert an index in the range  from: 0 to "+(numbers.length-1));

            } catch (InputMismatchException e){
                input.nextLine();
                System.out.println("Please insert only numbers");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
