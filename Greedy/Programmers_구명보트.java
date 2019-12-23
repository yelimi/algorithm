import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int x = people.length - 1;
        int y = 0; 
        
        Arrays.sort(people);
        
        for(int i=x;i>=y;i--){
            if(people[i] + people[y] <= limit){
                answer++;
                x--;
                y++;
            }
            else{
                x--;
                answer++;
            }
        }
        
        return answer;
    }
}
