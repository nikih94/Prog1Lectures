package SLO.P4;

public class CharacterClass {

    public static void main(String[] args) {
        char[] charArray = { 'd', '!', '8','r', '1' , '+' , '7','1' , '\t', '\n', '\b','\r' };

        int vsota = 0;

        for (int i = 0; i < charArray.length; i++) {
            if(Character.isDigit(charArray[i])){//cifra
                //vsota += Character.getNumericValue(charArray[i]); // pretvorba v int
                vsota += charArray[i] - '0';
            }
            if(Character.isISOControl(charArray[i])){
                System.out.println("posebni znak"+charArray[i] +"------");
            }
        }
        System.out.println("Vsota cifer je: " + vsota );



    }
}
