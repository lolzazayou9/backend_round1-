
import java.util.Arrays;

public class No4 {
    public static void main(String[] args) {
        No4 n4 = new No4();

        String s1 = "hello";

        String s2 = "world";

        System.out.println(n4.anagram(s1, s2));
    }

    public boolean anagram (String s1,String s2){

        char[] c1 = s1.toCharArray();
        char[] c2= s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.equals(c1, c2)){
            return true;
        }else{
            return false;
        }
    }
}
