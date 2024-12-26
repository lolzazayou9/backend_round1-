
import java.util.Scanner;

public class twosum {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = kb.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = kb.nextInt();
        }

        System.out.print("Enter target sum: ");

        int sum = kb.nextInt();

        twosum ts = new twosum();
        int[] sums = ts.twosummethod(nums, sum);

        System.out.println(sums[0] + " " + sums[1]);

    }

    public int[] twosummethod(int[] nums, int sum) {
        //โจทรย์ต้องการ output = index 2ตัวรวมกันแล้วได้ ค่า sum 
        //input num {1,2,3} , sum = 3  
        //output = [0,1]

        //ใช้ 2 loop หรือ nested loop เพื่อคำนวณหรือเปรียบเทียบค่าใน array ถ้าหาค่า count หรือค่าเหมือนจะต้องใช้ j = 0 เพื่อให้ค่า index เหมือนกัน
        //ที่ code นี้ใช่ i+1 เพราะ ต้องการให้ loop i คือ ค่าแรก ส่วน loop j คือ ค่า 2 เพื่อให้สามารถหาค่า 2 index ที่สามารถหาค่า sum ได้
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == sum) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
