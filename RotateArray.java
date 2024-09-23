import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int num = 2; 
        int[] rotatedArray = rotateArray(array, num);
        System.out.println(Arrays.toString(rotatedArray)); 
    }

    public static int[] rotateArray(int[] arr, int num) {
        int length = arr.length;

        for (int i = 0; i < num; i++) {
            int firstElement = arr[0];
            for (int j = 0; j < length - 1; j++) {
                arr[j] = arr[j + 1]; 
            }
            arr[length - 1] = firstElement; 
        }

        return arr;
    }
}
