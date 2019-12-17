import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int sec = 0;
        Queue q = new LinkedList();
        
        for(int i=0;i<prices.length;i++){
            sec = 0;
            
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]<=prices[j])
                    sec++;
                else{
                    sec++;
                    break;
                }
            }
            
            q.offer(sec);
        }
        
        int[] answer = new int[q.size()];
        for(int i=0;i<answer.length;i++)
            answer[i] = (int)q.poll();
        
        return answer;
    }
}
