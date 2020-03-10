package rocks.zipcode.io.quiz3.fundamentals;



/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {

    public  String translate(String str) {
        String[] sentence = str.split(" ");
        for (int i = 0; i < sentence.length; i++) {
            sentence[i] = translateIndividual(sentence[i]);
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < sentence.length; i++) {
            if(i == sentence.length -1){
                builder.append(sentence[i]);
            } else {
                builder.append(sentence[i]).append(" ");
            }
        }
        return builder.toString();
    }

    public String shiftConsonants(String str){
        StringBuilder builder = new StringBuilder();
        int indexOfFirstVowel = VowelUtils.getIndexOfFirstVowel(str);

        for (int i = indexOfFirstVowel; i < str.length(); i++) {
            builder.append(str.charAt(i));
        }
        for (int i = 0; i < indexOfFirstVowel; i++) {
            builder.append(str.charAt(i));
        }
        builder.append("ay");
        return builder.toString();
    }

    public String translateIndividual(String str){
        StringBuilder builder = new StringBuilder();
        if(VowelUtils.startsWithVowel(str)){
            builder.append(str).append("way");
            return builder.toString();
        } else if(!VowelUtils.startsWithVowel(str) && !VowelUtils.hasVowels(str)){
            builder.append(str).append("ay");
        } else {
            builder.append(shiftConsonants(str));
        }

        return builder.toString();
    }
}
