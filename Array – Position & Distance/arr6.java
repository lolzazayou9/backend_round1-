
import java.util.ArrayList;
import java.util.Arrays;

public class arr6 {

    public static void main(String[] args) {
        arr6 ar6 = new arr6();

        int[] num = {1, 2, 3, 2, 4, 5};
        int target = 2;

        System.out.println(Arrays.toString(ar6.findIndices(num, target)));
    }

    public int[] findIndices(int[] arr, int target) {
        ArrayList<Integer> tempList = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == target){
                tempList.add(i);
            }
        }
        int[] result = new int[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            result[i] = tempList.get(i);
        }

        return result;
    }
}
