public class Convetindex {
    public static void main(String[] args) {
        Object arr[] = {"boat", "art", "jui", "mai"};

        
        swap(arr, 1, 2);
        
       
        StringBuilder result = new StringBuilder("[");
        
        for (int i = 0; i < arr.length; i++) {
            result.append("'").append(arr[i]).append("'"); 
            if (i < arr.length - 1) {
                result.append(", "); 
            }
        }
        result.append("]"); 

        System.out.println(result.toString()); 
    }

    
    public static void swap(Object[] arr, int index1, int index2) {
        Object temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
