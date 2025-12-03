package EN.p5;

public class Recursion {


    public static void main(String[] args) {

//        for (int i = 0; i < 50; i++) {
//            System.out.println("Fibonacci num " + i + " is: "+fib(i));
//        }

//        System.out.println(ack(0,0));
//        System.out.println(ack(1,1));
//        System.out.println(ack(2,2));
//        System.out.println(ack(3,3));
//        System.out.println(ack(4,0));
//        System.out.println(ack(4,1));

        System.out.println(climb(4,2));
        System.out.println(climb(10,4));

    }

    public static int climb(int h, int n){
        if( h < 0 ) return 0;
        if( h == 0 ) return 1;
        int waysToClimb = 0;
        for (int i = 1; i <= n; i++) {
            waysToClimb += climb( h-i , n);
        }
        return waysToClimb;
    }

    public static int ack(int m, int n){
        if ( m == 0 ) return n+1;
        if( m > 0 && n == 0 ) return ack(m-1 , 1);
        return ack( m -1 , ack(m , n-1));
    }



    public static int fib(int n){
        if( n < 2 ) return n;
        return fib(n-1) + fib(n-2);
    }


    public static boolean isPalindrome(String s){
        if(s.length() == 0) return true;
        if(s.charAt(0) == s.charAt(s.length()-1)) return true;
        return isPalindrome(s.substring(1, s.length()-1));
    }

    public static int exp(int b, int c){
        if( c == 0 ) return 1;
        return b * exp(b , c-1);
    }

    public static int factorial(int n){
        if( n == 0) return 1;
        return n * factorial( n - 1 );
    }



    public static int sumDig(int n){
        if( n < 10 ) return n;
        int lastDigit = n % 10 ;
        int smallerProblem = n / 10;
        return lastDigit + sumDig(smallerProblem);
    }
}
