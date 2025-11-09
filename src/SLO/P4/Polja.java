package SLO.P4;

public class Polja {

    public static void main(String[] args) {
        int[] stevila = {100,2,5,88,3,1,20,10,20,5};
        insertionSort(stevila);
        printArr(stevila);
    }

    public static void insertionSort(int[] a){
        for (int i = 1 ; i < a.length ; i++){
            int key = a[i];
            int j = i;
            while(j > 0 && a[j-1] > key){
                a[j] = a[j-1];
                j--;
            }
            a[j] = key;
        }
    }

    public static void printArr(int[] a){
        for (int elt: a){
            System.out.print(elt+",");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] a){
        for (int i = 0 ; i < a.length ; i++){
            for (int j = 1; j < a.length - i; j++){
                if( a[j-1] > a[j] ){
                    //swap
                    int tmp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = tmp;
                }
            }
        }

    }

    public static void isci(int n, int[] a){
        for (int i = 0; i < a.length; i++) {
            if(a[i] == n){
                System.out.println(n+ " je v polju, na indeksu: "+i);
                return;
            } else if (a[i] > n) {
                System.out.println("Stevila ni v polju!!!");
                return;
            }
        }
        System.out.println("Stevila ni v polju!!!");
    }

}
