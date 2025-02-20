
class Longest_Prefix {

    public static void main(String[] args) {
        Longest_Prefix lp = new Longest_Prefix();

        String[] test1 = {"flow", "flower", "flight"};
        String[] test2 = {"dog","racecar","car"};
        System.out.println(lp.longestCommonPrefix(test2));

        //output = fl
    }

    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length() - 1);
            }
        }
        return prefix;
    }
}
