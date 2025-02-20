class Valid_Palindrome {
    public static void main(String[] args) {
        Valid_Palindrome vp = new Valid_Palindrome();

        String str = "A man, a plan, a canal: Panama";

        System.out.println(vp.isPalindrome(str));
    }
    public boolean isPalindrome(String s) {
        String str2 = s;
        String res = "";

        String strlower = s.toLowerCase();
        String strreplec = strlower.replaceAll("[^a-zA-Z0-9]","");
        for(int i = strreplec.length()-1 ; i >= 0 ; i--){
            res += strreplec.charAt(i);
        }

        if(res.equals(strreplec)){
            return true;
        }else{
            return false;
        }
    }
}
