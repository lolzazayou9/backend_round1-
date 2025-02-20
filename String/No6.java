public class No6 {
    public static void main(String[] args) {
        No6 n6 = new No6();

        String str  = "I love programming in JavaScript";

        System.out.println(n6.longestWord(str));
    }

    public String longestWord(String s){
        String[] split = s.split("\\s");
        String maxStr = split[0];
        for(int i = 1; i < split.length ; i++){
            if(maxStr.length() < split[i].length()){
                maxStr = split[i];
            }
        }
        return maxStr;
    }
}
