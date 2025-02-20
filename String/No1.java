class No1 {
    public static void main(String[] args) {
        No1 n1 = new No1();

        String str = "hello";

        System.out.println(n1.isPalindrome(str));
    }

    public boolean isPalindrome (String s){
        String res = "";
        String strlow = s.toLowerCase();
        String str = strlow.replaceAll("[^a-zA-Z0-9]", "");
        
        for(int i = str.length()-1 ; i >= 0 ; i--){
            res += str.charAt(i);
        }

        if(res.equals(str)){
            return true;
        }else{
            return false;
        }
    }
}
