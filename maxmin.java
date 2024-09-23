import java.sql.Array;
import java.util.Arrays;

public class maxmin {
    public static void main(String[] args){
        int arr[] = {5,6,3,5,9,4};
        int sum = 0 ;
        sortArray(arr);
        System.out.println("Max: "+findMax(arr));
        System.out.println("Min:"+findMin(arr));
        System.out.println("sorting:"+Arrays.toString(arr));

        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
        }
        System.out.println("Sum : "+ sum);

    }

    public static int findMax(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMin(int[] arr){
        int min = arr[0];
        for(int i = 0; i < arr.length ; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void sortArray(int[] arr) {
        Arrays.sort(arr);  // ใช้ Arrays.sort() สำหรับ sort ข้อมูลนะจ๊ะ
    }
}
