package leatbyi;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayCompare {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = kb.nextInt();
        
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        
        System.out.println("Enter first array:");
        for(int i = 0; i < size; i++) {
            arr1[i] = kb.nextInt();
        }
        
        System.out.println("Enter second array:");
        for(int i = 0; i < size; i++) {
            arr2[i] = kb.nextInt();
        }
        
        ArrayList<Integer> common = findCommon(arr1, arr2);
        System.out.println("Common elements: " + common);
    }

    public static ArrayList<Integer> findCommon(int[] arr1, int[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j] && !result.contains(arr1[i])) {
                    result.add(arr1[i]);
                }
            }
        }
        return result;
    }
}

