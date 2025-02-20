
import java.util.Arrays;


public class ArrayValue_Calculation_for_Condition3 {

    public static void main(String[] args) {
        ArrayValue_Calculation_for_Condition3 acfd3 = new ArrayValue_Calculation_for_Condition3();

        int[] arr = {1, 2, 3};
        int target = 4;
        System.out.println(Arrays.toString(acfd3.adjustToAverage(arr, target)));
    }

    public int[] adjustToAverage(int[] arr, int target) {
        int cal = 0;

        for (int i = 0; i < arr.length; i++) {
            cal += arr[i];
        }

        int desiredsum = arr.length * target;

        int currentsum = desiredsum - cal;

        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }

        res[0] += currentsum;
        return res;
    }
}
