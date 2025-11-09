package SLO.P4;

public class VecDimenzionalnaPolja {


    public static void main(String[] args) {

        int[][] matrika = new int[3][3];

        int[] vrstica1 = {10, 2, 3};
        int[] vrstica2 = {4, 5, 8};
        int[] vrstica3 = {2, 3, 11};
        matrika[0] = vrstica1;
        matrika[1] = vrstica2;
        matrika[2] = vrstica3;

        System.out.println(matrika[1][0]);

        int[][] m2 = {
                {10,11,12},
                {13,14},
                {16,17,18}
        };
        System.out.println( m2[2][1] );

        for (int i = 0; i < m2.length; i++){
            for (int j = 0; j < m2[i].length;j++){
                System.out.print(m2[i][j]+",");
            }
            System.out.println();
        }



    }
}
