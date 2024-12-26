package leeakbyiAdv;

import java.util.Calendar;
import java.util.Scanner;

public class DateCalculator {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter date (dd/mm/yyyy):");
        String date = kb.next();
        
        String[] parts = date.split("/");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);
        
        Calendar cal = Calendar.getInstance();
        cal.set(year, month-1, day);
        
        int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);
        int daysLeft = cal.getActualMaximum(Calendar.DAY_OF_YEAR) - dayOfYear;
        String dayOfWeek = getDayOfWeek(cal.get(Calendar.DAY_OF_WEEK));
        
        System.out.println("Day of year: " + dayOfYear);
        System.out.println("Days left in year: " + daysLeft);
        System.out.println("Day of week: " + dayOfWeek);
        
        if(month == 12 && day == 25) {
            System.out.println("This is Christmas Day!");
        }
    }
    
    private static String getDayOfWeek(int day) {
        String[] days = {"", "อาทิตย์", "จันทร์", "อังคาร", "พุธ", "พฤหัสบดี", "ศุกร์", "เสาร์"};
        return "วัน" + days[day];
    }
}
