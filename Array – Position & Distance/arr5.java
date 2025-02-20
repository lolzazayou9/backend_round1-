public class arr5 {
    public static void main(String[] args) {
        arr5 ar5 = new arr5();

        int[] arr ={3, 1, 4, 1, 5, 9, 2};

        ar5.findMinMaxIndex(arr);
    }
    public void findMinMaxIndex(int[] arr){
        int maxvalue = arr[0];
        int maxindex = 0;
        int minvalue = arr[0];
        int minindex = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > maxvalue){
                maxvalue = arr[i];
                maxindex = i;
            }else if(arr[i] < minvalue){
                minvalue = arr[i];
                minindex = i;
            }
        }
        System.out.println("Min : " + minvalue + " , " + "Max : " + maxvalue + ", " + "MinIndex : " + minindex + ", " + "MaxIndex : " + maxindex);
    }
}
