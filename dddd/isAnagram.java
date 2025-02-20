
import java.util.Arrays;



class isAnagram {

    public static void main(String[] args) {
        isAnagram iA = new isAnagram();

        String a = "anagram";
        String b = "nagaram";

        System.out.println(iA.isAnagram(a, b));
    }

    public boolean isAnagram(String s, String t) {

        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        if(Arrays.equals(str1, str2)){
            return true;
        }else{
            return false;
        }
    }
}
