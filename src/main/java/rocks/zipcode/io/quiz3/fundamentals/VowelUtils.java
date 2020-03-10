package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    ArrayList<String> vowels = new ArrayList<String>(Arrays.asList("a","e","i","o","u"));

    public VowelUtils() {
    }

    public static Boolean hasVowels(String word) {
        String[] vowels = {"a","e","i","o","u"};
        for (int i = 0; i < word.length(); i++) {
            String temp = "";
            temp += word.charAt(i);
            for (int j = 0; j < vowels.length; j++) {
                if(temp.equalsIgnoreCase(vowels[j])){
                    return true;
                }
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        Integer result = -1;
        for (int i = 0; i < word.length(); i++) {
            String temp = "";
            temp += word.charAt(i);
            if(hasVowels(temp)){
                result = i;
                break;
            }
        }
        return result;
    }


    public static Boolean startsWithVowel(String word) {
        return isVowel(word.charAt(0));
    }

    public static Boolean isVowel(Character character) {
        String temp = "";
        temp += character;
        String[] vowels = {"a","e","i","o","u"};
        for (String c : vowels) {
            if(c.equalsIgnoreCase(temp)){
                return true;
            }
        }
        return false;
    }
}
