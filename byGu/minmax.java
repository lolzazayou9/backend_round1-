
import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = kb.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = kb.nextInt();
        }

        minmax ts = new minmax();
        int[] reualt = ts.calminmax(nums);

        System.out.println("Ans"+" " + reualt[0] + " " + reualt[1]);
        
    }

    public int[] calminmax(int[] nums){
        int max = nums[0];
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > max){
                max = nums[i];
            }else if(nums[i] < min){
                min = nums[i];
            }
        }
        return new int[]{max,min};
    }
}
