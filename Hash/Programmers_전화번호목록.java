import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        int index = 1;
        HashMap<String, Integer> map = new HashMap();
        
        for(int i=0;i<phone_book.length;i++)
            map.put(phone_book[i], index);
        
        for(int i=0;i<phone_book.length;i++){
            for(int j=1;j<phone_book[i].length();j++){
                if(map.containsKey(phone_book[i].substring(0, j)))
                    answer = false;
            }
        }
        
        return answer;
        
    }
}
