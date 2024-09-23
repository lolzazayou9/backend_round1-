public class StringConvert {
    public static void main(String[] args) {
        Object arr[] = {"boat", "art", "jui", "mai"};
        
        Object swapper[] = new Object[arr.length];
        
        
        for (int i = 0; i < arr.length; i++) {
            swapper[i] = arr[arr.length - 1 - i];
        }

        
        StringBuilder result = new StringBuilder("[");
        
        for (int i = 0; i < swapper.length; i++) {
            result.append("'").append(swapper[i]).append("'"); 
            if (i < swapper.length - 1) {
                result.append(", ");
            }
        }
        result.append("]"); 

        System.out.println(result.toString()); 
    }
    public static void swap(Object[] arr , int index1 , int index2) {
        Object temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
