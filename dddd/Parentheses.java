
import java.util.Stack;



class Parentheses {

    public static void main(String[] args) {
        Parentheses pr = new Parentheses();

        String str = "([])";

        System.out.println(pr.isValid(str));
        // Input:
        // s = "([])"

        // Output:
        // true
    }

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else if(c == ')' || c == '}' || c == ']'){
                if(stack.isEmpty()){
                    return false;
                }
                char open = stack.pop();
                if(open == '(' && c != ')' || open == '{' && c != '}' || open == '[' && c != ']'){
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}
