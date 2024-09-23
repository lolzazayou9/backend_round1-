import java.util.Scanner;

public class checkstring {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers separated by spaces:");
        String input = scanner.nextLine();
        String[] inputs = input.split(" ");
        for (String str : inputs) {
            try {
                int number = Integer.parseInt(str);
                intnumber(number); 
            } catch (NumberFormatException e) {
                System.out.println(str + " is not a number.");
            }
        }

    }
    public static void intnumber(int number){
        System.out.println(number);
    }
}
