import java.util.Scanner;

public class RoundScore {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int score = kb.nextInt();
        int result = roundScore(score);
        System.out.println(result);
    }

    public static int roundScore(int score) {
        int lastDigit = score % 10;
        
        // เงื่อนไข 1: จบด้วย 3 หรือ 7
        if(lastDigit == 3) return score + 2;      // ปัดขึ้นไป 5
        if(lastDigit == 7) return score + 3;      // ปัดขึ้นไป 10
        
        // เงื่อนไข 2: จบด้วย 8 หรือ 9
        if(lastDigit == 8) return score + 2;      // ปัดขึ้นไป 10
        if(lastDigit == 9) return score + 1;      // ปัดขึ้นไป 10
        
        // เงื่อนไข 3: จบด้วย 1 หรือ 2
        if(lastDigit == 1) return score - 1;      // ปัดลงไป 0
        if(lastDigit == 2) return score - 2;      // ปัดลงไป 0
        
        // เงื่อนไข 4: คะแนนอื่นๆ (0,4,5,6)
        if(lastDigit <= 4) return score - lastDigit;  // ปัดลงไป 0
        return score + (5 - lastDigit);              // ปัดขึ้นไป 5
    }
}