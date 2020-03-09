package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        String stringToWorkWith = toLowerCase(str);
        int counter = counter(str);
        String[] result = new String[counter];
        String tempString = stringToWorkWith;
        int arrayCounter = 0;
        for (int j = 0; j < str.length(); j++) {
            if(Character.isLetter(tempString.charAt(j))){

                result[arrayCounter] =  StringUtils.capitalizeNthCharacter(tempString,j);
                arrayCounter++;
                tempString = stringToWorkWith;
            }
        }
        return result;
    }







    public static String toLowerCase(String str){
        return str.toLowerCase();
    }

    public static int counter(String str){
        int counter = 0;
        for (int j = 0; j < str.length(); j++) {
            if(Character.isLetter(str.charAt(j))){
                counter++;
            }
        }
        return counter;
    }

}
