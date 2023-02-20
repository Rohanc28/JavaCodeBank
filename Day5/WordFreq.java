import java.util.*;

public class WordFreq {
    public static void main(String[] args) {
        scanner s=new Scanner(System.in);
        //String input=s.nextLine();
        String input = "Apple ball cat apple ball cat java program google gmail clock google ApPle";

        input = input.toLowerCase();

        String[] words = input.split("\\s+");

        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        for (String word : frequencyMap.keySet()) {
            System.out.println(word + " : " + frequencyMap.get(word));
        }
    }
}
