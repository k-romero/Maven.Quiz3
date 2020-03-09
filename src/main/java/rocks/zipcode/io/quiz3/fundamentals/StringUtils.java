package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String upperCase = "";
        upperCase += Character.toUpperCase(str.charAt(indexToCapitalize));
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if(i == indexToCapitalize){
                result += upperCase;
            } else {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return baseString.charAt(indexOfString) == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        String toWorkWith = string;
        ArrayList<String> resultList = new ArrayList<>();
        for (int i = 0; i < toWorkWith.length(); i++) {
            for (int j = i+1; j <= toWorkWith.length() ; j++) {
                resultList.add(toWorkWith.substring(i,j));
            }
        }
        ArrayList<String> newResult = new ArrayList<>();
        for (String s : resultList) {
            if(!newResult.contains(s)){
                newResult.add(s);
            }
        }
        String[] result = new String[newResult.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = newResult.get(i);
        }
        return result;
    }

    public static Integer getNumberOfSubStrings(String input){
        String[] resultArray = getAllSubStrings(input);
        return resultArray.length;
    }
}
