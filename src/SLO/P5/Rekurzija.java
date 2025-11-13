package SLO.P5;

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
    }

    public static int sumDig(int n){
        if( n < 10 ) return n;
        int zadnjaCifra = n % 10;
        int manjsiProblem = n / 10;
        return zadnjaCifra + sumDig(manjsiProblem);
    }
}
