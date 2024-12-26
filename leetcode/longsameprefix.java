
import java.util.Scanner;

public class longsameprefix {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Size : ");
        int size = kb.nextInt();
        String[] prefix = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter prefix " + (i + 1) + ": ");
            prefix[i] = kb.next();
        }
        longsameprefix ts = new longsameprefix();

        String same = ts.samePrefis(prefix);

        System.out.println(same);

    }

    public String samePrefis (String[] prefix){
        String string = "";
        for (int i = 0; i < prefix.length; i++) {
            char cI= prefix[0].charAt(i);
            boolean check = true;
            for (int j = 1; j < prefix.length; j++) {
                char cJ= prefix[j].charAt(i);
                if(cI != cJ){   
                    check = false;
                    break;
                }
            }
            if(check){
                string += cI;
            }
        }   
        return string;
    }
}
// หาคำนำหน้าที่เหมือนกัน อย่างเช่น 
// Input: strs = ["flower","flow","flight"]
// Output: "fl" 

// โดย flower , flow , flight จะมี fl เหมือนกัน
// output จะเท่ากับ "fl"

// โดยเราต้องเอาทุกตัวใน array มาเทียบกันให้หมด

// เก็บค่า prefix[i].charAt(i) ที่เหมือนกับ ค่า prefix[j].charAt(i) = string 

// ถ้าเหมือนกัน เก็บค่า 
// prefix[0].charAt(0) = 'f'//flower
// prefix[1].charAt(0) = 'f'//flow
// prefix[2].charAt(0) = 'f'// flight
// เหมือนกัน = true
// เก็บค่า = string
// prefix[0].charAt(1) = 'l'//flower
// prefix[1].charAt(1) = 'l'//flow
// prefix[2].charAt(1) = 'l'// flight
// เหมือนกัน = true
// เก็บค่า = string

// prefix[0].charAt(2) = 'o'//flower
// prefix[1].charAt(2) = 'o'//flow
// prefix[2].charAt(2) = 'i'//flight
// ไม่เหมือน = false
// หยุดการทำงาน