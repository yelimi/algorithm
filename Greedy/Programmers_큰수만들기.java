import java.util.*;
class Solution {
    public String solution(String number, int k) {
        char[] answer = new char[number.length() - k];
        Stack s = new Stack();
        
        for(int i=0;i<number.length();i++){
            while(!s.isEmpty() && number.charAt(i) > (char)s.peek() && k > 0){
                k--;
                s.pop();
            }
            s.push(number.charAt(i));
        }
        
        for(int i=0;i<answer.length;i++)
            answer[i] = (char)s.get(i);
        
        return new String (answer);
        
    }
}
