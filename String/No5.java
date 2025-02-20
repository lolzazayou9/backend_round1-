
public class No5 {

    public static void main(String[] args) {
        No5 n5 = new No5();

        String str = "I love coding";
        String change = "love";
        String newword = "hate";

        System.out.println(n5.replaceWord(str, change, newword));
    }

    public String replaceWord(String s1, String Wantchangethis, String newword) {

        s1 = s1.replace(Wantchangethis, newword);

        return s1;
    }
}
