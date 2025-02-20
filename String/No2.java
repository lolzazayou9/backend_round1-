public class No2 {
    public static void main(String[] args) {
        No2 n2 = new No2();

        String str = "world";

        System.out.println(n2.reverseString(str));
    }

    public String reverseString(String s){
        String res = "";

        for(int i = s.length() - 1; i >= 0 ; i--){
            res += s.charAt(i);
        }

        return res;
    }
}
