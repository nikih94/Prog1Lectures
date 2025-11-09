package SLO.P4;

public class Nizi {

    public static void main(String[] args) {
        tokenizacija();
    }

    public static void tokenizacija(){
        String s = "Danes Je Lepo Vreme!";
        String[] tokeni = s.split(" ");
        for (String str: tokeni ){
            System.out.println(str);
        }
    }

    public static void podniz(){
        String s = "Danes Je Lepo Vreme!";
        s = s.toUpperCase();
        String sub = s.substring(9,13);
        System.out.println(sub);
    }


    public static void enakost(){
        String s1 = "hello";
        String s2 = "hello";

        String s3 = new String("hello");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2)); // enakost!!!
        System.out.println(s1.equals(s3));
    }




    public static void prestejAje(){
        String s = "banana ena plus banana dva";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a'){
                count++;
            }
        }
        System.out.println("Stevilo ajev: "+count);
    }

    public static void konkatenacija(){
        int starost = 9;
        String s = "On je star " + starost + " let.";
        System.out.println(s); // izhod: On je star 9 let.
    }
}
