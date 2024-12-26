package leeakbyiAdv;

import java.util.HashSet;
import java.util.Scanner;

public class ArrayComparison {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Enter size of first array:");
        int size1 = kb.nextInt();
        int[] arr1 = new int[size1];
        for(int i = 0; i < size1; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            arr1[i] = kb.nextInt();
        }
        
        System.out.println("Enter size of second array:");
        int size2 = kb.nextInt();
        int[] arr2 = new int[size2];
        for(int i = 0; i < size2; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            arr2[i] = kb.nextInt();
        }
        
        findDuplicatesAndCommon(arr1, arr2);
    }
    
    public static void findDuplicatesAndCommon(int[] arr1, int[] arr2) {
        HashSet<Integer> dup1 = findDuplicates(arr1);
        HashSet<Integer> dup2 = findDuplicates(arr2);
        HashSet<Integer> common = new HashSet<>();
        
        for(int num : dup1) {
            if(dup2.contains(num)) {
                common.add(num);
            }
        }
        
        System.out.println("Duplicates in first array: " + dup1);
        System.out.println("Duplicates in second array: " + dup2);
        System.out.println("Common duplicates: " + common);
    }
    
    private static HashSet<Integer> findDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        
        for(int num : arr) {
            if(!set.add(num)) {
                duplicates.add(num);
            }
        }
        return duplicates;
    }
}
