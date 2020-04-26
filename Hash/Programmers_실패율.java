import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        HashMap<Integer, Double> map = new HashMap();
        int cnt = 0;
        int down = stages.length;
        
        for(int j=1;j<=N;j++){
            down = down - cnt;
            cnt = 0;
            
            for(int i=0;i<stages.length;i++){
                if(j == stages[i])
                    cnt++;
            }
            
            if(cnt == 0)
                map.put(j, 0.0);
            else
                map.put(j, (double) cnt / down);
        } //실패율 구하기
        
        List<Map.Entry<Integer,Double>> list = new ArrayList<>(map.entrySet());
        //entrySet : 키와 값이 모두 필요한 경우
        list.sort(Collections.reverseOrder(Map.Entry.comparingByValue())); //내림차순 정렬
        
        HashMap<Integer, Double> result = new LinkedHashMap<>();
        //LinkedHashMap은 put을 통해 입력된 순서대로 Key가 보장
        for(Map.Entry<Integer, Double> entry : list)
            result.put(entry.getKey(), entry.getValue()); //정렬한 키와 값 넣기
        
        int idx = 0;
        for(int key : result.keySet()){
            answer[idx] = key;
            idx++;
        }
        
        return answer;
        
    }
}
