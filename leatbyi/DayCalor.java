package leatbyi;
import java.util.Scanner;

public class DayCalor{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter day: ");
        int day = kb.nextInt();
        System.out.print("Enter month: ");
        int month = kb.nextInt();
        System.out.print("Enter year: ");
        int year = kb.nextInt();
        
        int result = calculateDayOfYear(day, month);
        System.out.println("Day of year: " + result);
    }

    public static int calculateDayOfYear(int day, int month) {
        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        int total = day;
        
        for(int i = 0; i < month-1; i++) {
            total += daysInMonth[i];
        }
        return total;
    }
}