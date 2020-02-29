import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        int num = 0;
        HashMap<String, Integer> map = new HashMap();
        
        for(int i=0;i<participant.length;i++){
            if(map.get(participant[i]) == null)
                map.put(participant[i], 1);
            else{
                num = map.get(participant[i]) + 1;
                map.put(participant[i], num);
            }
        }
        
        for(int i=0;i<completion.length;i++){
            num = map.get(completion[i]) - 1;
            map.put(completion[i], num);
        }
        
        for(String key : map.keySet()){
            if(map.get(key) != 0)
                answer = key;
        }
        
        return answer;
        
    }
}
