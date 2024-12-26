import java.util.Calendar;
import java.util.Scanner;
public class carlendar {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year = kb.nextInt();
        System.out.println("Enter Month: ");
        int month = kb.nextInt();
        System.out.println("Enter Day: ");
        int day = kb.nextInt();
        // String[] datepart = input.split(",");

        // String year = datepart[0];
        // String month = datepart[1];
        // String day = datepart[2];



        String date = thaidate(year, month, day);
        
        System.out.println("Ans : "+ date);

    }

    public static String thaidate (int year ,int month , int day){
        Calendar cal = Calendar.getInstance();
        cal.set(year, month-1, day);

        int daynumber = cal.get(Calendar.DAY_OF_WEEK);

        String[] thaidate = {"", "วันอาทิตย์", "วันจันทร์", "วันอังคาร", 
        "วันพุธ", "วันพฤหัสบดี", "วันศุกร์", "วันเสาร์"};

        return thaidate[daynumber];
    }
}
