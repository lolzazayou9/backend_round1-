public class CovertBase10toBase2 {
    public static void main(String[] args) {
        int number = 123;

        System.out.println("Base 10 to Base 2 conversion:");
        String base2 = convertToBase2(number);
        System.out.println("Base 10: " + number + " -> Base 2: " + base2);

        System.out.println("\nBase 2 to Base 10 conversion:");
        int backToBase10 = convertToBase10(base2);
        System.out.println("Base 2: " + base2 + " -> Back to Base 10: " + backToBase10);

        // System.out.println("\nVerification of conversion accuracy:");
        // boolean isCorrect = (number == backToBase10);
        // System.out.println("Original: " + number + 
        //                    ", After conversion: " + backToBase10 + 
        //                    ", Correct: " + isCorrect);
    }

    public static String convertToBase2(int number) {
        if (number == 0) return "0";
        
        StringBuilder base2string = new StringBuilder();

        while (number > 0) {
            int remainder = number % 2;
            base2string.append(remainder); //.append คือการเก็บค่าในstring ในกรณีใช้เก็บค่า StringBuilder
            number /= 2;
        }

        return base2string.reverse().toString(); //.reverse ย้อนกลับ ในกรณีนี้คือ ซ้ายไปขวา
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

// หารเลขด้วย 2: นำเลขที่ต้องการแปลงมาหารด้วย 2
// บันทึกเศษ: เก็บเศษของการหาร ซึ่งจะเป็น 0 หรือ 1 : base2 = base10 % 2; ==> base2.tostring.append(base2);
// ทำซ้ำ: ใช้ผลลัพธ์จากการหาร (ผลลัพธ์เป็นจำนวนเต็ม) มาหารด้วย 2 อีกครั้ง และทำซ้ำขั้นตอนนี้จนกว่าผลลัพธ์จะเป็น 0  base10 /= 2;
// เรียงลำดับเศษ: เมื่อได้เศษทั้งหมดแล้ว ให้นำเศษที่ได้มาเรียงจากล่างขึ้นบน เพื่อให้ได้ผลลัพธ์เป็นเลขฐาน 2  .reverse();
