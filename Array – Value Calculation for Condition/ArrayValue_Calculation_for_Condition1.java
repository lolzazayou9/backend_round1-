
import java.util.Arrays;


class ArrayValue_Calculation_for_Condition1{
    public static void main(String[] args) {
        ArrayValue_Calculation_for_Condition1 acfd1 = new ArrayValue_Calculation_for_Condition1();

        int[] arr = {1, 2, 3};
        int target = 10;

        System.out.println(Arrays.toString(acfd1.adjustArrayToTarget(arr, target)));
    }

    public int[] adjustArrayToTarget(int[] arr,int target){
        int cal = 0 ; 
        for(int i = 0 ; i < arr.length ; i++){
            cal += arr[i];
        }

        int diff = target - cal;

        int[] res = new int[arr.length];

        for(int i = 0 ; i < arr.length ;i++){
            res[i] = arr[i];
        }

        res[0] += diff;
        return res;
    }
}