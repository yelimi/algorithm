import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int w = 0;
        int sum = 0;
        Queue q = new LinkedList();
        
        for(int i=0;i<truck_weights.length;i++){
            w = truck_weights[i];
        
            while(true){
                if(q.isEmpty()){
                    q.offer(w);
                    answer++;
                    sum = sum + w;
                    break;
                }
                else if(q.size() == bridge_length)
                    sum = sum - (int)q.poll();
                else{
                    if(sum + w > weight){
                        q.offer(0);
                        answer++;
                    }
                    else{
                        q.offer(w);
                        answer++;
                        sum = sum + w;
                        break;
                    }
                }
            }
        }
        
        return answer + bridge_length;
    }
}
