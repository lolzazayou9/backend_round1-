import java.util.Arrays;

public class arr3 {
    public static void main(String[] args) {
        arr3 ar3 = new arr3();

        int[] arr = {1, 3, 4, 8, 10};

        int[][] result = ar3.groupSimilar(arr);

        System.out.println(Arrays.deepToString(result));
    }

    public int[][] groupSimilar(int[] arr){
        // คำนวณจำนวนกลุ่ม (กลุ่มสุดท้ายอาจไม่ครบ 3 ค่า)
        int numGroups = (int) Math.ceil((double) arr.length / 3);
        
        int[][] result = new int[numGroups][];
        
        for (int i = 0; i < numGroups; i++) {
            int groupSize = Math.min(3, arr.length - i * 3);
            result[i] = new int[groupSize];
            
            for (int j = 0; j < groupSize; j++) {
                result[i][j] = arr[i * 3 + j];
            }
        }
        
        return result;
    }
    
}
