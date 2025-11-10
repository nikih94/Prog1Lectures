package EN.P4;

public class ArraysEx {


    public static void main(String[] args) {
        int[] numbers = {2,5,1,23,11,20,33,41,14};
        insertionSort(numbers);
        printArr(numbers);
    }

    public static void insertionSort(int[] a){
        for (int i = 1; i < a.length ; i++){
            int key = a[i];
            int j = i;
            while( j > 0 && a[j-1] > key){
                a[j] = a[j-1];
                j--;
            }
            a[j] = key;
        }
    }


    public static void printArr(int[] a){
        for (int i : a){
            System.out.print(i+",");
        }
        System.out.println();
    }

    //order elements in ascending order
    public static void bubblesort(int[] a){
        for (int i = 0; i < a.length ; i++ ){
            for ( int j = 1; j < a.length - i ; j++){
                if( a[j] < a[j-1] ){
                    int tmp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = tmp;
                }
            }
        }
    }


    public static void contains(int target, int[] a){
        for (int i = 0; i < a.length ; i++){
            if(target == a[i]){
                System.out.println(target + " Is contained in the array at index " + i);
                return;
            } else if(target < a[i]){
                break;
            }
        }
        System.out.println("Target not found in the array");

    }
}
