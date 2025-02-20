class lengthOfLastWord {
    public static void main(String[] args) {

        lengthOfLastWord lw = new lengthOfLastWord();

        String strs = "Hello World";

        System.out.println(lw.lengthOfLastWord2(strs));

    }

    public int lengthOfLastWord2(String s) {
        String[] words = s.trim().split("\\s+");
        String word = words[words.length - 1];  
        int n = word.length();
        return n;
    }
}
