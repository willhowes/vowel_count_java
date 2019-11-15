package app;

import java.util.Arrays;
import java.util.List;

public class Vowels {

    public static int getCount(String str) {
        String vowels[] = "aeiou".split("");
        List<String> vowelsList = Arrays.asList(vowels);
        String strAsArray[] = str.split("");
        int strLength = strAsArray.length;
        int vowelsCount = 0;
        for (int i = 0; i < strLength; i++) {
            if (vowelsList.contains(strAsArray[i])) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

}