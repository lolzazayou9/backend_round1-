import java.util.ArrayList;
import java.util.Scanner;
public class samearray {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter siez 1 : ");
        int size1 = kb.nextInt();
        String[] s1 = new String[size1];
        
        for (int i = 0; i < size1; i++) {
            System.out.print("Enter array1 : ");
            s1[i] = kb.next();
        }
        System.out.println("Enter siez 2 : ");
        int size2 = kb.nextInt();
        
        String[] s2 = new String[size2];
        for (int i = 0; i < size2; i++) {
            System.out.print("Enter array2 : ");
            s2[i] = kb.next();
        }

        samearray ts = new samearray();
        String[] sa = ts.arrayCheck(s1, s2);

        for (String element : sa) {
            System.out.println("ans : "+element);
        }
    }

    public String[] arrayCheck (String[] s1,String[] s2){
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if(s1[i].equals(s2[j]) && !result.contains(s1[i])){
                    result.add(s1[i]);
                    break;
                }
            }
        }
        return result.toArray(new String[0]);
    }
}

// i loop 
// i0 found = false 
// j loop
// j0
// if i == j and found = false
//  found = true
  

// (1,1,2,3) = i

// (1,1,2,3) = j

// ถ้าไม่ใส่ break;

// i0 = 1 
// i0 = j0 ? , i0 = j1 ? ,i0 = j2?

// i =0 j=0 เจอ เก็บ!, j=1 เจอ แต่ contain ห้ามไว้ , j=2 ไม่เจอ , j=3 ไม่เจอ
// i =1 เจอ แต่ contain ห้ามไว้ , ไม่เจอ , ไม่เจอ 
// i =2 ไม่เจอ , ไม่เจอ , เจอ เก็บ!, ไม่เจอ 
// i =3 ไม่เจอ , ไม่เจอ , ไม่เจอ , เจอ เก็บ !

// result.contain = (1,2,3)


