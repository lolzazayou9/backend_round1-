
import java.util.Arrays;


public class No7 {
    public static void main(String[] args) {
        No7 n7 = new No7();

        String stgr = "helloWorld";

        System.out.println(Arrays.toString(n7.splitWords(stgr)));
    }

    public String[] splitWords(String s){
        String[] word = s.split("(?=[A-Z])");   
        
        if(s.contains("_")){
            String[] word2 = s.split("_");
            return word2;
        }
        return word;
    }
}
