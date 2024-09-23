public class sum {

    public static int addNumbers() {
        int sum = 0;
        Object arr[] = {1, 2, 3}; 
        for (Object item : arr) {
            if (item instanceof Integer) {
                sum += (Integer) item;
            } else {
                System.out.println("error");
            }
        }
        return sum;
    }
    public static void main(String[] args) {
            System.out.print("sum: " + addNumbers());
    }
}
