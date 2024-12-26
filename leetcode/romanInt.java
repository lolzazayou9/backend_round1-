
import java.util.Scanner;

public class romanInt {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("ROMAN : ");
        String s = kb.next();
        romanInt ts = new romanInt();

        int reualt = ts.romanToInt(s);
        System.out.println("number format : " + reualt);
        
    }

    public int romanToInt(String roman){
        int nums = 0;
        for (int i = 0; i < roman.length(); i++) {
            char c = roman.charAt(i);
            char next = (i + 1 < roman.length()) ? roman.charAt(i+1) : '\0';
            if(c == 'I' && next == 'V'){
                nums -= 1;
            }else if(c == 'V'){
                nums += 5;
            }else if(c == 'X'){
                nums += 10;
            }else if (c == 'L'){
                nums += 50;
            }else if(c == 'C'){
                nums += 100;
            }else if (c == 'D'){
                nums += 500;
            }else if(c == 'M'){
                nums += 1000;
            }else if(c == 'I'){
                nums += 1;
            }
        }
        return nums;
    }
}

// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000

// input s= LVIII
// output = 58

// string L = 50
// string V = 5
// string I = 1
// string I = 1
// string I = 1
// nums = 50 + 5 + 1 + 1 + 1 = 58

// string = MCMXCIV 

// c == M -> nums += 1000 -> string "M" = nums = 1000
// c == C -> nums += 100 -> string "MC" = nums = 1100
// c == M -> nums += 1000 -> string "MCM" = nums = 2100
// c == X -> nums += 10 -> string "MCMX" = nums = 2110








