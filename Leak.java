public class Leak {
    public static void main(String[] args) {
        int[] Alice = {1, 2, 3};
        int[] Bob = {7, 1, 3};
        int scoreA = 0;
        int scoreB = 0;

        for (int i = 0; i < Alice.length; i++) {
            if (Alice[i] > Bob[i]) {
                scoreA++;
            } else if (Bob[i] > Alice[i]) {
                scoreB++;
            }
        }

        System.out.println("Alice: " + scoreA);
        System.out.println("Bob: " + scoreB);
    }
}

