
import java.util.Arrays;

public class ArrayValue_Calculation_for_Condition4 {
    public static void main(String[] args) {
        ArrayValue_Calculation_for_Condition4 acfd4 = new ArrayValue_Calculation_for_Condition4();

        int[] arr = {1, 2, 3};
        int ta = 5;

        System.out.println(Arrays.toString(acfd4.increaseToAverage(arr, ta)));
    }

    public int[] increaseToAverage (int[] arr , int target){
        int cal = 0;

        for(int i = 0 ; i < arr.length ; i++){
            cal += arr[i];
        }

        int calavg = cal / arr.length;
    
        int desiredsum = arr.length * (target + 1);
        int currentsum = desiredsum - cal;
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }

        res[0] += currentsum;

        
        return res;
    }
}
