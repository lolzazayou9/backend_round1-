
import java.util.HashMap;
import java.util.Map;

public class No3 {

    public static void main(String[] args) {
        No3 n3 = new No3();

        String str = "banana";

        n3.countChars(str);
    }

    public static void countChars(String str) {
    HashMap<Character, Integer> charFreq = new HashMap<>();
    
    for (char c : str.toCharArray()) {
        charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
    }
    
    System.out.println(charFreq);
    
    System.out.print("{ ");
    boolean first = true;
    for (Map.Entry<Character, Integer> entry : charFreq.entrySet()) {
        if (!first) {
            System.out.print(", ");
        }
        System.out.print(entry.getKey() + ": " + entry.getValue());
        first = false;
    }
    System.out.println(" }");
}
}
