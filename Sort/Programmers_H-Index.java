import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int n = citations.length;
        int h = 0; // 번. 
        int answer = 0;
        int count = 0; // 편. 

        Arrays.sort(citations);
        
        while(h<=citations[n-1]){
            count = 0;

            for(int i=0;i<n;i++){
                if(h<=citations[i])
                    count++;
            }

            if(h>=count){
                answer = count;
                break;
            }

            h++;
        }

        return answer;
    }
}
