public class arr4 {
    public static void main(String[] args) {
        arr4 ar4 = new arr4();

        int[] num = {1, 5, 3, 2, 4, 2, 5, 5,2,2,2};

        System.out.println(ar4.mostFrequent(num));
    }

    public int mostFrequent(int[] arr){
        int countFound = 0;
        int maxcount = 0;
        int maxvalue = arr[0];

        for(int i = 0 ; i < arr.length ; i++){
            countFound = 0;
            for(int j = i + 1; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    countFound++;
                }
            }
            if(countFound > maxcount){
                maxcount = countFound;
                maxvalue = arr[i];
            }
        }
        return maxvalue;
    }
}
