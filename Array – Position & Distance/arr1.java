
import java.util.Arrays;

public class arr1 {
    public static void main(String[] args) {
        arr1 n1 = new arr1();

        int[] arr = {1, 5, 9, 20};

        System.out.println(Arrays.toString(n1.maxDistance(arr)));
    }
    public int[] maxDistance(int[] arr){
        int[] result = {arr[0],arr[arr.length - 1]};

        return result;
    }
}
