
import java.util.Scanner;

public class NumbertoStreing {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = kb.next();

        NumbertoStreing ts = new NumbertoStreing();
        String ans = ts.numberToThai(s);
        System.out.println(ans);
    }

    public String numberToThai(String num) {
        StringBuilder result = new StringBuilder();
        String[] nums = {"", "หนึ่ง", "สอง", "สาม", "สี่", "ห้า", "หก", "เจ็ด", "แปด", "เก้า"};
        String[] digits = {"", "สิบ", "ร้อย", "พัน", "หมื่น", "แสน", "ล้าน"};

        if(num.startsWith("-")) {
            result.append("ลบ");
            num = num.substring(1);
        }

        int position = num.replaceAll(",", "").length(); // มี 4 ตัว 

        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            if (c == ',') {
                continue;
            } else {
                int digitnum = Character.getNumericValue(num.charAt(i));
                position --;

                if (position == 1 && digitnum == 2) {
                    result.append("ยี่สิบ");
                    continue;
                }
                if (position == 1 && digitnum == 1) {
                    result.append("สิบ");
                    continue;
                }


                if(position == 0 && digitnum == 1 && num.length() > 1){
                    result.append("เอ็ด");
                    continue;
                }

                if(digitnum == 0){
                    result.append("");
                    continue;
                }
                
                result.append(nums[digitnum]);
                result.append(digits[position]);
            }

        }

        return result.toString();
    }

}
