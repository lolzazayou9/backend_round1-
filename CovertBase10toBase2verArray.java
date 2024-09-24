import java.util.Scanner;

public class CovertBase10toBase2verArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("จำนวนครั้งที่ต้องการกรอกข้อมูล : ");
        int count = scanner.nextInt();
        
        int[] base10Numbers = new int[count];
        int base10[] = {123,456,789};
        int countarray = 0;
        System.out.println("ใส่ " + count + " จำนวน สำหรับเลขฐาน10 :");
        for (int i = 0; i < count; i++) {
            base10Numbers[i] = scanner.nextInt();
        }

        System.out.println("จำนวนกลุ่มข้อมูล : " + count);
        
        for(int i = 0 ; i < base10.length ; i++){
            countarray = base10.length;
        }

        System.out.println("จำนวนข้อมูลของ bae10[] : "+countarray);

        System.out.println("\nBase 10 to Base 2 conversion:");
        for (int num : base10Numbers) {
            String base2 = convertToBase2(num);
            System.out.println("Base 10: " + num + " -> Base 2: " + base2);
        }

        System.out.println("\nBase 2 to Base 10 conversion:");
        for (int num : base10Numbers) {
            String base2 = convertToBase2(num);
            int backToBase10 = convertToBase10(base2);
            System.out.println( 
                               "Base 2: " + base2 + 
                               " -> Back to Base 10: " + backToBase10);
        }

        // System.out.println("\nVerification of conversion accuracy:");
        // for (int num : base10Numbers) {
        //     String base2 = convertToBase2(num);
        //     int backToBase10 = convertToBase10(base2);
        //     boolean isCorrect = (num == backToBase10);
        //     System.out.println("Original: " + num + 
        //                        ", After conversion: " + backToBase10 + 
        //                        ", Correct: " + isCorrect);
        // }

        scanner.close();
    }

    public static String convertToBase2(int number) {
        if (number == 0) return "0";
        
        StringBuilder base2string = new StringBuilder();

        while (number > 0) {
            int remainder = number % 2;
            base2string.append(remainder);
            number /= 2;
        }

        return base2string.reverse().toString();
    }

    public static int convertToBase10(String binary) {
        int base10 = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                base10 += Math.pow(2, power);
            }
            power++;
        }
        return base10;
    }
}
// System.out.println("\nVerification of conversion accuracy:");
        // for (int num : base10Numbers) {
        //     String base2 = convertToBase2(num);
        //     int backToBase10 = convertToBase10(base2);
        //     boolean isCorrect = (num == backToBase10);
        //     System.out.println("Original: " + num + 
        //                        ", After conversion: " + backToBase10 + 
        //                        ", Correct: " + isCorrect);
        // }



//เริ่มจากขวา: '1' (power = 0)

// base10 = 0 + 2^0 = 1


// ตำแหน่งถัดไป: '1' (power = 1)

// base10 = 1 + 2^1 = 1 + 2 = 3


// ตำแหน่งถัดไป: '0' (power = 2)

// ไม่เพิ่มค่า เพราะเป็น 0


// ตำแหน่งสุดท้าย: '1' (power = 3)

// base10 = 3 + 2^3 = 3 + 8 = 11



// ดังนั้น "1011" ในฐาน 2 เท่ากับ 11 ในฐาน 10
