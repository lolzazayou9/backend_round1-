public class Loop1 {
    public static void main(String[] args) {
        Loop1 l1 = new Loop1();

        int n = 1234;

        System.out.println(l1.sumDigits(n));
    }

    public int sumDigits(int n){
        int cal = 0;
        String numStr = String.valueOf(n);
        for(int i = 0 ; i < numStr.length() ; i++){
            cal += Character.getNumericValue(numStr.charAt(i));
        }
        return cal;
    }
}
