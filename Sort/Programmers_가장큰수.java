import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] list = new String[numbers.length];
        
        for(int i=0;i<numbers.length;i++)
            list[i] = String.valueOf(numbers[i]); // int를 String으로 변환. 
        
        Arrays.sort(list, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return (s2+s1).compareTo(s1+s2); // 내림차순 정렬. 
            }
        });
        
        if(list[0].equals("0"))
            return "0";
        
        for(int i=0;i<list.length;i++)
            answer = answer + list[i];
        
        return answer;
        
    }
}
