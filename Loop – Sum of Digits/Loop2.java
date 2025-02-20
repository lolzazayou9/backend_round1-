public class Loop2 {
    public static void main(String[] args) {
        Loop2 lp2 = new Loop2();

        int n = 13;
        System.out.println(lp2.countBinaryOnes(n));
    }

    public int countBinaryOnes(int n){
        int found = 0;
        String binary = Integer.toBinaryString(n);

        for(int i = 0 ; i < binary.length() ; i++){
            if(binary.charAt(i) == '1'){
                found++;
            }
        }
        return found;
    }
}
