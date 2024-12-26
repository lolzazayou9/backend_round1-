
import java.util.Scanner;

public class caltruck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            System.out.print("Please enter the package weight (kg): ");
            int weight = sc.nextInt();
            System.out.print("Please enter the distance (km): ");
            int km = sc.nextInt();

            Cost result = calculate(weight, km);

            System.out.println("");
            System.out.println("Shipping Cost Details");
            System.out.println("Weight: " + weight + " KG " + "(Cost: " + result.weightCost + " Baht)");
            System.out.println("Distance: " + km + " KM " + "(Additional cost: " + result.kmCost + " Baht)");
            int totalCost = result.weightCost + result.kmCost;
            System.out.println("Total shipping cost: " + totalCost + " Baht");
            System.out.println("");
            System.out.print("again ? (y/n) : ");
            String check = sc.next();
            if (check.equalsIgnoreCase("Y")) {
                loop = true;
            } else {
                loop = false;
            }
        }
    }

    public static Cost calculate(int weight, int km) {
        int weightCost = 0;
        if (weight < 1) {
            weightCost = 30;
        } else if (weight >= 1 && weight <= 5) {
            weightCost = 60;
        } else if (weight > 5) {
            weightCost = 100;
        } else {
            weightCost = 0;
        }

        int kmCost = 0;
        if (km > 50) {
            kmCost = (km - 50) * 10;
        } else {
            kmCost = 0;
        }

        return new Cost(weightCost, kmCost);
    }
}

class Cost {

    int weightCost;
    int kmCost;

    Cost(int weightCost, int kmCost) {
        this.weightCost = weightCost;
        this.kmCost = kmCost;
    }
}
