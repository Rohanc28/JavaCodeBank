import java.util.*; 

public class FirstNonRepeatChar {
  
    public static Character NonRepeatingChar(String inputString) {
    if (null == inputString || inputString.isEmpty()) {
        return null;
    }
    
    Map<Character, Integer> frequency = new HashMap<>();
    
    for (int outer = 0; outer < inputString.length(); outer++) {
        char character = inputString.charAt(outer);
        frequency.put(character, frequency.getOrDefault(character, 0) + 1);
    }
    
    for (Character c : inputString.toCharArray()) {
        if (frequency.get(c) == 1) {
            return c;
        }
    }
    return null;
    }
  
  
  
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        System.out.println("First Non repeat char: "+NonRepeatingChar(str));
    }
}

