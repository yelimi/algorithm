import java.util.*;

public class Solution {
	public int[] solution(int []arr) {
        Queue q = new LinkedList();
        int num = 10; //배열의 원소의 크기가 0~9이므로 무조건 만족. 
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] != num){
                q.offer(arr[i]);
                num = arr[i];
            }
        }
        
        int[] answer = new int[q.size()];
        for(int i=0;i<answer.length;i++)
            answer[i] = (int)q.poll();
        
        return answer;
        
	}
}
