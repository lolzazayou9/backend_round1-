

public class arr2 {

    public static void main(String[] args) {
        arr2 ar2 = new arr2();

        int[] arr = {1, 2, 3, 2, 1, 4, 5};

        ar2.findDuplicateIndices(arr);
    }

    public void findDuplicateIndices(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]+" : "+i + " " + j);
                }
            }
        }
    }
}
