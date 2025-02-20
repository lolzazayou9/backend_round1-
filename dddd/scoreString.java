class scoreString {
    public static void main(String[] args) {
        scoreString st = new scoreString();

        String str = "zaz";

        System.out.println(st.scoreOfString(str));
    }

    public int scoreOfString(String s) {
        int score = 0;
        int sum = 0;

        for(int i = 0 ; i < s.length()-1 ; i++){
            int current = (int) s.charAt(i);
            int next = (int) s.charAt(i+1);
            sum = current - next;
        }
        return sum;
    }
}
