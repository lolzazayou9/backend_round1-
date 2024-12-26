package leeakbyiAdv;

import java.util.Scanner;

public class ScoreRounder {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Enter number of scores:");
        int n = kb.nextInt();
        double[] scores = new double[n];
        
        for(int i = 0; i < n; i++) {
            System.out.print("Enter score " + (i+1) + ": ");
            scores[i] = kb.nextDouble();
        }
        
        roundScores(scores);
    }
    
    public static void roundScores(double[] scores) {
        double sum = 0;
        int[] rounded = new int[scores.length];
        
        // Round first pass
        for(int i = 0; i < scores.length; i++) {
            rounded[i] = (int) Math.round(scores[i]);
            sum += rounded[i];
        }
        
        // Adjust based on total
        if(sum > 350) {
            for(int i = 0; i < scores.length; i++) {
                rounded[i] = (int) Math.floor(scores[i]);
            }
        } else {
            for(int i = 0; i < scores.length; i++) {
                rounded[i] = (int) Math.ceil(scores[i]);
            }
        }
        
        // Calculate new sum and average
        sum = 0;
        for(int score : rounded) {
            sum += score;
            System.out.print(score + " ");
        }
        System.out.println("\nTotal: " + sum);
        System.out.printf("Average: %.1f", sum/scores.length);
    }
}
