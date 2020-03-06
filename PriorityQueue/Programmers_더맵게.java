import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        int sum = 0;
        PriorityQueue pq = new PriorityQueue();
        
        for(int i=0;i<scoville.length;i++)
            pq.offer(scoville[i]);
        
        while((int)pq.peek() < K){
            if(pq.size() == 1){
                answer = -1;
                break;
            }
            
            sum = (int)pq.poll();
            sum = sum + ((int)pq.poll() * 2);
            pq.offer(sum);
            answer++;
        }
        
        return answer;
        
    }
}
