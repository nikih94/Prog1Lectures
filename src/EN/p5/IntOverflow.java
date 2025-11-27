package EN.p5;

public class IntOverflow {


    public static void main(String[] args) {

        int largeValue = 2000000000;

        System.out.println(largeValue);



        try {
            int res = Math.multiplyExact(largeValue, 2);
            System.out.println( res  );
        }catch (Exception e){
            System.out.println("Integer Overflow!!");
        }

        String s = "banana";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if( s.charAt(i) == 'a' ){
                count++;
            }
        }
        System.out.println("Number of a in string: "+count);


    }



}
