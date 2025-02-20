
public class Loop3 {

    public static void main(String[] args) {
        Loop3 lp3 = new Loop3();

        int n = 987;

        System.out.println(lp3.digitalRoot(n));
    }

    public int digitalRoot(int n) {
        // ถ้า n เป็น 0 หรือเลขหลักเดียวอยู่แล้ว ก็คืนค่าเลยได้เลย
        if (n < 10) {
            return n;
        }

        // คำนวณผลรวมของแต่ละหลัก
        int sum = 0;
        while (n > 0) {
            sum += n % 10; // sum += 987 % 10 = 7  i = 0
            n /= 10; // n = 987 / 10 = 98 i = 1
        }

        // เรียกฟังก์ชันตัวเองซ้ำหากยังไม่ใช่เลขหลักเดียว (ใช้ recursion)
        return digitalRoot(sum);
    }
}
