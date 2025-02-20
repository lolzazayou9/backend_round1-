
class ArrayPosition_Distance {

    public static void main(String[] args) {
        ArrayPosition_Distance apd = new ArrayPosition_Distance();

        int[] num = {5, 3, 2, 1, 7, 9};
        int target = 10;
        int[] result = apd.findClosestPair(num, target);

        System.out.println("["+result[0] + "," + result[1] + "] ");
    }

    public int[] findClosestPair(int[] arr, int target) {
        int min_value = Integer.MAX_VALUE; //กำหนดค่า มากที่สุด เพื่อไปหาค่าที่น้อยที่สุดในรอบแรก 
        int firstindex = -1; // เก็บ index i
        int scondindex = -1; // เก็บ index j
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) { // เพื่อไม่ให้ index ไปเช็คตัวเอง
                if (arr[i] + arr[j] == target) {
                    int distance = j - i; // เก็บค่า ระยะห่าง
                    if(distance < min_value){ // ถ้าระยะห่างใหม่ น้อยกว่า ระยะห่างกว่า 
                        min_value = distance; // เก็บค่าระยะห่างใหม่ที่น้อยกว่ามา
                        firstindex = i;
                        scondindex = j;
                    }
                }
            }
        }
        return new int[] {firstindex,scondindex};
    }

}
