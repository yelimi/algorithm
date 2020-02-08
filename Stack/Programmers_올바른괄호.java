import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack stack = new Stack();
        
        if(s.charAt(0) == ')'){
            answer = false;
            return answer;
        }
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(')
                stack.push('(');
            else{
                if(stack.isEmpty()){
                    answer = false;
                    break;
                }
                stack.pop();
            }
        }
        
        if(!stack.isEmpty())
            answer = false;
        
        return answer;
        
    }
}
