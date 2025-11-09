package EN.P4;

public class TypeWrappers {


    public static void main(String[] args) {

        Integer iObb = Integer.valueOf(100);
        int ii = iObb.intValue();

        Integer iOb = 100; // autobox an int
        int i = iOb; // auto-unbox

        char[] charArray = {'w','2','\r','5','\t','t','1','\b','e','!','?','\n','3'};
        sumOfDigits(charArray);

        for (char c: charArray) {
            System.out.print(c);
        }
    }

    public static void sumOfDigits(char[] a){
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            if( Character.isDigit(a[i]) ){
                sum += Character.getNumericValue(a[i]);
            }
        }
        System.out.println("sum of digits: " + sum);

    }
}
