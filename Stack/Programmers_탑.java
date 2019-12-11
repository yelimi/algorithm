import java.util.*;
class Solution {
    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        Stack stack = new Stack();
        
        for(int i=0;i<heights.length;i++){
            stack.push(heights[i]);
        }
        
        for(int i=heights.length-1;i>=0;i--){
            int temp = (int) stack.pop();
            for(int j=i-1;j>=0;j--){
                if(temp<heights[j]){
                    answer[i] = j+1;
                    break;
                }
            }
        }
        
        return answer;
    }
}
