import java.util.*;

public class WordInPlaceReverse {
    public static void main(String[] args) {
        String input = "Apple ball cat apple ball cat java program google gmail clock google ApPle";
        String str="";
        String revWord= "";
        input = input.toLowerCase();

        String[] words = input.split("\\s+");

        Map<String, Integer> frequencyMap = new HashMap<>();
        char ch;
        for (String word : words) {
            str+=" ";
            revWord="";               //remove previous word
            for (int index=0; i<word.length(); i++) //reversing each word
            //revword =word.rev();
            {   
                ch= word.charAt(index);
                revWord= ch+revWord;  //appending each char at [0] to create a reverse of word
                
            }
            
            str+=revWord;             //adding reversed word at end of final string;
            
        }
        System.out.println(str);
    }
}


