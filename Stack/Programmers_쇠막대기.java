import java.util.*;
class Solution {
    public int solution(String arrangement) {
        int answer = 0;
        char[] str = new char[arrangement.length()];
        Stack s = new Stack();
        
        for(int i=0;i<arrangement.length();i++)
            str[i] = arrangement.charAt(i);
        
        for(int i=0;i<str.length;i++){
            if(str[i] == '(')
                s.push(str[i]);
            else{
                s.pop();
                if(str[i-1] == '(') // 레이저의 경우. 
                    answer = answer + s.size();
                else
                    answer++;
            }
        }
        
        return answer;
        
    }
}
