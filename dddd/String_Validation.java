
class String_Validation {

    public static void main(String[] args) {
        String_Validation sv = new String_Validation();

        String str = "Passss123!";

        System.out.println(sv.passwordValidation(str));
    }

    public boolean passwordValidation(String s) {
        String spe = "!@#$%^&*()";
        String bar = " ";
        boolean CanUseThis = false;
        if (s.length() >= 8 && s.length() <= 20) {
            for (int i = 0; i < s.length(); i++) {
                if (Character.isUpperCase(s.charAt(i))) {
                    CanUseThis = true;
                }else if(Character.isDigit(s.charAt(i))){
                    CanUseThis = true;
                }else if(spe.indexOf(s.charAt(i)) != -1){
                    CanUseThis = true;
                }else if(bar.indexOf(s.charAt(i)) != -1){
                    CanUseThis = false;
                    break;
                }
                for(int j = 0 ; j < s.length() - 2 ; j++){
                    char currnt = s.charAt(j);

                    if(currnt == s.charAt(j+1) && currnt == s.charAt(j+2)){
                        CanUseThis = false;
                        break;
                    }
                }
            }
        }

        return CanUseThis;
    }
}
