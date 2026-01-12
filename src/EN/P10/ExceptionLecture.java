package EN.P10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionLecture {


    public static void main(String[] args) {
        int[] a = {1,22,4,3,55,100,12,5};

        //System.out.println(a[2]);
        //propagateCall(a);
        userInput(a);
    }

    public static void userInput(int[] a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from index:0 to: "+(a.length-1));
        while(true){

            try {
                int index = sc.nextInt();
                System.out.println("Index: " + index + " value: " + a[index]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid index: "+e.getMessage());
            }catch (InputMismatchException ex){
                System.out.println("Please insert only integers!");
                sc.nextLine();
            }
        }

    }

    public static void triggerStackOverflowError(){
        triggerStackOverflowError();
    }

    public static void accessOutOfBounds(int[] a){
        System.out.println(a[22]);
    }

    public static void propagateCall(int[] a){
        accessOutOfBounds(a);
    }
}
