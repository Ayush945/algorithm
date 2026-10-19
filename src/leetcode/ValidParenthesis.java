package leetcode;
import java.util.*;
public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character>  stack = new Stack <Character>();

        for (int i=0;i<s.length();i++){
            char bracket=s.charAt(i);

            if(bracket=='{'||bracket=='('||bracket=='['){
                stack.push(bracket);
            }
            else{
                if (stack.isEmpty()) {
                    return false;
                }

                char storedBracket=stack.pop();
                if (bracket == ')' && storedBracket != '(') return false;
                if (bracket == '}' && storedBracket != '{') return false;
                if (bracket == ']' && storedBracket != '[') return false;
            }
        }
        return stack.isEmpty();
    }
}
