
import java.util.Arrays;

public class ArrayValue_Calculation_for_Condition2 {
    public static void main(String[] args) {
        ArrayValue_Calculation_for_Condition2 acfd2 = new ArrayValue_Calculation_for_Condition2();

        int[] arr = {1, 2, 3, 4};

        System.out.println(Arrays.toString(acfd2.toEvenArray(arr)));
    }

    public int[] toEvenArray(int[] arr){
        int[] res = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] % 2 != 0){
                res[i] = arr[i] + 1;
            }else{
                res[i] = arr[i];
            }
        }
        return res;
    }
}
