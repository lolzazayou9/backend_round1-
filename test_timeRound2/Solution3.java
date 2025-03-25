
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static void plusMinus(List<Integer> arr) {
        double plus = 0;
        double minus = 0;
        double zero = 0;
        for(int i = 0 ; i < arr.size();i++){
            if(arr.get(i) < 0){
                minus++;
            }else if(arr.get(i) >= 1){
                plus++;
            }else if(arr.get(i) == 0){
                zero++;
            }
        }
        System.out.println(plus/arr.size());
        System.out.println(minus/arr.size());
        System.out.println(zero/arr.size());
    }

}

public class Solution3 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
