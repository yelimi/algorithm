import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int tmp = 0;
        List<Integer> three = new ArrayList<Integer>();
        
        while(true){
            three.add(n % 3);
            n = n / 3;
            if(n == 0)
                break;
        } 
        
        for(int i=0;i<three.size();i++){
            tmp = (int) (three.get(i) * Math.pow(3, three.size() - 1- i));
            answer = answer + tmp;
        }
        
        return answer;
    }
}
