package string;

import java.util.List;
import java.util.Locale;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Integer a = null;
        int b = 2;
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1.charAt(1)); // it gives the character at the index provided
        System.out.println(str1.startsWith("ab"));
        System.out.println(str1.startsWith("bc", 1));
        String str3 = "India has won";
        str3 = str3.toLowerCase();
        String[] words = str3.split(" ");
        List<String> wordlist = Arrays.asList(words);
        Collections.reverse(wordlist);
        String r_str3 = String.join(" ", wordlist);
        System.out.println(r_str3);
        r_str3 = r_str3.substring(0, 1).toUpperCase() + r_str3.substring(1);
        System.out.println(r_str3);

        StringBuilder r1_str3 = new StringBuilder();
        for (String word : words)
        {
            String reversedWord = new StringBuilder(word).reverse().toString();
            r1_str3.append(reversedWord).append(" ");
        }
        String final_result = r1_str3.toString().trim();
        System.out.println(final_result);
    }
}

