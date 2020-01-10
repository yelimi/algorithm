import java.util.*;
	class Solution {
	    public int solution(int[] priorities, int location) {
	        int answer = 1;
	        PriorityQueue pq = new PriorityQueue(Collections.reverseOrder()); // 내림차순.
	        
	        for(int i=0;i<priorities.length;i++)
	            pq.offer(priorities[i]);
	        
	        while(!pq.isEmpty()){
	            for(int i=0;i<priorities.length;i++){
	                if(priorities[i] == (int)pq.peek()){ // 숫자가 같다면.
	                    if(i == location) // 인덱스가 같다면.
	                        return answer;
	                    pq.poll();
	                    answer++;
	                }
	            }
	        }
	        
	       return answer;
	    }
	}
