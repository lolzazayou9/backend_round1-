package leatbyi;

import java.util.Scanner;

public class ScoreRounding {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter score: ");
        double score = kb.nextDouble();
        
        int result = roundScore(score);
        System.out.println("Rounded score: " + result);
    }

    public static int roundScore(double score) {
        if(score - Math.floor(score) > 0.5) {
            return (int) Math.ceil(score);
        } else {
            return (int) Math.floor(score);
        }
    }
}
