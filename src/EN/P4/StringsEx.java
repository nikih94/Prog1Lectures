package EN.P4;

import java.util.Scanner;

public class StringsEx {

    public static void main(String[] args) {
        readArray();

    }

    public static void readArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer numbers delimited with a whitespace");
        String line = sc.nextLine();

        String[] tokens = line.split(" ");
        int[] n = new int[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            n[i] = Integer.parseInt(tokens[i]);
        }
        int sum = 0;
        for (int i : n){
            sum+=i;
        }

        System.out.println("Sum of numbers: "+sum);
    }

    public static void sbstr(){
        String s = "Today is sunny!";
        System.out.println(s.substring(6,8));
        System.out.println(s.substring(9));
    }

    public static void stringEquality() {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println(s1 == s2);//comparing references
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);

        System.out.println(s1.equals(s3)); //comparing content

    }

    public static void countN(){
        String s = "BananaNNNN n n n Nsnaas";
        s = s.toLowerCase();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if( s.charAt(i) == 'n'){
                count++;
            }
        }
        System.out.println("There are "+count+" n in the string");
    }

    public static void concatenation(){
        int age = 9;
        String s = "He is " + age + " years old.";
        System.out.println(s);
    }


}
