import java.util.Arrays;

public class Checkstring2 {
    public static void main(String[] args) {
        String[] inputs = {"abc123def", "456ghi789", "test0test"};
        
        for (String input : inputs) {
            // ใช้ regex เพื่อแยกเลข
            String[] numbers = input.split("\\D+");
            
            // กรองค่าเปล่า
            numbers = Arrays.stream(numbers)
                    .filter(num -> !num.isEmpty())
                    .toArray(String[]::new);
            
            // แสดงผลสำหรับแต่ละสตริง
            System.out.println("Input: " + input + " -> Numbers: " + Arrays.toString(numbers));
        }
    }
}
