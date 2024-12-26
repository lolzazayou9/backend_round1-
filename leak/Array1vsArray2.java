
import java.util.Scanner;

public class Array1vsArray2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int size = kb.nextInt();
        int[] array1 = new int[size];
        int[] array2 = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter Array 1 : ");
            array1[i] = kb.nextInt();
        }
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter Array 2 : ");
            array2[i] = kb.nextInt();
        }

        int[] arraycompare = ArrayVS(array1, array2);

        System.out.print("Ans : (");
        for (int i = 0; i < arraycompare.length; i++) {
            System.out.print(arraycompare[i]);
            if (i < arraycompare.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(")");
    }

    public static int[] ArrayVS(int[] array1, int[] array2){
        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            if(array1[i] - array2[i] >= 10){
                result[i] = 2;
            }else if(array1[i] > array2[i]){
                result[i] = 1;
            }else if (array1[i] < array2[i]){
                result[i] = -1;
            }else if(array1[i] == array2[i]){
                result[i] = 0;
            }
        }
        return result;
    }
}
