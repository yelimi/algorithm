import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<Integer> ();
        int sum = 0;
        int idx = 0;
        
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                
                sum = numbers[i] + numbers[j];
                
                if(list.indexOf(sum) < 0)   // 인자와 동일한 객체가 없으면 -1 리턴
                    list.add(sum);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int p=0;p<list.size();p++){
            answer[idx] = list.get(p);
            idx++;
        }
        
        Arrays.sort(answer);
        
        return answer;
        
    }
}
