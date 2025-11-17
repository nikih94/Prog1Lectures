package EN.p5;

public class Recursion {


    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            System.out.println("Fibonacci num " + i + " is: "+fib(i));
        }
    }

    public static int fib(int n){
        if( n < 2 ) return n;
        return fib(n-1) + fib(n-2);
    }

    public static boolean isPalindrom(String word){
        if( word.length() < 2 ) return true;
        if( word.charAt(0) != word.charAt(word.length() -1) ) return false;
        String smallerProblem = word.substring(1,word.length()-1);
        return isPalindrom(smallerProblem);
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
