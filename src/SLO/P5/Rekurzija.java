package SLO.P5;

import java.sql.SQLOutput;

public class Rekurzija {


    public static void rek(int n){
        System.out.println(n);
        if( n == 0){
            return;
        }
        rek(n-1);
    }

    public static void main(String[] args) {
        //rek(1000);
        System.out.println("Vsota cifer v stevilu "+ sumDig(13865));
        System.out.println("Fakulteta: "+fakulteta(6));
        System.out.println("Potenciranje: "+potenciranje(2,11));
        System.out.println("Palindrom "+isPalindorm("NEVERODDOREVEN"));
        System.out.println("Palindrom "+isPalindorm("NEVERODDOREVE"));
        System.out.println("Palindrom "+isPalindorm("NEVERODDOREVEn"));
        System.out.println("Case insensitive Palindrom "+isPalindromCaseInsensitive("NEVERODDOREVEn"));

//        for (int i = 0; i < 50; i++) {
//            System.out.println(i+"-ti clan fib zaporedja: "+fib(i));
//        }
        System.out.println(ack(0,0));
        System.out.println(ack(1,1));
        System.out.println(ack(2,2));
        System.out.println(ack(3,3));
        System.out.println(ack(4,0));
        //System.out.println(ack(4,1));

        System.out.println("Mozni vzponi: " + climb(5,3));

    }

    public static int climb(int h, int n){
        if( h < 0 ) return 0;
        if( h == 0 ) return 1;

        int mozniVzponi = 0;
        for (int i = 1; i <= n; i++) {
            mozniVzponi += climb( h - i , n);
        }
        return mozniVzponi;
    }

    public static int ack(int m , int n){
        if( m == 0) return n+1;
        if( m > 0 && n ==0 ) return ack(m-1,1);
        return ack(m-1 , ack( m , n-1 ));
    }

    public static int fib(int n){
        if( n < 2 ) return n;
        return fib(n-1) + fib(n-2);
    }

    public static boolean isPalindromCaseInsensitive(String s){
        return isPalindorm( s.toLowerCase() );
    }

    public static boolean isPalindorm(String s){
        if( s.length() < 2 ) return true;
        if( s.charAt(0) != s.charAt(s.length() -1)) return false;
        return isPalindorm( s.substring(1 , s.length() -1 ) );
    }

    public static int fakulteta(int n){
        if( n == 0 ) return 1;
        return n * fakulteta(n-1);
    }
    public static int potenciranje(int b, int c){
        if( c == 0 ) return 1;
        return b * potenciranje(b, c-1);
    }

    public static int sumDig(int n){
        if( n < 10 ) return n;
        int zadnjaCifra = n % 10;
        int manjsiProblem = n / 10;
        return zadnjaCifra + sumDig(manjsiProblem);
    }
}
