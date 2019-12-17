import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int num = 0;
        Queue q= new LinkedList();
        
        for(int i=0;i<progresses.length;i++){
            num = (100 - progresses[i]) % speeds[i];
            
            if(num==0)
                q.offer((100 - progresses[i]) / speeds[i]);
            else
                q.offer(((100 - progresses[i]) / speeds[i]) + 1);
        }
        
        int s_num = (int)q.poll();
        int count = 1;
        Queue result = new LinkedList();
        
        while(!q.isEmpty()){
            int n_num = (int)q.poll();

            if(s_num >= n_num)
                count++;
            else{
                result.offer(count);
                count = 1;
                s_num = n_num;
            }
        }
        result.offer(count);
        
        int[] answer = new int[result.size()];
        for(int i=0;i<answer.length;i++)
            answer[i] = (int)result.poll();
        
        return answer;
    }
}
