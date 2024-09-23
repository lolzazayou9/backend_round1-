public class No1BSO {
    public static void main(String[] args){
        Object str[] = {1, "2a", "3abc", 4, "def5", "b6"};
        int sum = 0;
        for(Object number : str){
            int numberforsum = numberString(number);
            sum += numberforsum;
        }
        System.out.println("sum : "+sum);
    }

    public static int numberString(Object number){
        String str = number.toString(); 
        String numberStr = str.replaceAll("[^0-9]", ""); 
        return numberStr.isEmpty() ? 0 : Integer.parseInt(numberStr); 
    }
}
