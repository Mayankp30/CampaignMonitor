import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.HashSet;
import java.util.stream.Stream;

/**
 * Created by Mayank on 9/10/16.
 */
public class Extension {

    public boolean isSubstring(String str1, String str2){

        //permutation(str2);
        return false;
    }

    public int strToInt(String word){
        int answer = 0, factor = 1;
        for (int i = word.length()-1; i >= 0; i--) {
            answer = answer + (word.charAt(i) - '0') * factor;
            factor *= 10;
        }
        return answer;
    }


    public String ToInt(String str){ //5
        int value=0;
        char[] charArray = str.toCharArray();  // 1 2 3 = 100*1 + 2 *10 + 3
        for(int i=0;i<charArray.length;i++){
            System.out.println(Character.getNumericValue(charArray[i]));
            value=value *2 + Character.getNumericValue(charArray[i]); // val = 0*10 + 1  == 1
                                                                        // val = 1*10 + 2 == 12
                                                                        // val = 12*10 + 3 // 123
        }
        //return value;
        value=value+1;  //  6

        StringBuilder sb = new StringBuilder();
        while(value>0){
            int remainder = value%2;
            sb.append(remainder);
            value=value/2;

        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Extension ext1 = new Extension();
        String str = "abc";
        int[] array = {1,4,5};
        System.out.println(array.length);
        char charArray[] = str.toCharArray(); // a , b , c
        String text = String.valueOf(charArray);
        HashSet<String> lol = new HashSet<>();
        lol.add(text);
    }

}